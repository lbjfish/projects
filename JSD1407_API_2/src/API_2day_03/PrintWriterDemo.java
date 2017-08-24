package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter
 * 缓冲字符输出流，带有自动行刷新
 * 可以以 行 为单位写出字符串
 * @author soft01
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.println("我在北京");
		pw.println("快使用爽接滚");
		
		System.out.print("写完毕");
		pw.close();
	}

}
