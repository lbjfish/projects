package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test8 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("sda.dat","rw");
		
		long p = sdf.getFilePointer();
		System.out.println(p);
		
		sdf.write(97);
		System.out.println(sdf.getFilePointer());
		
		sdf.writeInt(1);
		System.out.println(sdf.getFilePointer());
		
		sdf.seek(0);
		int n = sdf.read();
		System.out.println(sdf.getFilePointer());
		System.out.println(n);
		sdf.close();

	}

}
