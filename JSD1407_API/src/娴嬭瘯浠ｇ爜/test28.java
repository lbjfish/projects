package ���Դ���;

public class test28 {
	public static void main(String[] args){
		String s= "�廪��ѧ������";
		char a[] = s.toCharArray();  //�ַ���ת��������
		for(int i=0;i<a.length;i++)
		{
			a[i]=(char)(a[i]^'t');
		}
		String secret = new String(a);
		System.out.println("����:"+secret);
		for(int i=0;i<a.length;i++)
		{
			a[i] = (char)(a[i]^'t');
		}
		String code = new String(a);
		System.out.println("ԭ��:"+code);
	}

}
