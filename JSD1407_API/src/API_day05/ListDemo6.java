package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List���ϵ�����
 * ��Set��������ͨ�����������
 * @author soft01
 *
 */
public class ListDemo6 {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * ����10����������뼯��
		 */
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		System.out.println(list);
		/*
		 * Collections.sort����
		 * ��Լ��Ͻ�����Ȼ������С����
		 */
		Collections.sort(list);
		System.out.println(list);
	}

}
