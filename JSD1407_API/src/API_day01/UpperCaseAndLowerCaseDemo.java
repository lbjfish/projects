package API_day01;

import java.util.Scanner;

/**
 * 将字符串中英文部分转换为大小写  （验证码就是这样的）
 * @author soft01
 *
 */
public class UpperCaseAndLowerCaseDemo {
	public static void main(String[] args){
		String str = "我爱Java";
		/**
		 * 将字符串中的英文部分转换为全大写
		 */
		String str1 = str.toUpperCase();
		System.out.println(str1);
	   str = "我爱JAVA";
	   /**
	    * 将字符串中的英文部分转换为全小写
	    */
		String str2 = str.toLowerCase();
		System.out.println(str2);
		
	   /*******************************************/
		String message = "3bSa7U";
		System.out.println("请输入验证码："+message);
		Scanner scan = new Scanner(System.in);
		String str3 = scan.nextLine();
		message=message.toLowerCase();   //将验证码改为小写
		str3=str3.toLowerCase();      //将用户输入改为小写
		if(message.equals(str3))
		{
			System.out.println("输入正确");
		}
		else
			System.out.println("输入错误");
	}

}
