package 测试代码;

import java.util.StringTokenizer;

public class test26 {
	public static void main(String[] args){
		String s = "I am James,she is my girlfriend";
		StringTokenizer fenxi = new StringTokenizer(s," ,");//空格和逗号分隔
		int number = fenxi.countTokens();
		while(fenxi.hasMoreTokens())
		{
			String str = fenxi.nextToken();
			System.out.println(str);
			System.out.println("还剩"+fenxi.countTokens()+"个单词"+" ");
		}
		System.out.println("s共有单词："+number+"个");
	}

}
