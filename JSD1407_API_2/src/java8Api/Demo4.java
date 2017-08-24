package java8Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {

		// 创建一个流
		Stream<String> stream = Stream.of("a", "b", "c");
		System.out.println(stream);

		// 1.将数组转换为一个流
		String[] strArray = new String[] { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(strArray);
		System.out.println(stream2);

		// 2.将数组转换为一个流
		Stream<String> stream3 = Arrays.stream(strArray);
		System.out.println(stream3);

		// 将集合转换成一个流
		List<String> list = Arrays.asList(strArray);
		Stream<String> stream4 = list.stream();
		System.out.println(stream4);

		// 遍历操作(map)
		List<String> output = stream4.map(String::toUpperCase).collect(
				Collectors.toList());
		// List<String> output5 = stream4.collect(Collectors.toList());
		System.out.println(output);

		// 平方数
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> output2 = list2.stream().map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println(output2);

		// 过滤
		List<String> list3 = Arrays.asList("", "ab", "cd");
		List<String> output3 = list3.stream().filter(str -> str.isEmpty())
				.collect(Collectors.toList());
		System.out.println(output3);

		// 1.循环
		list2.forEach(s -> System.out.println(s));
		// 2.循环
		list2.forEach(System.out::println);
		// 3.循环
		list2.stream().forEach(s -> System.out.println(s));

		// 返回特定的结果集合（limit/skip）： limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素:
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

		// 排序
		List<Integer> sortLists = new ArrayList<>();
		sortLists.add(1);
		sortLists.add(4);
		sortLists.add(6);
		sortLists.add(3);
		sortLists.add(2);
		List<Integer> afterSortLists = sortLists.stream()
				.sorted((In1, In2) -> In1 - In2).collect(Collectors.toList());
		System.out.println(afterSortLists);

		// 对一个集合进行查重：
		List<String> distinctList = new ArrayList<>();
		distinctList.add("a");
		distinctList.add("a");
		distinctList.add("c");
		distinctList.add("d");
		List<String> afterDistinctList = distinctList.stream().distinct()
				.collect(Collectors.toList());
		System.out.println(afterDistinctList);

		/*
		 * 匹配(Match方法)：
		 * 有的时候，我们只需要判断集合中是否全部满足条件，或者判断集合中是否有满足条件的元素，这时候就可以使用match方法：
		 * allMatch：Stream 中全部元素符合传入的 predicate，返回 true 
		 * anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true noneMatch：Stream 中没有一个元素符合传入的
		 * predicate，返回 true
		 */
		//6.1、判断集合中没有有为‘c’的元素：
		List<String> matchList = new ArrayList<>();
		matchList.add("a");
		matchList.add("a");
		matchList.add("c");
		matchList.add("d"); 
		boolean isExits = matchList.stream().anyMatch(s -> s.equals("c"));
		System.out.println(isExits);
		//判断集合是否全不为空
		boolean isExits2 = matchList.stream().anyMatch(s -> !s.isEmpty());
		System.out.println(isExits2);
	}
}
