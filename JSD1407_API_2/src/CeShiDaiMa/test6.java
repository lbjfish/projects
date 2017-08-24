package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class test6 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("dili.txt","rw");
		String str = "我说话怎么那么罗嗦";
		byte[] buf = str.getBytes("UTF-8");
		sdf.write(buf);
		System.out.println("写完毕");
		sdf.close();
	}

}
