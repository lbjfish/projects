package API_2day_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class test {
	public static void main(String[] args){
		testWrite();
		testReader();
	}
	
      public static void testWrite(){
	  	   FileOutputStream fis = null;
	  	   OutputStreamWriter ous = null;
	  	   PrintWriter prs = null;
		try {
			fis = new FileOutputStream("pw3.txt");
			ous = new OutputStreamWriter(fis);
			prs = new  PrintWriter(ous);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   prs.println("大家好!");
		   prs.println("hello!");
		   prs.println("bye!"); 
		   System.out.println("写完毕");
		   prs.close();
   }
           public static void testReader(){
		   FileInputStream fis = null;
		   InputStreamReader ous = null;
		   BufferedReader buf = null;
		   try {
			fis = new FileInputStream("pw3.txt");
			ous = new InputStreamReader(fis);
			buf = new  BufferedReader(ous);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str;
		StringBuilder all = new StringBuilder();
		try {
			while((str=buf.readLine())!=null){
				all.append(str);
				System.out.println(str); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			buf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(all);
	   }
}
