package API_day04;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		/**
		 * Collection定义了一个方法
		 * int size()
		 * 用于获取当前集合中的元素数量
		 */
		System.out.println(c.size());//0
		/**
		 *boolean isEmpty()
		 * 该方法用于判断当前集合中是否不含有任何元素，
		 * 注意不是判断集合是否为空（null）
		 * 
		 */
		System.out.println(c.isEmpty()); //true
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c.size()); //3
		System.out.println(c.isEmpty()); // false
		/**
		 * void clear()
		 * 该方法用于清空集合元素
		 */
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
	}

}
