package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class zuoYe1 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		testWrite();
	}
	public static void testWrite() throws FileNotFoundException, UnsupportedEncodingException{
		FileOutputStream iis = new FileOutputStream("pw2.txt");
		OutputStreamWriter fis = new OutputStreamWriter(iis,"UTF-8");
		PrintWriter pw = new PrintWriter(fis);
		//PrintWriter pw = new PrintWriter(osw,true);
		pw.println("大家好!");
		pw.println("hello!");
		pw.println("bye!");
		pw.print("大家好!");
		pw.print("hello!");
		pw.print("bye!");
		System.out.println("写完毕");
		pw.close();
	}
}
