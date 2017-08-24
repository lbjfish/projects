package API_day02;
/**
 * 输入一个数字，判断是否为整数或小数
 * 并转换为相应的数字
 * @author soft01
 */
import java.util.Scanner;
public class zuoYe_3 {
	public static void main(String[] args){
		/**
		 * 1.向用户索取一个输入的数字
		 * 2.书写一个正则表达式验证数字
		 * 3.使用包装类，将字符串转换为基本类型
		 * 4.输出
		 * 
		 *步骤：
		 *1.使用Scanner获取用户输入的一行字符串
		 *2.书写一个正则表达式验证数字
		 *3.使用包装类，将字符串转换为基本类型
		 *4.输出
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String intRegex = "[0-9]+";
		String doubleRegex = "[0-9]+\\.[0-9]+";
		//判断是否为整数
		if(str.matches(intRegex))
		{
			System.out.println("这是一个整数："+str);
		}
		else if(str.matches(doubleRegex))
		{
			System.out.println("这是一个小数："+str);
		}
		else
		{
			System.out.println("格式不对");
		}
	}

}
