package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * List转换为数组
 * @author soft01
 *
 */
public class ListDemo4 {
	public static void main(String[] args){
		/*
		 * 
		 * 除了List，set也是可以转换为数组的，
		 * 只是不常用
		 */
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		/**
		 * toArray方法是在Collection中定义的
		 * 所以Set集合也可以转换成数组
		 */
		//这种方法实际开发中不常用
		Object[] array = list.toArray();
		for(Object o : array){
			String str = (String)o;
			System.out.println(str);			
		}
		
		//下面这种toArray实际开发中比较常用
		String[] strArray = list.toArray(new String[list.size()]);
		for(String str : strArray){
			System.out.println(str);
		}
	}

}
