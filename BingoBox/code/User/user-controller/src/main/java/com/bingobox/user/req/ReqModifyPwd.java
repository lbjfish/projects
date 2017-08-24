package com.bingobox.user.req;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.validator.constraints.NotBlank;

import com.bingobox.framework.common.CommonVO;
import com.bingobox.framework.util.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ReqModifyPwd extends CommonVO {

	@NotBlank(message = "手机号码不能为空")
	private String mobile;

	@NotBlank(message = "旧密码不能为空")
	private String oldPwd;

	@NotBlank(message = "新密码不能为空")
	private String newPwd;

	public ReqModifyPwd() {
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Map<String,String> map = new HashMap<String, String>();
		map.put("mobile", "15801471128");
		map.put("oldPwd", "111111");
		map.put("newPwd", "111111");
		System.out.println(JsonUtils.toJSon(map));
	}

}
