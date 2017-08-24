package API_day02;
/**
 * 字符串的matches方法用于验证当前字符串
 * 是否满足给定的正则表达式的格式要求
 * @author soft01
 *
 */
public class MatchesDemo {
	public static void main(String[] args){
		/**
		 * 身份证号的验证
		 *\d{17}[0-9xX]
		 */
		String id = "114104198810102415";
		String regex = "\\d{17}[0-9xX]";  //java系统自动加"^\\d{17}[0-9xX]$"
		/**
		 * matches方法是否完全匹配，无论我们是否再正则表达式中书写了"^","$"
		 */
		boolean macth = id.matches(regex);
		//System.out.println(macth);
		if(macth)
		{
			System.out.println("是一个身份证号");
		}
		else
		{
			System.out.println("不是一个身份证号");
		}
	}

}
