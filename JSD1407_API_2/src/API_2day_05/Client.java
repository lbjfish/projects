package API_2day_05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端应用程序
 * @author soft01
 *
 */
public class Client {
	//Socket，用于连接服务端的ServerSocket
	private Socket socket;
	
	/**
	 * 客户端构造方法，用于初始化客户端
	 * @param args
	 * @throws Exception 
	 */
	public Client() throws Exception{
		try {
			/*
			 * 创建Socket对象时，就会尝试根据给定的地址与端口连接服务端。
			 * 所以，若该对象创建成功，说明与服务端连接正常。
			 */
			System.out.println("正在连接服务端。。。");
			socket = new Socket("192.168.173.192",8088);
			System.out.println("成功连接服务端");
		} catch (Exception e) {
			throw e;
		}
	}
	/**
	 * 客户端启动工作
	 * @param args
	 */
	public void start(){
		try {
			//创建并启动线程，来接收服务端的消息
			Runnable runn = new GetServerInfoHandler();
			Thread t = new Thread(runn);
			t.start();
			/*
			 * 可以通过Socket的getOutputStream（）方法获取一条输出流，
			 * 用于将信息发送至服务端
			 */
			OutputStream out = socket.getOutputStream();
			/*
			 * 使用字符流来根据指定的编码集将字符串转换为字节后，
			 * 再通过out发送给服务端
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		
			PrintWriter pw = new PrintWriter(osw,true);
			Scanner scan = new Scanner(System.in);
			//输出欢迎用语
			System.out.println("欢迎来到lbj聊天室");
			/*
			 * 首先输出昵称
			 */
			while(true){
				System.out.println("请输入昵称");
				String nickname = scan.nextLine();
				if(nickname.trim().length()>0){
					pw.println(nickname);
					break;
				}
				System.out.println("昵称不能为空");
			}
			
			while(true){
				//String str = scan.nextLine();
				pw.println(scan.nextLine());
				//pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		try{
			Client client = new Client();
			client.start();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("客户端初始化失败");
		}
	}
	
	/**
	 * 该线程的作用是循环接收服务端发送过来的信息，并输出到控制台
	 * 
	 * 客户端不能说一句，服务端发一句，如果客户端不说，服务端想说
	 * 一句那就不行了，所以必须保证时时刻刻听，时时刻刻发
	 */
	class GetServerInfoHandler implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
		
			try {
				/*
				 * 通过Socket获取输入流
				 */
				InputStream in = socket.getInputStream();
				//将输入流转换为字符输入流，制定编码
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				//将字符输入流转换为缓冲流
				BufferedReader br = new BufferedReader(isr);
				String message=null;
				//循环读取服务端发送的每一个字符串
				while((message=br.readLine())!=null){
					//将服务端发送的字符串输出到控制台
					System.out.println(message);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
		
	}
}
