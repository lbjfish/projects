package API_2day_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����дһ���ֽ�
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
		
		String str = "�Ұ������찲��";
		/*
		 * String��getBytes()������
		 * ����ǰ�ַ���
		 */
		byte[] buf = str.getBytes("UTF-8"); //���ַ���ת��Ϊ�ַ����飬��ת����GBK�������
		raf.write(buf);
		raf.close();
	}

}
