package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter
 * �����ַ�������������Զ���ˢ��
 * ������ �� Ϊ��λд���ַ���
 * @author soft01
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.println("���ڱ���");
		pw.println("��ʹ��ˬ�ӹ�");
		
		System.out.print("д���");
		pw.close();
	}

}
