package API_day06;

import java.io.File;

/**
 * �����༶Ŀ¼
 * @author soft01
 *
 */
public class FileDemo4 {
	public static void main(String[] args){
		File d= new File("a"+File.separator+
				           "b"+File.separator+
				           "c"+File.separator+
				           "d"+File.separator+
				           "e"+File.separator+
				           "f");
		if(!d.exists()){
			/*
			 * mkdir�����ᴴ����ǰĿ¼
			 * �Լ����в����ڵĸ�Ŀ¼
			 */
			d.mkdirs();
			System.out.println("�㶨");
		}
		
		/**
		 * delete��ɾ��һ��Ŀ¼
		 * ǰ����������Ŀ¼�����ǿյģ�����������Ŀ¼���ļ�����
		 * ������ɾ��
		 */
//		if(d.exists()){
//			d.delete();
//			System.out.println("Ŀ¼�Ѿ�ɾ��");
//		}
	}

}
