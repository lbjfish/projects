package CeShiDaiMa;

import java.io.File;
import java.io.IOException;

public class test3 {
	public static void main(String[] args){
	   File file = new File("a"+File.separator+
			                  "b"+File.separator+
			                  "c"+File.separator+
			                  "e"+File.separator+
			                  "f"+File.separator+
			                  "g"+File.separator+
			                  "h"+File.separator+
			                  "i"+File.separator+
			                  "g.txt");
	   File parent = file.getParentFile();
	   if(!parent.exists()){
		   parent.mkdirs();
	   }
	   
	   if(!file.exists()){
		   try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   System.out.println("创建成功");
	}

}
