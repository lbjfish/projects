package CeShiDaiMa;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test13 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("dida.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "最牛比的是调整心情";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		
		bos.flush();
		
		bos.close();
	}

}
