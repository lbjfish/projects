package API_2day_02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ���������д�����ݵ�ע������
 * @author soft01
 *
 */
public class BosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("xix3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "ΰ������ë��ϯ";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		/*
		 * ǿ�ƽ���ǰ�������еĻ������е�����ȫ��д����
		 * ���ۻ������Ƿ�װ��
		 */
		bos.flush();
		//closeʱ��Ҳ���Զ�����һ��flush
		bos.close();
	}

}
