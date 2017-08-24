package CeShiDaiMa;

import java.io.IOException;
import java.io.RandomAccessFile;

public class test7 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile sdf = new RandomAccessFile("zhi.dat","rw");
		int i = Integer.MAX_VALUE;
		sdf.writeInt(i);
		sdf.writeDouble(47);
		sdf.writeLong(46576);
		String str = "sdafgsg";
		sdf.writeChars(str);
		sdf.close();
	}

}
