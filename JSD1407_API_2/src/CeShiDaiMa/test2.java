package CeShiDaiMa;

import java.io.File;
import java.io.FileFilter;

public class test2 {
	public static void main(String[] args){
		File dir = new File(".");
		FileFilter filter = new MyFilter();
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub);
		}
	}
}

class MyFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		return pathname.getName().startsWith(".");
	}
	
}