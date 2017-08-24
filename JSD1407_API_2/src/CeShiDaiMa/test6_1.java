package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test6_1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("dili.txt","r");
		byte[] buf = new byte[50];
		sdf.read(buf);
		String str = new String(buf);
		System.out.println(str);
	}

}
