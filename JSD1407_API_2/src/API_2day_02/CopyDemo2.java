package API_2day_02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率
 * @author soft01
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("PPT页面.png");
		FileOutputStream fos = new FileOutputStream("copy3.png");
		
		BufferedInputStream bis =new BufferedInputStream(fis);
		long start = System.currentTimeMillis();
		byte[] buf = new byte[1024*10];
		int d;
		while((d=bis.read(buf))!=-1){
			fos.write(buf,0,d);
		}
		System.out.println("复制完毕");
		long end = System.currentTimeMillis();
		System.out.println(end-start+"ms");
		bis.close();
		fos.close();
	}

}
