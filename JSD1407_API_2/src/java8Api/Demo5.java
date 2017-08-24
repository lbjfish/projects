package java8Api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * java8中最受人期待的就是lambda，引入了map和reduce。map和reduce可以构成几乎所有的函数式操作。
 * @author Administrator
 *
 */
public class Demo5 {
	
	public static void main(String[] args) {
		//map
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> doubleNumbers = numbers.stream().map(number -> number * 2).collect(Collectors.toList());
        //结果：[#1, #2, #3, #4]
        System.out.println(doubleNumbers);
        
        //reduce
        //1.不提供初始值的reduce，返回值是Optional，表示可能为空，使用orElseGet可以返回一个null时的默认值
        final List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);
        final Integer sum = numbers3.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
	}

}
