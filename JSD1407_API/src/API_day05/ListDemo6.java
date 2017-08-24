package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List集合的排序
 * 对Set集合排序通常是无意义的
 * @author soft01
 *
 */
public class ListDemo6 {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * 生成10个随机数放入集合
		 */
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		/*
		 * Collections.sort方法
		 * 会对集合进行自然排序（由小至大）
		 */
		Collections.sort(list);
		System.out.println(list);
	}

}
