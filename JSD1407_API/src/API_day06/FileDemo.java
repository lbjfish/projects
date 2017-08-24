package API_day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * File类
 * 用于描述文件系统中的一个文件或目录
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args){
		/**
		 * java.io.File
		 * 在eclipse中“.”表示当前项目的根目录
		 */
		File file = new File("."+File.separator+"/demo.txt");
		//System.out.print(file);
		
		/*
		 * 通过File我们可以获取文件或目录的属性信息
		 * 或者操作文件或目录（创建，删除）
		 * 但是不能对文件内容进行访问
		 */
		if(file.isFile()){
			System.out.println("是文件");
		}
		else{
			System.out.println("不是文件");
		}
		
		//获取文件或目录的名字
		String name = file.getName();
		System.out.println("名字："+name);
		
		//获取的是当前文件占用的字节量(long 型)
		long length = file.length();
		System.out.println("字节："+length);
		
		//查看当前文件是否在硬盘中真实存在
		if(file.exists()){
			System.out.println("存在");
		}
		else{
			System.out.println("不存在 ");
		}
		
		//当前文件最后的修改时间
		//2014年8月26日，15：49：46
		long last = file.lastModified();
		System.out.println(last);
		/*
		 * 1.long转换为Date
		 *    setTime(0
		 *  2.用SimpleDateFormat转换成字符串
		 */
		Date date = new Date();
		date.setTime(last);
		//2
		String format = "yyyy年M月dd日,HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		
		file.canRead(); //可读
		file.canWrite(); //可写
		file.canExecute(); //可运行
		file.isHidden();  //是否为隐藏文件
	}

}
