package YiChang;
/**
 * java异常处理机制中的try catch
 * @author soft01
 *
 */
/*
 * 空指针异常
 */
public class ExceptionDemo1 {
	public static void main(String[] args){
		System.out.println("程序开始");
		
		try{
		String str = "";
		/**
		 * 当出现空指针后，jvm创建一个空指针异常的实例，将它抛出来
		 */
		System.out.println(str.length());
		//System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("出现了一个空指针");			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("出现下标越界");
		}catch(Exception e){
			System.out.println("QQ提示，请发送错误，我们有助于改善");
		}
		System.out.println("程序结束");
	}
    
}
