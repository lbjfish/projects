package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List���ظ�����
 * �ص㣺���Ը����±����Ԫ�أ���һ����������
 * @author soft01
 *
 */
public class ListDemo1 {
	public static void main(String[] args){
		//java.util.List
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		for(int i=0;i<list.size();i++){
			String str = list.get(i);
			System.out.println(str);
		}
		/*for(String str : list){
			System.out.println(str);
		}*/
		/*
		 * E set(int index,E e)
		 * ��������Ԫ�����õ�ָ����λ����
		 * ����ֵΪԭλ�ñ��滻��Ԫ��
		 */
		String str = list.set(1,"2");
		System.out.println("���滻��Ԫ�أ�"+str);
		System.out.println(list);
		/*
		 * set�����ò��������Ԫ�أ������滻�Ӳ���
		 * �����±겻�ܳ�������Ҫ��ķ�Χ 
		 */
		// list.set(3,"4");
	}
	

}
