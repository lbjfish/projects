package API_day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合
 * @author soft01
 *
 */
public class ListDemo5 {
	public static void main(String[] args){
		String[] array = {"a","b","c","d"};
		//Arrays.asList(array);
		/*
		 * 数组只能转换为List集合
		 * 因为若转换为Set可能会丢失重复元素
		 */
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/**
		 * 通过数组转换的集合，是不能改变集合元素数量的
		 */
		/*list.add("e");
		 * list.remove(3);
		System.out.println(list);*/ // 不支持 增删元素
		
		System.out.println(Arrays.toString(array));
		
		//修改集合元素的内容，会影响原数组
		list.set(3,"e");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		//如果有增删元素的需求 ，可以复制一个
		/*
		 * 所有的集合实现都支持一个构造方法
		 * 该方法可以传入一个Collection，
		 * 那么该构造方法创建出来的集合默认就添加
		 * 了给定集合中的所有元素
		 * 这样的构造方法叫做复制构造器
		 */
		List list2 = new ArrayList(list);
		System.out.println(list2);
		list2.add("f");
		System.out.println(list2);
	}

}
