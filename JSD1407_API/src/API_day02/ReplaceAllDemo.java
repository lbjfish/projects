package API_day02;
/**
 * replaceAll方法用于将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author soft01
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args){
		String str ="addas42343dasa43434dasa4344das";
		/**
		 * 将数组部分替换为“#number”
		 */
		String replace=str.replaceAll("\\d+","#number#");
		System.out.print(replace);
	}

}
