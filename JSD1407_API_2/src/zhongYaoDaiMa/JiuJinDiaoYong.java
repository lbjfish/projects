package zhongYaoDaiMa;
/**
 * java�ͽ�����ԭ��:
 * 1.����������õ��ǻ������ͣ����ȵ��û�������
 * 2.����������õ����������ͣ����ȵ�����������
 * 3.������з��������ʹ�Сһ�����򱨴�
 * 4.������з���һ����Collection��һ����Object�����ȵ���Collection
 * 5.������з���ȫ���������ͣ�������Ҫ��õ��������ͣ�java���Զ���װ��
 * ����������ת���ɻ������ͣ����ô�С����
 * @author soft01
 *
 */
public class JiuJinDiaoYong {
	public static void main(String[] args){
		byte s = 1;
		dosome(s);
	}
	public static void dosome(Short s){
		System.out.println("Short");
	}
	public static void dosome(byte s){
		System.out.println("byte");
	}
	public static void dosome(int s){
		System.out.println("int");
	}
	public static void dosom(Double s){
		System.out.println("Double");
	}

}
