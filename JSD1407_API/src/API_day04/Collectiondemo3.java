package API_day04;
/**
 * 查看集合中是否包含指定的元素
 */
import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo3 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		/**
		 * boolean contains(Object o)
		 * 查看当前集合中是否包含给定的元素o
		 */
		boolean contains = c.contains("a");
		System.out.println("集合是否包含："+contains);
		String str = new String("a");
		/**
		 * 判断集合是否包含给定元素的标准是看给定的元素是否在集合中有
		 * 与某个元素equals比较true，有则表示true
		 */
	}

}
