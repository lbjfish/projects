package API_day02;

public class SplitDemo2 {
	public static void main(String[] args){
	   String imgName= "aaaaaaaa.jpg";
	   /**
	    * 1���ȸ���"."����ַ���
	    * 2����ȡ��ǰϵͳʱ��ĺ���ֵ
	    * 3���ú���ֵƴ��һ����.����ƴ�Ϻ�׺
	    */
	   String[] names = imgName.split("\\.");
	   String name = ""+System.currentTimeMillis();
	   imgName = name+"."+names[1];
	   System.out.println(imgName);
	}

}
