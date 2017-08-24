package API_day02;

import java.util.Arrays;

/**
 * split方法用于拆分字符串
 * 将字符串中满足正则表达式的部分“切除”，
 * 保留剩下的部分
 * @author soft01
 *
 */
public class SplitDemo {
	public static void main(String[] args){
		String str = "456dhaskh23242skdhas3424jsdahk23sda";
		/**
		 * 保留每一段字母部分
		 * 按照数字拆分
		 */
		String[] array = str.split("[0-9]+");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	}

}
