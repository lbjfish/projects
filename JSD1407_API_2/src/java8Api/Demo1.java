package java8Api;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;

public class Demo1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 2, 1, 4);
		System.out.println(nums);
		
		//����1.8֮ǰ
		Collections.sort(nums, new Comparator<Integer>() {
		    @Override
		    public int compare(Integer a, Integer b) {
		        return b.compareTo(a);
		    }
		});
		
		//����1.8֮��
		Collections.sort(nums, (Integer a, Integer b) -> {
		    return b.compareTo(a);
		});
		//����1.8֮��
		List<Integer> afterSortLists = nums.stream().sorted((In1,In2)->
	       In1-In2).collect(Collectors.toList());
		System.out.println(afterSortLists);
		
		//�����߳�1.8֮ǰ
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		    System.out.println("Before Java8, too much code for too little to do");
		    }
		}).start();
		
		//�����߳�1.8֮��
		new Thread(() -> System.out.println("Java8, Lambda expression ro")).start();
		
		JButton show =  new JButton("Show");
		//��Ӽ�����1.8֮ǰ
		show.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    System.out.println("Event handling without lambda expression is boring");
		    }
		});
		
		//��Ӽ�����1.8֮��
		show.addActionListener((e) -> System.out.println("dasdskadjask"));
		
		
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		//ѭ�� 1.8֮ǰ
		for (String feature : features) {
		    System.out.println(feature);
		}
		
		//ѭ�� 1.8֮��
		features.forEach((ab) -> System.out.println(ab));
		//ѭ�� 1.8֮��
		features.forEach(System.out::println);
	}
}
