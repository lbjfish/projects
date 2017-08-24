package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test4_1 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("demo.txt","r");
		
		System.out.println(sdf.read());
		System.out.println(sdf.read());
		System.out.println(sdf.read());
		System.out.println(sdf.read());
		System.out.println(sdf.read());
		sdf.close();
	}

}
