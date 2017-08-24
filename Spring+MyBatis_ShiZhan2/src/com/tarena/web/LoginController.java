package com.tarena.web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarena.dao.AdminMapper;
import com.tarena.entity.Admin;
import com.tarena.entity.Module;


/**
 *	��¼����
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {
	
	// ��¼У����
	private static final int SUCCESS = 0;
	private static final int ADMIN_CODE_ERROR = 1;
	private static final int PASSWORD_ERROR = 2;
	//private static final int IMAGE_CODE_ERROR = 3;
	
	@Resource
	private AdminMapper adminMapper;
	
	/**
	 * �򿪵�¼ҳ��
	 */
	@RequestMapping("/toLogin.form")
	public String toLogin() {
		return "main/login";
	}
	
	@RequestMapping("/toIndex.form")
	public String toIndex(){
		return "main/index";
	}
	
	@RequestMapping("/checkLogin.form")
	@ResponseBody
	public int checkLogin(String adminCode,String password,HttpSession session,HttpServletRequest request) {
	
		//�����˺Ų�ѯ����Ա
		Admin admin = adminMapper.findByCode(adminCode);
		System.out.println("adminCode="+adminCode);
		System.out.println("password="+password);
		//�жϹ���Ա�Ƿ����
		if(admin == null) {
			//����Ա������
			return ADMIN_CODE_ERROR;
		} else if (!admin.getPassword().equals(password)) {			
			//���벻��ȷ
			return PASSWORD_ERROR;
		} else {
			//�˺����붼��ȷ��У��ɹ�
			//����¼��Ϣ����session
			session.setAttribute("admin", admin);
			System.out.println(request.getSession().getAttribute("admin")+" bbbb");
			//��ѯ��ǰ�û����Է��ʵ�ģ�飬����session
			List<Module> modules = adminMapper.findModuleByAdmin(admin.getAdmin_id());
			
			session.setAttribute("userModules", modules);
			//�˺����붼��ȷ��У��ɹ�
			return SUCCESS;
		}		
	}
	
	
	
	
}
