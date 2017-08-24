package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;

public class test11_2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("cao.dat",true);
		fos.write(99);
		System.out.println("Ð´Íê±Ï");
		fos.close();
	}

}
