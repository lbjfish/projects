package java8Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo2 {
	private static int count = 0;
	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		System.out.println("Languages which starts with J :");
		filter(languages, str -> ((String) str).startsWith("J"));

		System.out.println("Languages which ends with a ");
		System.out.println(count);
		filter(languages, str -> ((String) str).endsWith("a"));
		System.out.println(count);
		
		System.out.println("Print all languages :");
		filter(languages, str -> true);

		System.out.println("Print no language : ");
		filter(languages, str -> false);

		System.out.println("Print language whose length greater than 4:");
		filter(languages, str -> ((String) str).length() > 4);
		
		
	}
	//方法一
	public static void filter(List<String> names, Predicate<String> condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}
	//方法二
	public static void filter2(List<String> names, Predicate<String> condition) {
	    names.stream().filter(name -> (condition.test(name))).forEach(name -> {
	    	count++;
	        System.out.println(name + " ");
	    });
	}
	
}
