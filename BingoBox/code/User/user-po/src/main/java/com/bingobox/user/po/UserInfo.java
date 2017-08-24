package com.bingobox.user.po;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.bingobox.framework.common.CommonVO;
import com.bingobox.framework.common.GroupAdd;

public class UserInfo extends CommonVO{
	private Long id;

	
	private String userName;

	private String nickName;

	@NotBlank(message="手机号码不能为空",groups={GroupAdd.class})
	private String mobile;

	@NotBlank(message="密码不能为空",groups={GroupAdd.class})
	private String pwd;

	private String email;

	private Integer status;

	private Date createTime;

	private Date updateTime;
	
	private List<UserRole> userRoleList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
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
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}