package YiChang;
/**
 * java�쳣��������е�try catch
 * @author soft01
 *
 */
/*
 * ��ָ���쳣
 */
public class ExceptionDemo1 {
	public static void main(String[] args){
		System.out.println("����ʼ");
		
		try{
		String str = "";
		/**
		 * �����ֿ�ָ���jvm����һ����ָ���쳣��ʵ���������׳���
		 */
		System.out.println(str.length());
		//System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("������һ����ָ��");			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�����±�Խ��");
		}catch(Exception e){
			System.out.println("QQ��ʾ���뷢�ʹ������������ڸ���");
		}
		System.out.println("�������");
	}
    
}
