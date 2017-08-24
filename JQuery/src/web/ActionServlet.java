package web;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.Stock;

public class ActionServlet extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uri = request.getRequestURI();
		String action = 
			uri.substring(uri.lastIndexOf("/"),
					uri.lastIndexOf("."));
		if(action.equals("/getPrice")){
			String flight = request.getParameter("flight");
			if("CA1000".equals(flight)){
				out.println("ͷ�Ȳ�:��2400<br/>�����:��2200");
			}else{
			   out.println("ͷ�Ȳ�:��1600<br/>�����:��1400");
			}
		}else if(action.equals("/quoto")){
		
			List<Stock> stocks = new ArrayList<Stock>();
			Random r = new Random();
			for(int i = 0;i < 8;i ++){
				Stock s = new Stock();
				s.setCode("60001" + r.nextInt(10));
				s.setName("ɽ������" + r.nextInt(10));
				s.setPrice(10 + r.nextInt(100));
				stocks.add(s);
			}
			//java������ɵ�����Ҳ����ʹ��
			//JSONArray��ת����
			JSONArray jsonArry = JSONArray.fromObject(stocks);
			String jsonStr =jsonArry.toString();
			System.out.println(jsonStr);
			out.println(jsonStr);
		}else if(action.equals("/fileupload")){
			//step1.����һ��DiskFileItemFactory��������Ϊ�������ṩ����ʱ��ȱʡ������
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			//step2.����������
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			//step3.ʹ�ý�����
			/**
			 * �������Ὣ����֮��Ľ���װ��FileItem�������棨һ���?���Ӧһ��FileItem����
			 */
			try {
				List<FileItem> items = sfu.parseRequest(request);
				for(int i=0;i<items.size();i++){
					FileItem item = items.get(i);
					if(item.isFormField()){
						//��ͨ�?��
						String name = item.getFieldName();
						String value = item.getString();
						System.out.println(name+","+value);
					}else{
						//�ϴ��ļ���
						ServletContext sctx = getServletContext();
						//getRealPath:�����߼�·�����ʵ�ʲ���ʱ������·��
						String path = sctx.getRealPath("upload");
						System.out.println(path);
						//����ϴ��ļ������
						String fileName = item.getName();
						File file = new File(path+File.separator+fileName);
						try {
							item.write(file);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.close();
	}

}
