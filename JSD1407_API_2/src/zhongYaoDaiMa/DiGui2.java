package zhongYaoDaiMa;
/**
 * ʹ�õ�ǰ�������ۼ���֮ǰ��ÿһ������
 * ֱ��1Ϊֹ
 * �ݹ飺
 * 1.���ȿ��ǡ����ˡ������ʲôʱ��ֹͣ
 * 2.ÿһ�ֿ��ܷ���������Ƿ񶼿�����
 *   �÷������ɣ�������ǵݹ���ã�
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
