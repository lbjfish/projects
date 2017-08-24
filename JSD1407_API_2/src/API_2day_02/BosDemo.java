package API_2day_02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流写出数据的注意事项
 * @author soft01
 *
 */
public class BosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("xix3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "伟大领袖毛主席";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		/*
		 * 强制将当前缓冲流中的缓冲区中的数据全部写出，
		 * 无论缓冲区是否被装满
		 */
		bos.flush();
		//close时，也会自动调用一次flush
		bos.close();
	}

}
