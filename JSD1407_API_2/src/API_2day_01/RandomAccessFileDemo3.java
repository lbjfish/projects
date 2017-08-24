package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 1.����һ��RandomAccessFile���ڶ�ȡ�����Ƶ��ļ�
 * 2.����һ��RandomAccessFile���ڽ�ԭ�ļ��е�����д����ļ�
 * 3.ѭ����Դ�ļ��ж�ȡÿһ���ֽڲ�д��Ŀ���ļ���
 * 4.�ر�����RandomAccessFile
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
		while((d = src.read()) != -1){  //�������-1 ˵�������ļ�ĩβ
			des.write(d);
		}
		
		//4
		System.out.println("�������");
		src.close();
		des.close();
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+(end-start)+"ms");
	}

}
