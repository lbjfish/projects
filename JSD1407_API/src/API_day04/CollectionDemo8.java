package API_day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo8 {
	public static void main(String[] args){
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("***");
		c.add("two");
		c.add("***");
		c.add("three");
		c.add("***");
		c.add("four");
		
		//java.util.Iterator
		/**
		 * ʹ�õ������������ϵĲ���
		 * ������ѭ��
		 * ��ȡɾ ����ɾ���������Ǳ����
		 */
		Iterator it = c.iterator();
		
		while(it.hasNext())
		{
			Object o = it.next();
			String str = (String)o;
			if("***".equals(str))
			{
				/*
				 * �ڵ��������в���ͨ�����ϵ�removeɾ��Ԫ��,
				 * ֻ��ͨ���������ṩ��remove������ɾ���ո�next����������
				 * Ԫ�أ���������һ��next�����������ú󣬷����ٴε���
				 * remove����
				 * c.remove(str);
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}

}
