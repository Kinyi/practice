package Java_IO_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.junit.Test;

public class TestIO {

	@Test
	public void testFile() throws IOException {

		File file = new File("hello.txt");
		String name = file.getName();
		System.out.println(name);

		FileInputStream in = new FileInputStream("hello.txt");
		int result = in.read();
		while (result != -1) {
			System.out.print((char) result);
			result = in.read();
		}
		in.close();
	}

	@Test
	public void testOutputFile() throws IOException {
		FileOutputStream out = new FileOutputStream("output.txt");
		String content = "hello world!";
		out.write(content.getBytes());
		out.close();
	}

	@Test
	public void testCopyFile() throws IOException {
		
		 //read the content of hello.txt 
		 FileInputStream in = new FileInputStream("hello.txt");
		 byte[] buffer = new byte[5];
		 //in.read(buffer); 
		 //copy to the copy.txt 
		 int len = 0;
		 FileOutputStream out = new FileOutputStream("copy.txt"); 
		 while ((len = in.read(buffer))!=-1) {
			//System.out.println(len);
			out.write(buffer, 0, len);
		 }
		 //out.write(buffer); 
		 in.close();
		 out.close();
		 

		 /*		// 1. 创建定位到 hello.txt 的文件的输入流
		InputStream in = new FileInputStream("hello.txt");

		// 2. 创建定位到 hello2.txt 的文件输出流
		OutputStream out = new FileOutputStream("copy.txt");

		// 3. 创建一个 byte 数组, 用于读写文件
		byte[] buffer = new byte[1024 * 10];
		int len = 0;

		// 4. 读写文件:
		// in.read(buffer); out.write(buffer, 0, len);
		while ((len = in.read(buffer)) != -1) {
			System.out.println(len);
			out.write(buffer,0,len);
		}

		// 5. 关闭流资源.
		out.close();
		in.close();*/
	}

}
