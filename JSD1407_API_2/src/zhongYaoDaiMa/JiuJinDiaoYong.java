package zhongYaoDaiMa;
/**
 * java就近调用原则:
 * 1.如果方法调用的是基本类型，优先调用基本类型
 * 2.如果方法调用的是引用类型，优先调用引用类型
 * 3.如果下列方法中类型大小一样，则报错
 * 4.如果下列方法一个是Collection，一个是Object，优先调用Collection
 * 5.如果下列方法全是引用类型，但我们要求得到基本类型，java会自动拆装包
 * 把引用类型转换成基本类型，调用从小到大
 * @author soft01
 *
 */
public class JiuJinDiaoYong {
	public static void main(String[] args){
		byte s = 1;
		dosome(s);
	}
	public static void dosome(Short s){
		System.out.println("Short");
	}
	public static void dosome(byte s){
		System.out.println("byte");
	}
	public static void dosome(int s){
		System.out.println("int");
	}
	public static void dosom(Double s){
		System.out.println("Double");
	}

}
