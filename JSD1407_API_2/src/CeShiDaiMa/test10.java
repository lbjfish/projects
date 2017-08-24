package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class test10 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("dili.txt","rw");
		String str = "dsadas";
		byte[] buf = str.getBytes("GBK");
		sdf.write(buf);
		System.out.println("Ð´Íê±Ï");
		sdf.close();
	}
}
