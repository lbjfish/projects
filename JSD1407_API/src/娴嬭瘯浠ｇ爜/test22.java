package ²âÊÔ´úÂë;

public class test22{
	public static void main(String[] args){
		String  path = "C:\\myfile\\2000\\result.txt";
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index+1);
		String newName = fileName.replace(".txt", ".java");
		System.out.println(path);
		System.out.println(fileName);
		System.out.println(newName);
	}
}
