package CeShiDaiMa;

import java.io.FileInputStream;
import java.io.IOException;

public class test11_3 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("cao.dat");
		
		int i = fis.read();
		System.out.println(i);
		
		byte[] buf = new byte[50];
		fis.read(buf);
		String str = new String(buf,"UTF-8");
		System.out.println(str);
		fis.close();
		
	}

}
