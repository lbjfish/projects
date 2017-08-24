package zhongYaoDaiMa;
/**
 * 使用当前的数字累加其之前的每一个数字
 * 直到1为止
 * 递归：
 * 1.首先考虑【极端】情况，什么时候停止
 * 2.每一种可能发生的情况是否都考虑了
 *   该方法即可（这里就是递归调用）
 * @author soft01
 *
 */
public class DiGui2 {
	public static void main(String[] args){
		int a = add(100);
		System.out.println(a);
	}
	
	public static int add(int n){
		if(n==1){
			return 1;
		}else{
			return n+add(n-1);
		}
	}

}
