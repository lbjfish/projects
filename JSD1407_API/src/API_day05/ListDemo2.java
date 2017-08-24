package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List独有方法2
 *void add(int index,E e)
 *E remove(int index)
 * @author soft01
 *
 */
public class ListDemo2 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		//Collection中add,向集合中追加新元素
		list.add("one");
		list.add("two");
		list.add("three");
		
		//List的add方法，通常是插入新元素
		list.add(1,"2");
		System.out.println(list);
		
		String str = list.remove(2);
		System.out.println("被删除的元素是："+str);
		System.out.println(list);
	}

}
