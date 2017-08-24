package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class test17 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		OutputStreamWriter osr = new OutputStreamWriter(fos,"UTF-8");
		PrintWriter pw = new PrintWriter(osr);
		
		pw.println("我在北京");
		pw.println("我还在为梦想拼");
		
		System.out.println("写完毕");
		pw.close();
	}

}
