package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile���ڶ�д�ļ����ݵ���
 * @author soft01
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * ����Ŀ��Ŀ¼��һ����Ϊdemo.dat
		 * ���ļ����ݽ��ж�д
		 */
		RandomAccessFile raf = new RandomAccessFile("demo.dat","rw");
		
		//ͬ��
//		File file = new File("demo.txt");
//		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		
		/*
		 * void wirte(int n)
		 * д������intֵ��"��8λ"
		 * ֻд1���ֽ�
		 * 00000000 00000000 000000000 00000000
		 */
		//int num = 1;
      raf.write(1);
      raf.write(97);
		raf.write(-1);
		/*
		 * ʹ��IO��һ��Ҫ�ǵùر�
		 */
		raf.close();
	}

}
