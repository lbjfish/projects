package API_2day_06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 客户端
 * @author soft01
 *
 */
public class Client {
	/**
	 * 客户端的启动方法
	 */
	public void start(){
		try{
			/*]
			 * 向服务端发送数据的步骤：
			 * 1：创建好Socket（一次就行）
			 * 2：准备数据
			 * 3：创建数据包
			 * 4：将数据存入包中（2，3是一步完成的）
			 * 5：将数据包通过socket发送给服务端
			 */
			DatagramSocket socket = new DatagramSocket();
			String str = "你好，服务端";
			byte[] data = str.getBytes();
			
			//打包：准备包裹，填写地址，装入数据
			InetAddress address = InetAddress.getByName("192.168.173.192");
			int port = 8088;
			
			DatagramPacket sendPacket = 
				new DatagramPacket(data,
						             data.length,
						             address,
						             port);
			//将数据发送出去
			socket.send(sendPacket);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		Client client = new Client();
		client.start();
	}

}
