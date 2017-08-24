package com.bingobox.user.req;

import org.hibernate.validator.constraints.NotBlank;

import com.bingobox.framework.common.CommonVO;

public class ReqLoginByPwd extends CommonVO {
	@NotBlank(message = "手机号码不能为空")
	private String mobile;

	@NotBlank(message = "密码不能为空")
	private String pwd;

	@NotBlank(message = "验证码不能为空")
	private String kaptcha;

	public ReqLoginByPwd() {
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getKaptcha() {
		return kaptcha;
	}

	public void setKaptcha(String kaptcha) {
		this.kaptcha = kaptcha;
	}

}
