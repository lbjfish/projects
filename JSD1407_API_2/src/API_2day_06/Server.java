package API_2day_06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 服务�? */
public class Server {
	/**
	 * 服务端的启动方法
	 */
	public void start(){
		try{
			/*
			 * 接收包的步骤�?			 * 1：创建Socket（一次）
			 * 2：创建一个合适大小的�?			 * 3：�?过socket接收数据到包�?			 * 4：拆包取数据
			 */
			DatagramSocket socket = new DatagramSocket(8088);
			byte[] data = new byte[100];
			DatagramPacket recvPacket = new DatagramPacket(data,data.length);
			//接收数据到包�?			//注意，该方法是个阻塞方法�?		
			socket.receive(recvPacket);
			//拆包拿数�?			byte[] d = recvPacket.getData();  //通过包可以拿到数�?			//有效数据�?			int dlen = recvPacket.getLength();
			/**
			 * String(
			 *      byte[] b,
			 *      int offset,
			 *      int len,
			 *      String charsetName)
			
			 *      
			 *      将给定的字节数组中，从offset处开始连续len个字节，
			 *      再根据给定的字符转换为字符串
			 */
			String info = new String(d,0,dlen,"UTF-8");
			System.out.println("客户端说"+info);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Server server = new Server();
		server.start();
	}

}
