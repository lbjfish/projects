package API_day02;

public class SplitDemo2 {
	public static void main(String[] args){
	   String imgName= "aaaaaaaa.jpg";
	   /**
	    * 1：先根据"."拆分字符串
	    * 2：获取当前系统时间的毫秒值
	    * 3：用毫秒值拼上一个“.”再拼上后缀
	    */
	   String[] names = imgName.split("\\.");
	   String name = ""+System.currentTimeMillis();
	   imgName = name+"."+names[1];
	   System.out.println(imgName);
	}

}
