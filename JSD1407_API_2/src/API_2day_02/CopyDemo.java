package API_2day_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ����ֽ����������ʵ���ļ��ĸ���
 * @author soft01
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("meinv.jpg");
		
		FileOutputStream fos = new FileOutputStream("copy1.jpg");
		
		byte[] buf = new byte[1024*10];
		int d;
		while((d=fis.read(buf))!=-1){
			fos.write(buf,0,d);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
	}

}
