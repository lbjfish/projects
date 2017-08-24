package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test4 {
	public static void main(String[] args) throws IOException{
		
		RandomAccessFile sdf = new RandomAccessFile("demo.txt","rw");
		
		sdf.write(97);
		sdf.write(98);
		sdf.write(88);
		
		sdf.close();
	}

}
