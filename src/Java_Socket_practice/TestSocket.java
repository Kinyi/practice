package Java_Socket_practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestSocket {
	
	/*
	 * URL(Uniform Resource Locator)：统一资源定位符，它表示 Internet 上某一资源的地址。
	 * URL的基本结构由5部分组成：<传输协议>://<主机名>:<端口号>/<文件名>
	 */
	@Test
	public void testURL() throws IOException{
		URL url = new URL("http://127.0.0.1:8080/examples/abcd.txt");

		System.out.println(url.getPath());
		System.out.println(url.getQuery()); 
		
		URLConnection urlConnection = url.openConnection();
		System.out.println(urlConnection); 
		
		InputStream in = urlConnection.getInputStream();
		OutputStream out = new FileOutputStream("test.txt");
		
		byte [] buffer = new byte[1024];
		int len = 0;
		
		while((len = in.read(buffer)) != -1){
			out.write(buffer, 0, len);
		}
		
		in.close();
		out.close();
	}

	@Test
	public void testInetAddress() throws UnknownHostException{
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address);
		
		InetAddress address2 = InetAddress.getLocalHost();
		System.out.println(address2);
	}
	
	@Test
	public void testServerSocket() throws IOException{
		ServerSocket serverSocket = new ServerSocket(8686);
		Socket socket = serverSocket.accept();
		
		FileInputStream in = new FileInputStream("hello.txt");
		OutputStream out = socket.getOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len=in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		
		out.close();
		in.close();
		
		socket.close();
		serverSocket.close();
	}
	
	@Test
	public void testClientSocket() throws IOException{
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address, 8686);
		//Socket socket = new Socket("127.0.0.1",8686);
		
		InputStream in = socket.getInputStream();
		FileOutputStream out = new FileOutputStream("E://martin/hello.txt");
		
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len=in.read(buffer))!=-1) {
			out.write(buffer,0,len);
		}
		
		out.close();
		in.close();
		
		socket.close();
	}
	
	@Test
	public void testSocket() throws IOException{
		InetAddress address = InetAddress.getByName("127.0.0.1");
		//创建 Socket 对象: 同时也向服务端发出请求
		Socket socket = new Socket(address, 8989);
		
		//通过 输入输出流 和服务端进行交互
		InputStream in = socket.getInputStream();
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(in));
		System.out.println("^_^: " + reader.readLine());
		
		in.close();
		reader.close();
		
		//关闭 Socket
		socket.close();
	}
	
	@Test
	public void testServerSocket2() throws IOException{
		//创建 ServerSocket 对象
		ServerSocket serverSocket = new ServerSocket(8989);
		//接受客户端的请求, 并得到 Socket 对象
		Socket socket = serverSocket.accept();
	
		//通过 输入输出流 和客户端进行交互
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out);
		writer.write("来自服务端的问候.");
		
		writer.close();
		out.close();
		
		//关闭 Socket 资源. 
		socket.close();
		serverSocket.close();
	}

}
