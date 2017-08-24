package API_2day_01;

import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) {
		String str = "abce";
		try {
			byte[] by = str.getBytes("UTF-8");
			for(byte b : by){
				System.out.println(b);
			}
			String st = new String(by,"UTF-8");
			System.out.println(st);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
