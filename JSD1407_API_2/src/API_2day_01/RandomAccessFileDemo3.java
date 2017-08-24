package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 1.创建一个RandomAccessFile用于读取待复制的文件
 * 2.创建一个RandomAccessFile用于将原文件中的数据写入该文件
 * 3.循环从源文件中读取每一个字节并写入目标文件中
 * 4.关闭两个RandomAccessFile
 * @author soft01
 *
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException{
		long start = System.currentTimeMillis();
		//1
		RandomAccessFile src = new RandomAccessFile("meinv.jpg","r");
		
		//2
		RandomAccessFile des = new RandomAccessFile("copy.jpg","rw");
		
		//3
	   int d;
		while((d = src.read()) != -1){  //如果读到-1 说明读到文件末尾
			des.write(d);
		}
		
		//4
		System.out.println("拷贝完毕");
		src.close();
		des.close();
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start)+"ms");
	}

}
