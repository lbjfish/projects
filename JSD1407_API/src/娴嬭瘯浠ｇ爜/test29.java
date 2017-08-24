package 测试代码;
/**
 * 把字符串类型转换成数组  String ---> Array
 */
import java.util.Arrays;

public class test29 {
	public static void main(String[] args){
		String str = "123456";
		char a[] = str.toCharArray();    //这里必须是char
		System.out.println(Arrays.toString(a));
	}

}
