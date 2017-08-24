package API_2day_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * BufferedReader
 * �����ַ�������
 * ��������Ϊ��λ��ȡ�ַ���
 * @author soft01
 *
 */
public class BufferReaderDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("pw1.txt");
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		BufferedReader br = new BufferedReader(isr); //һ�ж�һ�У��ٶȱ�InputStreamReader��
		/**
		 * String readLine����
		 * һ�ζ�ȡһ���ַ������÷������ж϶�ȡ�����з�Ϊֹ����֮ǰ��һ��
		 * �ַ�������
		 * ���÷������ص��ַ���Ϊnull��˵��û�����ݿɶ���
		 */
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}

}
