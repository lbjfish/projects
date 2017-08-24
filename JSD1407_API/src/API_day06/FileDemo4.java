package API_day06;

import java.io.File;

/**
 * 创建多级目录
 * @author soft01
 *
 */
public class FileDemo4 {
	public static void main(String[] args){
		File d= new File("a"+File.separator+
				           "b"+File.separator+
				           "c"+File.separator+
				           "d"+File.separator+
				           "e"+File.separator+
				           "f");
		if(!d.exists()){
			/*
			 * mkdir方法会创建当前目录
			 * 以及所有不存在的父目录
			 */
			d.mkdirs();
			System.out.println("搞定");
		}
		
		/**
		 * delete若删除一个目录
		 * 前提条件：该目录必须是空的（不能有其他目录或文件），
		 * 否则不能删除
		 */
//		if(d.exists()){
//			d.delete();
//			System.out.println("目录已经删除");
//		}
	}

}
