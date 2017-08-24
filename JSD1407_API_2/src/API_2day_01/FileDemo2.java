package API_2day_01;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles 方法支持文件过滤器
 * 
 * FileFilter接口
 * 实现该接口需要实现抽象方法：
 * boolean accept(File f)
 * 该方法要求我们定义过滤条件
 * 
 * listFiles方法会将当前目录下满足accept
 * 方法的子项返回
 * @author soft01
 *
 */
public class FileDemo2 {
	public static void main(String[] args){
		//创建过滤器实例
	   File dir = new File(".");

	   if(dir.isDirectory()){
		   FileFilter filter = new MyFilter();
		   //使用过滤器过滤子项
		   File[] subs = dir.listFiles(filter);
		   for(File sub : subs){
			   System.out.println(sub.getName());
		   }
	   }
	}
}

class MyFilter implements FileFilter{
	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.getName().startsWith(".");
	}
}