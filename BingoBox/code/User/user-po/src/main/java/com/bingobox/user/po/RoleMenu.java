package com.bingobox.user.po;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.bingobox.framework.common.CommonVO;
import com.bingobox.framework.common.GroupAdd;
import com.bingobox.framework.common.GroupUpdate;

public class RoleMenu extends CommonVO{
	private Long id;

	@NotNull(message = "角色ID不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private Integer roleId;

	@NotNull(message = "权限ID不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private Long menuId;

	@NotBlank(message = "权限名称不能为空", groups = { GroupAdd.class, GroupUpdate.class })
	private String menuName;

	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName == null ? null : menuName.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}