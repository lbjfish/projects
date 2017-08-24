package day01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckCodeServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     
		System.out.print("checkcode...");
		/*
		 *一. 绘图
		 */
		//step1.
		BufferedImage image = new BufferedImage(80,30,BufferedImage.TYPE_INT_RGB);
		//step2,获得画笔
		Graphics g = image.getGraphics();
		//step3,给画笔设置颜色
		g.setColor(new Color(255,255,255)); //白色
		//step4,设置背景颜色
		g.fillRect(0, 0, 80, 30);
		//step5,设置前景颜色
		Random r = new Random();
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		//step6.绘图
		//设置字体，风格，大小
		g.setFont(new Font(null,Font.ITALIC,24));
		//取长度为5的字符串
		String number = getNumber(5); 
		
		
		//将验证码(number)绑订到session对象上
		HttpSession session = request.getSession();
		session.setAttribute("number", number);
		
		
		g.drawString(number, 5, 26);
		//step7,加一些干扰线
		for(int i=0;i<6;i++){
			g.drawLine(r.nextInt(80), r.nextInt(30), r.nextInt(80), r.nextInt(30));
		}
		/*
		 * 二.将图片压缩并发送给客户端
		 */
	   response.setContentType("image/jpeg");
	   OutputStream ops = response.getOutputStream(); //输出图片的流
	   //writer方法：会将原始图片（image）按照指定的算法（"jpeg")压缩
	   javax.imageio.ImageIO.write(image, "jpeg", ops);
	   ops.close();
	}
	private String getNumber(int size){
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String number = "";
		Random r = new Random();
		for(int i=0;i<size;i++){
			number+=str.charAt(r.nextInt(str.length()));
		}
		return number;
	}
}
