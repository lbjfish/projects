package API_2day_01;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�
 * @author soft01
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("demo.dat","r");
		
		/*
		 * �ӵ�ǰ�ļ��ж�ȡ��һ���ֽڡ�
		 * �����ֽڴ��뷵�ص�intֵ��
		 * intֵ���Ͱ�λ����Ч
		 * ������ֵΪ-1����˵����ȡ�����ļ���ĩβ
		 * EOF end of file
		 */
		//��һ���ֽ�
		int i = raf.read();
		System.out.println(i);
		
		//�ٶ�һ���ֽ�
		i=raf.read();
		System.out.println(i);
		
		//�ٶ�һ���ֽ�
		i=raf.read();
		System.out.println(i);
		
		// * ������ֵΪ-1����˵����ȡ�����ļ���ĩβ
		i=raf.read();
		System.out.println(i);
		raf.close();
	}
}
