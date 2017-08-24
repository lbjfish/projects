package API_2day_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class zuoYe1_1 {
	public static void main(String[] args) throws IOException{
		testRead();
	}
	public static void testRead() throws IOException{
		FileInputStream fis = new FileInputStream("pw2.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader buf = new BufferedReader(isr);
		
		String str;
		while((str=buf.readLine())!=null){
			System.out.println(str);
		}
		buf.close();
	}

}
