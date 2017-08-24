package CeShiDaiMa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test12 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("123.jpg");
		FileOutputStream fos = new FileOutputStream("dsa.jpg");
		
		long first = System.currentTimeMillis();
		byte[] buf = new byte[1024*10];
		int d;
		while((d=fis.read(buf))!=-1){
			fos.write(buf,0,d);
		}
		
		long last = System.currentTimeMillis();
		System.out.println("¸´ÖÆÍê±Ï");
		System.out.println("ºÄÊ±£º"+(last-first)+"ms");
		
		fis.close();
		fos.close();
	}

}
