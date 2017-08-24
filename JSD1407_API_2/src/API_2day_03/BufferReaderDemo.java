package API_2day_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * BufferedReader
 * 缓冲字符输入流
 * 可以以行为单位读取字符串
 * @author soft01
 *
 */
public class BufferReaderDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("pw1.txt");
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		BufferedReader br = new BufferedReader(isr); //一行读一行，速度比InputStreamReader快
		/**
		 * String readLine（）
		 * 一次读取一行字符串，该方法会判断读取到换行符为止，将之前的一行
		 * 字符串返回
		 * 若该方法返回的字符串为null，说明没有数据可读了
		 */
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}

}
