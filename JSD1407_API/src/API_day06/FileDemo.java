package API_day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * File��
 * ���������ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args){
		/**
		 * java.io.File
		 * ��eclipse�С�.����ʾ��ǰ��Ŀ�ĸ�Ŀ¼
		 */
		File file = new File("."+File.separator+"/demo.txt");
		//System.out.print(file);
		
		/*
		 * ͨ��File���ǿ��Ի�ȡ�ļ���Ŀ¼��������Ϣ
		 * ���߲����ļ���Ŀ¼��������ɾ����
		 * ���ǲ��ܶ��ļ����ݽ��з���
		 */
		if(file.isFile()){
			System.out.println("���ļ�");
		}
		else{
			System.out.println("�����ļ�");
		}
		
		//��ȡ�ļ���Ŀ¼������
		String name = file.getName();
		System.out.println("���֣�"+name);
		
		//��ȡ���ǵ�ǰ�ļ�ռ�õ��ֽ���(long ��)
		long length = file.length();
		System.out.println("�ֽڣ�"+length);
		
		//�鿴��ǰ�ļ��Ƿ���Ӳ������ʵ����
		if(file.exists()){
			System.out.println("����");
		}
		else{
			System.out.println("������ ");
		}
		
		//��ǰ�ļ������޸�ʱ��
		//2014��8��26�գ�15��49��46
		long last = file.lastModified();
		System.out.println(last);
		/*
		 * 1.longת��ΪDate
		 *    setTime(0
		 *  2.��SimpleDateFormatת�����ַ���
		 */
		Date date = new Date();
		date.setTime(last);
		//2
		String format = "yyyy��M��dd��,HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		
		file.canRead(); //�ɶ�
		file.canWrite(); //��д
		file.canExecute(); //������
		file.isHidden();  //�Ƿ�Ϊ�����ļ�
	}

}
