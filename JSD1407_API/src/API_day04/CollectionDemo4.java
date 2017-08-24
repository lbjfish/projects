package API_day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试集合是否含有给定元素
 * @author soft01
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		Element e1 = new Element();
		e1.setRow(1);
		e1.setCol(1);
		Element e2 = new Element();
		e2.setCol(1);
		e2.setRow(1);

		c.add(e1);
		//true
		System.out.println(c.contains(e1));
		//true
		System.out.println(c.contains(e2));
	}

}
