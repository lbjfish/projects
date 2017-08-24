package API_2day_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 使用字符流复制文本文件
 * @author soft01
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("/home/soft01/workspace/JSD1407_API_2/src/API_2day_03/CopyDemo.java");
		
		FileOutputStream fos = new FileOutputStream("CopDemo.java");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		int d;
		while((d=isr.read())!=-1){
			osw.write(d);
		}
		System.out.println("拷贝完毕");
		isr.close();
		osw.close();
	}

}
