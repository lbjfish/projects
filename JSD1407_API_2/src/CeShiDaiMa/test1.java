package CeShiDaiMa;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
//��ȡ�ļ���Ŀ¼������
//��ȡ���ǵ�ǰ�ļ�ռ�õ��ֽ���(long ��)
//�鿴��ǰ�ļ��Ƿ���Ӳ������ʵ����
//��ǰ�ļ������޸�ʱ��

public class test1 {
	public static void main(String[] args){
		File file = new File("."+File.separator+"/pw.txt");
		
		if(file.isFile()){
			System.out.println("�ļ�����");
		}else{
			System.out.println("�ļ���������");
		}
		
		String name = file.getName();
		System.out.println("���֣�"+name);
		
		long length = file.length();
		System.out.println("����"+length);
		
		if(file.exists()){
			System.out.println("�ļ�����");
		}else{
			System.out.println("�ļ�������");
		}
		
		long last = file.lastModified();
		Date date = new Date();
		date.setTime(last);
		String format = "yyyy��MM��dd�� hh��mm��ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String str = sdf.format(date);
		System.out.println(str);
	}

}
