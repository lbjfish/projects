package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class test6 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("dili.txt","rw");
		String str = "��˵����ô��ô����";
		byte[] buf = str.getBytes("UTF-8");
		sdf.write(buf);
		System.out.println("д���");
		sdf.close();
	}

}
