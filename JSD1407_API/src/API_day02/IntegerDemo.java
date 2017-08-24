package API_day02;

public class IntegerDemo {
	public static void main(String[] args){
		String str = "123.123";   //要转换为int型 就必须不能有小数部分
		/**
		 * 将字符串转换为基本类型的前提是，
		 * 该字符串描述的必须是基本类型支持的
		 */
		/*int i = Integer.parseInt(str);   
		i++;
		System.out.println(i);*/   //如果这样写会报错，因为str有小数部分
		
		double j = Double.parseDouble(str);
		j++;
		System.out.print(j+"\n");
		
		float k = Float.parseFloat(str);
		k++;
		System.out.println(k);
	}

}
