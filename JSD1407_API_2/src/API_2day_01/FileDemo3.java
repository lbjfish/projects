package API_2day_01;

import java.io.File;
import java.io.IOException;

/**
 * �����༶Ŀ¼�µ�һ���ļ�
 * @author soft01
 *
 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException{
		File file = new File(
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+
				"f"+File.separator+
				"g"+File.separator+
				"h.txt"
				);
		
		/**
		 * �����ļ�ʱ��Ӧ�����жϵ�ǰ�ļ����ڵ�
		 * Ŀ¼�Ƿ���ڣ���Ϊ�������ڣ����׳��쳣
		 */
		File parent = file.getParentFile();
		if(!parent.exists()){
			parent.mkdirs();
		}
		/*
		 * �����ļ�ʱ��Ӧ�����жϵ�ǰ�ļ����ڵ�
		 * Ŀ¼�Ƿ���ڣ���Ϊ�������ڣ����׳��쳣��
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��������");
		}
	}

}
