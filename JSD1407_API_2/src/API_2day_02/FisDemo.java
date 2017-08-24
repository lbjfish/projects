package API_2day_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream
 * 节点流
 * 用于从文件中读取字节的流
 * @author soft01
 *
 */
public class FisDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.dat");
		
		int i = fis.read();
		System.out.println(i);
		
		byte[] buf = new byte[21];
		fis.read(buf);
		String str = new String(buf,"UTF-8");
		System.out.println(str);
	
		fis.close();
	}

}
