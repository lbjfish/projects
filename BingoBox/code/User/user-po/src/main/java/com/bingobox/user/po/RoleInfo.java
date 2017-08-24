package com.bingobox.user.po;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.bingobox.framework.common.CommonVO;
import com.bingobox.framework.common.GroupAdd;
import com.bingobox.framework.common.GroupSelect;
import com.bingobox.framework.common.GroupUpdate;

public class RoleInfo extends CommonVO{
	@NotNull(message = "角色ID不能为空", groups = { GroupSelect.class, GroupUpdate.class })
	private Integer id;

	@NotBlank(message = "角色名称不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private String name;

	private String mark;

	@NotNull(message = "状态不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private Integer status;

	private Date createTime;

	@NotEmpty(message = "权限不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private List<RoleMenu> roleMenuList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark == null ? null : mark.trim();
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

	public List<RoleMenu> getRoleMenuList() {
		return roleMenuList;
	}

	public void setRoleMenuList(List<RoleMenu> roleMenuList) {
		this.roleMenuList = roleMenuList;
	}

}