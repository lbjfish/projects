package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import API_2day_04.ProducerConsumer.Product;

/**
 * PrintWriter
 * 缓冲字符输出流，带有自动行刷新
 * 可以以 行 为单位写出字符串
 * @author soft01
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		                 
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		/*
		 * 创建具有自动行刷新的PrintWriter后，每当我们使用println
		 * 方法写出字符串后，都会自动flush。但一定要清楚：这无疑会增加
		 * 写出次数
		 * 
		 * 如果需要即时性（像QQ）才这么该干，否则会增加负担
		 */
		PrintWriter pw = new PrintWriter(osw,true);//相当与每pw.println（"dsakj"）;都要fulush一次
		
		pw.println("我在北京");
		pw.println("快使用爽接滚");
		System.out.print("写完毕");
		pw.close();
	}

}
