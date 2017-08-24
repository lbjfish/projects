package ²âÊÔ´úÂë;
class Fibi{
	public static long fibonacii(int n){
		long c =0;
		if(n==1||n==2)
		{
			c=1;
		}
		else
		{
			c = fibonacii(n-1)+fibonacii(n-2);
		}
		return c;
	}
}
public class test14 {
	public static void main(String[] args){
		System.out.println(Fibi.fibonacii(49));
	}

}
