package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ�Ӽ� subList
 * @author soft01
 *
 */
public class ListDemo3 {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		
		//[0,1,2,3,4,5,6,7,8,9]
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		/*
		 * subList(int from,int to)
		 * ��ȡ������Χ���Ӽ���ע��ͬ���Ǻ�ͷ����β
		 */
		List<Integer> subList = list.subList(3,8);
		System.out.println(subList);
		
		//���Ӽ���ÿ��Ԫ������10��
		for(int i=0;i<subList.size();i++)
		{
			subList.set(i,subList.get(i)*10);
		}
		/*
		 * ������ͨ���Ӽ��޸�Ԫ�أ���Ӱ��ԭ����
		 */
		System.out.println(subList);
		System.out.println(list);
		subList.remove(0);
		System.out.println(list);
		
	}

}
