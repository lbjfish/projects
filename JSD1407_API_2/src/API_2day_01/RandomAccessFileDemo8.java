package API_2day_01;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo8 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		int i = raf.readInt();
		System.out.println(i);
		
		double d = raf.readDouble();
		System.out.println(d);
		
		long l = raf.readLong();
		System.out.println(l);
		
		raf.close();
	}

}
