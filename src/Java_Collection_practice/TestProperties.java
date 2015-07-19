package Java_Collection_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * properties 文件在 Java 中对一个的是一个 Properties 类的对象
		 */
		//1. 创建一个 Properties 类的对象
		Properties properties = new Properties();
		
		//2. 使用 IO 流加载对应的 properties 文件
		properties.load(new FileInputStream("jdbc.properties"));
		
		//3. 得到对应的属性值
		String url = properties.getProperty("url");
		
		System.out.println(url); 
	}

}
