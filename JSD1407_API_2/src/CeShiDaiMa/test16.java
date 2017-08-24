package CeShiDaiMa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test16 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("testli.txt");
		OutputStreamWriter osr = new OutputStreamWriter(fos);
		FileInputStream fis = new FileInputStream("src/CeShiDaiMa/test16.java");
		InputStreamReader isr = new InputStreamReader(fis);
		
		int d;
		while((d=isr.read())!=-1){
			osr.write(d);
		}
		osr.close();
		isr.close();
	}

}
