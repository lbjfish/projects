package API_2day_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��ֽ�������������ļ�����д������ע������
 * @author soft01
 *
 */
public class FosDemo2 {
	public static void main(String[] args) throws IOException{
		/**
		 * FileOutputStream֧��һ�����صĹ��췽��
		 * FileOutputStream��String str,boolean append)
		 * �ڶ�������ָ���Ƿ����׷��д����
		 * ����׷�ӣ���ǰ�ļ��е��������ݶ��ᱻ�����Ȼ������д���ݡ�
		 * Ҫע����һ���RandomAccessFile��ͬ
		 */
		FileOutputStream fos = new FileOutputStream("fos.dat",true);
		fos.write(99);
		fos.close();
	}

}
