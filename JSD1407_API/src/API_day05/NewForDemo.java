package API_day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��ѭ��
 * �����������ϻ�����
 * @author soft01
 *
 */
public class NewForDemo {
	public static void main (String[] args){
		String[] array = {"a","b","c","d","e"};
		for(int i=0;i<array.length;i++)  //��ͳ������������ �����洫ͳ������������
		{
			String str = array[i];
			System.out.print(str+" ");
		}
		System.out.println();
		//��ѭ������
		for(String str : array)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		Iterator it = c.iterator();
		while(it.hasNext())       //��ͳ������������
		{
			String str = (String)it.next();
			System.out.print(str+" ");
		}
		System.out.println();
		for(Object str : c)      //�·�����������
		{
			System.out.print(str+" ");
		}
	}
}
