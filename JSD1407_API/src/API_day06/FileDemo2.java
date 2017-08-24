package API_day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建或删除一个文件
 * @author soft01
 *
 */
public class FileDemo2 {
    public static void main(String [] args) throws IOException{
    	/*
    	 * 在当前项目的根目录下创建一个名为
    	 * test.txt文件
    	 */
    	//不写"./"也表示在当前项目根目录下
    	File file = new File("test.txt");
    	//文件不存在则创建
//    	if(!file.exists()){
//    		file.createNewFile();
//    	}else{
//    		System.out.println("该文件已存在");
//    	}
//    	System.out.println("搞定");
    	
    	/**
    	 * 先判断该文件是否存在，存在就删除
    	 */
    	if(file.exists()){
    		file.delete();
    		System.out.println("文件已经删除");
    	}
    }

}
