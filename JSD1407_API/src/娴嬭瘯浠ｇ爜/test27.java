package ���Դ���;

public class test27 {
	public static void main(String[] args){
		char c[],d[];
		String s = "�¹�����ӻ��ܰ��������";
		c=new char[2];
		s.getChars(5,7,c,0);
		System.out.println(c);
		d = new char[s.length()];
		s.getChars(7,12,d,0);
		s.getChars(5,7,d,5);
		s.getChars(0,5,d,7);
		System.out.println(d);
	}

}
