package API_day01;
/**
 * 将其他数据类型转换为字符串类型
 * @author soft01
 *
 */
public class ValueOfDemo {
	public static void main(String[] args){
		double pi = 3.1415926+1;
		//将Double值转换为字符串形式
		String piStr = String.valueOf(pi);
		System.out.println(piStr);
		
		/*******************************************/
		
		double pi1 = 3.1415926;
		String piStr1 = String.valueOf(pi1)+1;
		System.out.println(piStr1);
		
		//将int值转换为字符串形式
		String intStr = String.valueOf(1);
		//将boolean值转换为字符串形式
		String booleanStr = String.valueOf(false);
	}

}
