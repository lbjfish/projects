package API_day01;
/**
 * 字符串的indexOf方法，用于查找
 * 字符串的位置
 * @author soft01
 *
 */
public class IndexDemo {
	public static void main(String[] args){
		String str = "thinking in java";
		int index = str.indexOf("in");
		System.out.println(index);
		/**
		 * 从指定位置开始查找第一次出现给定字符串的位置
		 */
		int index1 = str.indexOf("in",4); //找到java的位置，功能很多,也可以判断邮箱是否正确	比如邮箱有@
		System.out.println(index1);
		index = str.lastIndexOf("in");
		System.out.println(index);
	}

}
