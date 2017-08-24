package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入基本数据类型
 * @author soft01
 *
 */
public class RandomAccessFileDemo7 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		int num = Integer.MAX_VALUE;
		//将int值写入文件
		/**
		 * 01111111 11111111 11111111 11111111
		 * num>>>24
		 */
//		raf.write(num>>>24);  //向后移24次
//		raf.write(num>>>16);  //向后移16次
//		raf.write(num>>>8);   //向后移8次
//		raf.write(num);
		
		//连续写4个字节，将int值写出
		raf.writeInt(num);   //同上 简易写法
		
		raf.writeDouble(1.4);
		
		raf.writeLong(1234456461);
		
		raf.close();
	}

}
