package YiChang;

public class ExceptionDemo4 {
	public static void main(String[] args){
		System.out.println("����ʼ��");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			e.printStackTrace(); //����Ҳ������ͰѴ������������
			//�鿴������Ϣ
			System.out.println(e.getMessage());
			System.ou.t.println("������");
		}
		System.out.println("���������");
	}

}
