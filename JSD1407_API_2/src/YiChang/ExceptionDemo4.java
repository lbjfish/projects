package YiChang;

public class ExceptionDemo4 {
	public static void main(String[] args){
		System.out.println("程序开始了");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			e.printStackTrace(); //如果找不到错，就把错误输出出来。
			//查看错误信息
			System.out.println(e.getMessage());
			System.ou.t.println("出错了");
		}
		System.out.println("程序结束了");
	}

}
