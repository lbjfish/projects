package YiChang;

public class ExceptionDemo3 {
	public static void main(String[] args){
		System.out.print(test(null)+","+test("0")+","+test(""));
	}
   public static int test(String str){
	   try{
		   return str.charAt(0)-'0';
	   }catch(NullPointerException e){
		   return 1;
	   }catch(Exception e){
		   return 2;
	   }finally{
		   return 3;
	   }
   }
}
