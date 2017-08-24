package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test7_1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("zhi.dat","r");

		System.out.println(sdf.readInt());
		
		System.out.println(sdf.read());
		System.out.println(sdf.readDouble());
		System.out.println(sdf.readLong());
		System.out.println(sdf.readChar());
		sdf.close();
	}

}
