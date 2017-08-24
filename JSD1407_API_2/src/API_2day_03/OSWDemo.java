package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter
 * 字符输出流，以字符为单位写出数据
 * 字符流只用与读写字符数据
 * @author soft01
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		/**
		 * 向文件中写出文本数据（写字符串）
		 * 1.向文件中写数据（FileOutputStream）
		 * 2.写的是文本数据（）
		 */
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//使用字符流处理字节流
		/**
		 * OutputStreamWrite的特点是可以将给定的字符串按照特定的字符集
		 * 转换为字节后写出
		 * 使用构造方法：
		 * OutputStreamWriter(OutputStream out,String charsetName);
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");//灵活可以想转什么就转什么
		//这样就可以直接写字符串了
		osw.write("大家好才是真的好");
		osw.write("呵呵");
		osw.close();
	}

}
