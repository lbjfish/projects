package CeShiDaiMa;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
//获取文件或目录的名字
//获取的是当前文件占用的字节量(long 型)
//查看当前文件是否在硬盘中真实存在
//当前文件最后的修改时间

public class test1 {
	public static void main(String[] args){
		File file = new File("."+File.separator+"/pw.txt");
		
		if(file.isFile()){
			System.out.println("文件存在");
		}else{
			System.out.println("文件不不存在");
		}
		
		String name = file.getName();
		System.out.println("名字："+name);
		
		long length = file.length();
		System.out.println("长度"+length);
		
		if(file.exists()){
			System.out.println("文件存在");
		}else{
			System.out.println("文件不存在");
		}
		
		long last = file.lastModified();
		Date date = new Date();
		date.setTime(last);
		String format = "yyyy年MM月dd天 hh：mm：ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String str = sdf.format(date);
		System.out.println(str);
	}

}
