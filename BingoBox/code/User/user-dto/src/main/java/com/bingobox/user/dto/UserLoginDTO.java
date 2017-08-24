package com.bingobox.user.dto;

import java.io.Serializable;
import java.util.List;

import com.bingobox.common.dto.MenuDTO;

public class UserLoginDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1288074721157602602L;
	private UserDTO user;
	private List<MenuDTO> menuList;

	public UserLoginDTO() {
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public List<MenuDTO> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuDTO> menuList) {
		this.menuList = menuList;
	}

}
