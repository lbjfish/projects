package API_2day_02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * int skipBytes��int n��
 * �÷����᳢�������Ǹ��ֽڣ�����ֵΪʱ���������ֽ���
 * @author soft01
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		
		//����1���ֽ�
	   raf.skipBytes(0);
	//   int i = raf.readInt();
	   int i = raf.read();
		System.out.println(raf.getFilePointer());
		System.out.print(i);
		raf.close();
	}

}
