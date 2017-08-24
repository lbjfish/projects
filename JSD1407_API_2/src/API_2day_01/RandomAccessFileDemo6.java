package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 基于缓存形式复制文件
 * 一次读10K个字节
 * @author soft01
 *
 */
public class RandomAccessFileDemo6 {
	public static void main(String [] args) throws IOException{
		RandomAccessFile src = new RandomAccessFile("meinv.jpg","r");
		RandomAccessFile des = new RandomAccessFile("copy.jpg","rw");
		
		long start = System.currentTimeMillis();
		
		byte[] buf = new byte[1024*10];  //（加快读取效率）一次读取10K个字节，一般极限速度就是10K
		
		int len;
		/*
		 * int read(byte[] buf)
		 */
		while((len=src.read(buf))!=-1){
			/*
			 * void write(byte[] b,int offset,int len)
			 * 该方法的作用是将给定的字节数组中offset出开始，连续len个字节写出
			 */
			des.write(buf,0,len );
		}
		
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start)+"ms");
	}
}
