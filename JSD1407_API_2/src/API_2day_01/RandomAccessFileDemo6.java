package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڻ�����ʽ�����ļ�
 * һ�ζ�10K���ֽ�
 * @author soft01
 *
 */
public class RandomAccessFileDemo6 {
	public static void main(String [] args) throws IOException{
		RandomAccessFile src = new RandomAccessFile("meinv.jpg","r");
		RandomAccessFile des = new RandomAccessFile("copy.jpg","rw");
		
		long start = System.currentTimeMillis();
		
		byte[] buf = new byte[1024*10];  //���ӿ��ȡЧ�ʣ�һ�ζ�ȡ10K���ֽڣ�һ�㼫���ٶȾ���10K
		
		int len;
		/*
		 * int read(byte[] buf)
		 */
		while((len=src.read(buf))!=-1){
			/*
			 * void write(byte[] b,int offset,int len)
			 * �÷����������ǽ��������ֽ�������offset����ʼ������len���ֽ�д��
			 */
			des.write(buf,0,len );
		}
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+(end-start)+"ms");
	}
}
