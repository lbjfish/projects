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
		
		pw.println("���ڱ���");
		pw.println("�һ���Ϊ����ƴ");
		
		System.out.println("д���");
		pw.close();
	}

}
