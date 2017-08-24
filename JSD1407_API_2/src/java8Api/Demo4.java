package java8Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {

		// ����һ����
		Stream<String> stream = Stream.of("a", "b", "c");
		System.out.println(stream);

		// 1.������ת��Ϊһ����
		String[] strArray = new String[] { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(strArray);
		System.out.println(stream2);

		// 2.������ת��Ϊһ����
		Stream<String> stream3 = Arrays.stream(strArray);
		System.out.println(stream3);

		// ������ת����һ����
		List<String> list = Arrays.asList(strArray);
		Stream<String> stream4 = list.stream();
		System.out.println(stream4);

		// ��������(map)
		List<String> output = stream4.map(String::toUpperCase).collect(
				Collectors.toList());
		// List<String> output5 = stream4.collect(Collectors.toList());
		System.out.println(output);

		// ƽ����
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> output2 = list2.stream().map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println(output2);

		// ����
		List<String> list3 = Arrays.asList("", "ab", "cd");
		List<String> output3 = list3.stream().filter(str -> str.isEmpty())
				.collect(Collectors.toList());
		System.out.println(output3);

		// 1.ѭ��
		list2.forEach(s -> System.out.println(s));
		// 2.ѭ��
		list2.forEach(System.out::println);
		// 3.ѭ��
		list2.stream().forEach(s -> System.out.println(s));

		// �����ض��Ľ�����ϣ�limit/skip���� limit ���� Stream ��ǰ�� n ��Ԫ�أ�skip �����ӵ�ǰ n ��Ԫ��:
		List<String> forEachLists = new ArrayList<>();
		forEachLists.add("a");
		forEachLists.add("b");
		forEachLists.add("c");
		forEachLists.add("d");
		forEachLists.add("e");
		forEachLists.add("f");
		List<String> output4 = forEachLists.stream().skip(2).limit(3)
				.collect(Collectors.toList());
		System.out.println(output4);

		// ����
		List<Integer> sortLists = new ArrayList<>();
		sortLists.add(1);
		sortLists.add(4);
		sortLists.add(6);
		sortLists.add(3);
		sortLists.add(2);
		List<Integer> afterSortLists = sortLists.stream()
				.sorted((In1, In2) -> In1 - In2).collect(Collectors.toList());
		System.out.println(afterSortLists);

		// ��һ�����Ͻ��в��أ�
		List<String> distinctList = new ArrayList<>();
		distinctList.add("a");
		distinctList.add("a");
		distinctList.add("c");
		distinctList.add("d");
		List<String> afterDistinctList = distinctList.stream().distinct()
				.collect(Collectors.toList());
		System.out.println(afterDistinctList);

		/*
		 * ƥ��(Match����)��
		 * �е�ʱ������ֻ��Ҫ�жϼ������Ƿ�ȫ�����������������жϼ������Ƿ�������������Ԫ�أ���ʱ��Ϳ���ʹ��match������
		 * allMatch��Stream ��ȫ��Ԫ�ط��ϴ���� predicate������ true 
		 * anyMatch��Stream ��ֻҪ��һ��Ԫ�ط��ϴ���� predicate������ true noneMatch��Stream ��û��һ��Ԫ�ط��ϴ����
		 * predicate������ true
		 */
		//6.1���жϼ�����û����Ϊ��c����Ԫ�أ�
		List<String> matchList = new ArrayList<>();
		matchList.add("a");
		matchList.add("a");
		matchList.add("c");
		matchList.add("d"); 
		boolean isExits = matchList.stream().anyMatch(s -> s.equals("c"));
		System.out.println(isExits);
		//�жϼ����Ƿ�ȫ��Ϊ��
		boolean isExits2 = matchList.stream().anyMatch(s -> !s.isEmpty());
		System.out.println(isExits2);
	}
}
