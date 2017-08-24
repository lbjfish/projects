package 测试代码;

public class test28 {
	public static void main(String[] args){
		String s= "清华大学出版社";
		char a[] = s.toCharArray();  //字符串转换成数组
		for(int i=0;i<a.length;i++)
		{
			a[i]=(char)(a[i]^'t');
		}
		String secret = new String(a);
		System.out.println("密文:"+secret);
		for(int i=0;i<a.length;i++)
		{
			a[i] = (char)(a[i]^'t');
		}
		String code = new String(a);
		System.out.println("原文:"+code);
	}

}
