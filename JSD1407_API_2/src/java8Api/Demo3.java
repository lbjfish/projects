package java8Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		
		//老方法
		for (Integer cost : costBeforeTax) {
		    double price = cost + .12*cost;
		    System.out.println(price);
		}
		
		//jdk1.8
		costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
		
		//老方法
		double total = 0;
		for (Integer cost : costBeforeTax) {
		    double price = cost + .12*cost;
		    total = total + price;
		}
		System.out.println("Total : " + total);
		 
		// 新方法：jdk1.8
		double bill = costBeforeTax.stream().map(cost -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);
	}
}
