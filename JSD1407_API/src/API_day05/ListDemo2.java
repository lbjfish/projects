package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List���з���2
 *void add(int index,E e)
 *E remove(int index)
 * @author soft01
 *
 */
public class ListDemo2 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		//Collection��add,�򼯺���׷����Ԫ��
		list.add("one");
		list.add("two");
		list.add("three");
		
		//List��add������ͨ���ǲ�����Ԫ��
		list.add(1,"2");
		System.out.println(list);
		
		String str = list.remove(2);
		System.out.println("��ɾ����Ԫ���ǣ�"+str);
		System.out.println(list);
	}

}
