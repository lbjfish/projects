package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * Listת��Ϊ����
 * @author soft01
 *
 */
public class ListDemo4 {
	public static void main(String[] args){
		/*
		 * 
		 * ����List��setҲ�ǿ���ת��Ϊ����ģ�
		 * ֻ�ǲ�����
		 */
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		/**
		 * toArray��������Collection�ж����
		 * ����Set����Ҳ����ת��������
		 */
		//���ַ���ʵ�ʿ����в�����
		Object[] array = list.toArray();
		for(Object o : array){
			String str = (String)o;
			System.out.println(str);			
		}
		
		//��������toArrayʵ�ʿ����бȽϳ���
		String[] strArray = list.toArray(new String[list.size()]);
		for(String str : strArray){
			System.out.println(str);
		}
	}

}
