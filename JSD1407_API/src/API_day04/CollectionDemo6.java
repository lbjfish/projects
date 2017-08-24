package API_day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 从集合中删除给定的元素之2
 * @author soft01
 *
 */
public class CollectionDemo6 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		Element e1 = new Element();
		e1.setRow(1);
		e1.setCol(1);
		Element e2 = new Element();
		e2.setRow(1);
		e2.setCol(1);
		
		c.add(e1);
		System.out.println(c);
		
		c.remove(e2);
		System.out.println(c);
		
		Element e3 = new Element();
		e3.setRow(1);
		e3.setCol(1);
		
		c.add(e1);
		c.add(e2);
		System.out.println(c);  //[1,1 , [1,1]]
		/**
		 * remove方法会使用给定元素与集合中
		 * 每一个元素顺序比较equals的结果
		 * 并删除“第一个”与给定元素equals比较
		 * 结果为true的
		 */
		c.remove(e3);
		System.out.println(c); //[]
	}

}
