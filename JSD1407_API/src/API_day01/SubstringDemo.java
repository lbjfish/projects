package API_day01;
/**
 * subString用于获取一个字符串的部分内容
 * @author soft01
 *
 */
public class SubstringDemo {
	public static void main(String[] args){
		String url = "www.oracle.com";
		/**
		 * 通常情况下，用连个数字表示范围时
		 * 都是"含头不含尾"的  [4,10);
		 */    
		String sub = url.substring(4,10);
		System.out.println(sub);
		
		//一个参数为从指定位置截取到字符串末尾
		String sub1 = url.substring(4);
		System.out.println(sub1);
		
		url = "http://www.tarena.com.cn";
		/**
		 * 思路：
		 * 获取第一个点，与第二个点的位置
		 * 截取中间的字符串即可
		 */
		int one = url.indexOf(".");
		int two = url.indexOf(".",one+1);
		String s = url.substring(one+1,two);
		System.out.print(s);
	}

}
