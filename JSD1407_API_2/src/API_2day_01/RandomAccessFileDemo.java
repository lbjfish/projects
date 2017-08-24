package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile用于读写文件数据的类
 * @author soft01
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 对项目跟目录下一个名为demo.dat
		 * 的文件内容进行读写
		 */
		RandomAccessFile raf = new RandomAccessFile("demo.dat","rw");
		
		//同上
//		File file = new File("demo.txt");
//		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		
		/*
		 * void wirte(int n)
		 * 写出给定int值的"低8位"
		 * 只写1个字节
		 * 00000000 00000000 000000000 00000000
		 */
		//int num = 1;
      raf.write(1);
      raf.write(97);
		raf.write(-1);
		/*
		 * 使用IO后，一定要记得关闭
		 */
		raf.close();
	}

}
