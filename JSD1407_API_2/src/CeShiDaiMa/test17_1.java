package CeShiDaiMa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class test17_1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("pw1.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		/**
		 * 字符串输出是横着输出
		 */
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		/**
		 * 字符输出是竖着输出  
		 */
//		int d;
//		while((d=br.read())!=-1){
//			char c = (char)d;
//			System.out.println(c);
//		}
		
		br.close();
	}

}
