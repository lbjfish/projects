package ���Դ���;

import java.util.StringTokenizer;

public class test26 {
	public static void main(String[] args){
		String s = "I am James,she is my girlfriend";
		StringTokenizer fenxi = new StringTokenizer(s," ,");//�ո�Ͷ��ŷָ�
		int number = fenxi.countTokens();
		while(fenxi.hasMoreTokens())
		{
			String str = fenxi.nextToken();
			System.out.println(str);
			System.out.println("��ʣ"+fenxi.countTokens()+"������"+" ");
		}
		System.out.println("s���е��ʣ�"+number+"��");
	}

}
