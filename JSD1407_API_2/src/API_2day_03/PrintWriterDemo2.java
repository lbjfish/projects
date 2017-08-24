package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import API_2day_04.ProducerConsumer.Product;

/**
 * PrintWriter
 * �����ַ�������������Զ���ˢ��
 * ������ �� Ϊ��λд���ַ���
 * @author soft01
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		                 
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		/*
		 * ���������Զ���ˢ�µ�PrintWriter��ÿ������ʹ��println
		 * ����д���ַ����󣬶����Զ�flush����һ��Ҫ����������ɻ�����
		 * д������
		 * 
		 * �����Ҫ��ʱ�ԣ���QQ������ô�øɣ���������Ӹ���
		 */
		PrintWriter pw = new PrintWriter(osw,true);//�൱��ÿpw.println��"dsakj"��;��Ҫfulushһ��
		
		pw.println("���ڱ���");
		pw.println("��ʹ��ˬ�ӹ�");
		System.out.print("д���");
		pw.close();
	}

}
