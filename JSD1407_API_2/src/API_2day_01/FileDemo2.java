package API_2day_01;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles ����֧���ļ�������
 * 
 * FileFilter�ӿ�
 * ʵ�ָýӿ���Ҫʵ�ֳ��󷽷���
 * boolean accept(File f)
 * �÷���Ҫ�����Ƕ����������
 * 
 * listFiles�����Ὣ��ǰĿ¼������accept
 * �����������
 * @author soft01
 *
 */
public class FileDemo2 {
	public static void main(String[] args){
		//����������ʵ��
	   File dir = new File(".");

	   if(dir.isDirectory()){
		   FileFilter filter = new MyFilter();
		   //ʹ�ù�������������
		   File[] subs = dir.listFiles(filter);
		   for(File sub : subs){
			   System.out.println(sub.getName());
		   }
	   }
	}
}

class MyFilter implements FileFilter{
	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().startsWith(".");
	}
}