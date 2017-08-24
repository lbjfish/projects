package CeShiDaiMa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class test18_1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("asd.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		int d;
		while((d=isr.read())!=-1){
			char c = (char)d;
			System.out.print(c);
		}
		isr.close();
	}

}
