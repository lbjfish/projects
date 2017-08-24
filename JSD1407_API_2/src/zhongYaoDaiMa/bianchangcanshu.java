package zhongYaoDaiMa;

import java.util.Arrays;

/**
 * 变长参数
 * 想传几个参数传几个参数（本质是字符串数组）
 * @author soft01
 *
 */
public class bianchangcanshu {
	public static void main(String[] args){
		test("a","b","c","d");
	}
	public static void test(String... str){ //想传几个参数传几个参数（本质是字符串数组）
		System.out.println(Arrays.toString(str));
	}

}
