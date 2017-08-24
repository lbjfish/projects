package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter
 * �ַ�����������ַ�Ϊ��λд������
 * �ַ���ֻ�����д�ַ�����
 * @author soft01
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException{
		/**
		 * ���ļ���д���ı����ݣ�д�ַ�����
		 * 1.���ļ���д���ݣ�FileOutputStream��
		 * 2.д�����ı����ݣ���
		 */
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//ʹ���ַ��������ֽ���
		/**
		 * OutputStreamWrite���ص��ǿ��Խ��������ַ��������ض����ַ���
		 * ת��Ϊ�ֽں�д��
		 * ʹ�ù��췽����
		 * OutputStreamWriter(OutputStream out,String charsetName);
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");//��������תʲô��תʲô
		//�����Ϳ���ֱ��д�ַ�����
		osw.write("��Һò�����ĺ�");
		osw.write("�Ǻ�");
		osw.close();
	}

}
