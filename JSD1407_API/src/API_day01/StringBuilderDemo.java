package API_day01;

import java.util.Scanner;

/**
 * StringBuilder
 * 用于解决频繁修改字符串内容带来的资源消耗过度问题
 * 
 * 频繁修改字符串的首选
 * @author soft01
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args){
		/**
		 * StringBuilder提供了对字符串编辑的
		 * 相关方法：
		 * 增：append
		 * 删：delete
		 * 改：replace
		 * 插：insert 
		 */
		String str = "努力学习java";
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		StringBuilder builder = new StringBuilder(a);
		//努力学习java，为了找个好工作
		//append用于再当前字符串末尾追加给定字符串
		builder.append(",为了找个好工作");                   //增
		str = builder.toString();
		System.out.println(str);
		
		//努力学习java，为了改变世界
		/**
		 * replace(int start,int end,String str)
		 * 从start开始，end结束
		 */
		builder.replace(11, builder.length(), "改变世界");  //改
		str = builder.toString();
		System.out.println(str);
		
		//努力学习java，就是为了改变世界
		/**
		 * insert(int offset,String str)
		 * 在给定的位置offset处插入字符串str
		 * 原位置及以后的字符串内容自动向后移动
		 */
		builder.insert(9, "就是");                        //插
		str = builder.toString();
		System.out.println(str);
		
		//，就是为了改变世界
		//delete方法：删除指定范围内的字符串
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		//活着，就是为了改变世界
		builder.insert(0, "活着");
		str = builder.toString();
		System.out.println(str);
		
		//反转字符        /用此方法判断回文 超级简单
		builder.reverse();
		str = builder.toString();
		System.out.println(str);
	}

}
