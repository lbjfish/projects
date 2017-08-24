package API_day05;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集 subList
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
		 * 获取给定范围的子集，注意同样是含头不含尾
		 */
		List<Integer> subList = list.subList(3,8);
		System.out.println(subList);
		
		//对子集的每个元素扩大10倍
		for(int i=0;i<subList.size();i++)
		{
			subList.set(i,subList.get(i)*10);
		}
		/*
		 * 当我们通过子集修改元素，会影响原集合
		 */
		System.out.println(subList);
		System.out.println(list);
		subList.remove(0);
		System.out.println(list);
		
	}

}
