package API_day02;
/**
 * ������г�������
 * @author soft01
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args){
		String regex = "(SB|WQNMLGB|TMB|NND|WC|CNM|NC)";
		String message = "WC!��SB!����ô��ôNC��WQNMLGB";
		message = message.replaceAll(regex,"*****");
		System.out.println(message);
	}

}
