package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test9 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("sda.dat","r");
		
		sdf.skipBytes(0);
		int n = sdf.read();
		System.out.println(sdf.getFilePointer());
		System.out.println(n);
		sdf.close();
	}

}
