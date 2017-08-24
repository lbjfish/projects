package API_day01;
/**
 * 字符串不变对象的测试
 * @author soft01
 *
 */
public class StringDemo {
	public static void main(String[] args)
	{
		                 //字面量，直接量
		String str = "helloworld";
		String str2 = "helloworld";
		/**
		 * java在编译的时候做了一个优化
		 * 若计算两边的内容都是字面量，则
		 * 会进行计算，将结果生成到编译后的
		 * 字节码文件中，搜一再字节码文件中我们看到
		 * 的是如下内容：
		 * String 3 = "helloworld";
		 */
	  /* String str3 = "hello"+"world";
	   String a = "hello'";
	   String str4 ="world";
 		System.out.println(str2==str3);
 		System.out.println(str2==str4);*/
 		String s1 = "abc123";
 		String s2 = "abc"+123;
 		String s3 =1+"2"+3+"abc";
 		String s4 =1+2+"3"+"abc";
 		String s5 ='1'+2+"3"+"abc";
 		String s6 ="1"+'2'+3+"abc";
 		System.out.println(s1==s2);
 		System.out.println(s1==s3);
 		System.out.println(s3==s4);
 		System.out.println(s3==s5);
 		System.out.println(s3==s6);
	}

}
