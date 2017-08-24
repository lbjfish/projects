package API_day02;
/**
 * 创建和谐语言社会
 * @author soft01
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args){
		String regex = "(SB|WQNMLGB|TMB|NND|WC|CNM|NC)";
		String message = "WC!你SB!你怎么这么NC！WQNMLGB";
		message = message.replaceAll(regex,"*****");
		System.out.println(message);
	}

}
