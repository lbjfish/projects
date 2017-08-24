package API_day02;
/**
 * 验证手机，邮箱，邮编
 */
import java.util.Scanner;
public class zuoYe_1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你想输的：");
		String str = scan.next();
		String regex1 = "\\d{17}[0-9xX]";
		String regex2 = "\\d{6}";
		String regex3 = "\\d{11}";
		String regex4 = "^\\w+@(\\w+\\.)+\\w{2,4}$";
		
		boolean match = str.matches(regex1);
		boolean match1 = str.matches(regex2);
		boolean match2 = str.matches(regex3);
		boolean match3 = str.matches(regex4);
		 
		 if(match)
		 {
			 System.out.print("是一个身份证号");
		 }
		 if(match1)
		 {
			 System.out.print("是一个邮编地址");
		 }
		 if(match2)
		 {
			 System.out.print("是一个手机号");
		 }
		 if(match3)
		 {
			 System.out.print("是一个邮箱");
		 }
	}

}
