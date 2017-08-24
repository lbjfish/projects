package java8Api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * java8���������ڴ��ľ���lambda��������map��reduce��map��reduce���Թ��ɼ������еĺ���ʽ������
 * @author Administrator
 *
 */
public class Demo5 {
	
	public static void main(String[] args) {
		//map
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> doubleNumbers = numbers.stream().map(number -> number * 2).collect(Collectors.toList());
        //�����[#1, #2, #3, #4]
        System.out.println(doubleNumbers);
        
        //reduce
        //1.���ṩ��ʼֵ��reduce������ֵ��Optional����ʾ����Ϊ�գ�ʹ��orElseGet���Է���һ��nullʱ��Ĭ��ֵ
        final List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);
        final Integer sum = numbers3.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
	}

}
