package API_day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque��˫�˶��У����е����˾������������ӵ��������Ƴ���ֻ�ܴӶ��е�
 * һ�� ��������Ӿ��γ��˾�������ݽṹ��ջ���� ջ��ȡԪ����ѭ�Ƚ����ԭ��
 * ��FILO First Input Last Output��
 * @author soft01
 *
 */
public class DequeDemo {
	public static void main(String[] args){
		Deque<String> stack = new LinkedList<String>();
		//��ջ���� push
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
//		//���ã�������ջ
//		System.out.println(stack);
//		String str = stack.peek();
//		System.out.println(str);
//		System.out.println(stack);
		
		while(stack.size()>0){
			String str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
		
		/*
		 * ջ��ʵ��Ӧ����ͨ����������ʵ��ĳһϵ�в��п�׷���ԡ�
		 * ����ʹ��ջ��ɡ�ǰ�����������ˡ�
		 */
	}

}
