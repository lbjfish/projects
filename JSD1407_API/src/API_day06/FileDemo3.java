package API_day06;

import java.io.File;

/**
 * File操作目录
 * @author soft01
 *
 */
public class FileDemo3 {
	public static void main(String[] args){
		File dir = new File("./src");  //也可以不写./
		/**
		 * 下面两个方法知道一个就行了
		 */
		if(dir.isFile()){
			System.out.println(dir.getName()+"是一个文件");
		}
		//判断当前File对表示的是否为一个目录  
		if(dir.isDirectory()){
			System.out.println(dir.getName()+"是一个目录");
		}
		
		/*
		 * 在当前项目根目录下创建一个目录test
		 */
		File d = new File("test");
		//判断当前目录是否已经不存在了
		if(!d.exists()){
			//创建目录
			d.mkdir();
			System.out.println("搞定");
		}
		
		//删除目录同样使用delete
		if(d.exists()){
			d.delete();
			System.out.println("目录已经删除");
		}
	}

}
