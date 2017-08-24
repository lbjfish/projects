package CeShiDaiMa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class test5 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("PPT.png","r");
		
		RandomAccessFile sof = new RandomAccessFile("cooo.jpg","rw");
		
		long first = System.currentTimeMillis();
		byte[] suf = new byte[1024*10];
		int d;
		while((d=sdf.read(suf))!=-1){
			sof.write(suf,0,d);
		}
		
		System.out.println("¸´ÖÆÍê±Ï");
		long last = System.currentTimeMillis();
		//long ys = (last-first)/1000;
		System.out.println((last-first)+"ms");
		sdf.close();
		sof.close();
	}

}
