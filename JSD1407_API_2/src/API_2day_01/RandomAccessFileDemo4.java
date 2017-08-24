package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 批量写一组字节
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
		
		String str = "我爱北京天安门";
		/*
		 * String的getBytes()方法：
		 * 将当前字符串
		 */
		byte[] buf = str.getBytes("UTF-8"); //把字符串转换为字符数组，并转换成GBK国标编码
		raf.write(buf);
		raf.close();
	}

}
