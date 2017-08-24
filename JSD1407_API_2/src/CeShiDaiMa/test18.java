package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class test18 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("asd.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("最难的不是刻意维持");
		osw.write("而是能忍住很多");
		osw.close();
	}

}
