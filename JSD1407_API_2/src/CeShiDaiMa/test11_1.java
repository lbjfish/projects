package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;

public class test11_1 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("cao.dat");
		
		fos.write(97);
		
		String str = "我去你妈了隔壁";
		byte[] buf = str.getBytes("UTF-8");
		fos.write(buf);
		System.out.println("写完毕");
		fos.close();
	}

}
