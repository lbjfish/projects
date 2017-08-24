package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test10_1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("dili.txt","r");
		byte[] buf = new byte[50];
		sdf.read(buf);
		String str = new String(buf,"UTF-8");
		System.out.println(str);
		sdf.close();
	}

}
