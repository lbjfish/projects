package zhongYaoDaiMa;

import java.io.File;

public class DiGui {
	public static void main(String[] args){
		File file = new File("a");
		deleteFile(file);
	}
	
	/*
	 * ��������10����
	 * һ�ֶ������
	 * һ�ֲ��������
	 */
   public static void deleteFile(File file){
	   if(file.isDirectory()){
		   //�����Ŀ¼����Ҫ���Ƿ�������
		   File[] subs = file.listFiles();
		   //��ɾ����������
		   for(File sub : subs){
			   deleteFile(sub);
		   }
	   }
	   file.delete();
   }
}
