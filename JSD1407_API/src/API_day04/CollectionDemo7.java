package API_day04;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo7 {
	public static void main(String[] args){
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		c2.add("d");
		c2.add("e");
		c2.add("f");
		c2.add("g");
		
		/**
		 * boolean addAll(Collection c)
		 * �����������е�����Ԫ�ش��뵱ǰ����
		 * ����ǰ������Ϊ�÷������������ı�
		 * �򷵻�true
		 */
		c1.addAll(c2);
		System.out.println(c1);
		
		Collection c3 = new ArrayList();
		c3.add("d");
		c3.add("e");
		c3.add("f");
		/**
		 * boolean containsAll(Collection c)
		 * �鿴��ǰ�������Ƿ�������������е�����Ԫ�ء�
		 */
		boolean con = c1.containsAll(c3);
		System.out.println(con);
	}

}
