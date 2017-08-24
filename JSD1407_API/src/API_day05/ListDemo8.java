package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 当元素自身提供有的比较规则不能满足我们对于排序的需求时， 我们可以额外的提供一种比较规则。
 * 
 * @author soft01
 * 
 */
public class ListDemo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("范传奇");
        list.add("张三");
        list.add("张磊");
        list.add("翔哥");
        list.add("张四");
        list.add("苍老师");
        System.out.println(list);
        /**
         * 但元素自身提供的比较规则不满足排序需求
         * 我们可以提供额外的比较规则
         */
        MyComparator com = new MyComparator();
        Collections.sort(list,com);
        System.out.println(list);
	}
}

class MyComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		// 哪个字符串多哪个字符串大
		return o1.length() - o2.length();
	}
}
