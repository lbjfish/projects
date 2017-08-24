package com.bingobox.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingobox.common.dto.MenuDTO;
import com.bingobox.common.service.api.MenuServiceApi;
import com.bingobox.framework.redis.RedisClient;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import com.bingobox.framework.util.MD5Utils;
import com.bingobox.user.dao.UserInfoMapper;
import com.bingobox.user.dto.UserDTO;
import com.bingobox.user.dto.UserLoginDTO;
import com.bingobox.user.framework.constant.UserConstant;
import com.bingobox.user.po.UserInfo;
import com.bingobox.user.service.UserService;
import com.bingobox.user.service.UserSystemService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper UserInfoMapper;

	@Autowired
	private UserSystemService userSystemService;

	@Autowired
	private MenuServiceApi menuServiceApi;

	@Autowired
	private RedisClient redisClient;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return UserInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserInfo record) {
		// TODO Auto-generated method stub
		return UserInfoMapper.insert(record);
	}

	@Override
	public UserInfo selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return UserInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(UserInfo record) {
		// TODO Auto-generated method stub
		return UserInfoMapper.update(record);
	}

	@Override
	public UserInfo selectByLoginName(String mobile) {
		return UserInfoMapper.selectByLoginName(mobile);
	}

	@Override
	public UserLoginDTO selectLoginInfo(UserInfo info) throws Exception {
		UserDTO userDTO = BingoBoxBeanUtils.generatorObject(info, UserDTO.class);
		String token = MD5Utils.MD5(UserConstant.USER_PREFIX + info.getMobile());
		redisClient.set(token, userDTO, UserConstant.USER_LOGIN_TIMEOUT);
		userDTO.setToken(token);

		List<Long> sysIdList = userSystemService.selectSysIdList(info.getId());
		List<MenuDTO> menuList = menuServiceApi.listMenuBySystemId(sysIdList);
		UserLoginDTO loginDTO = new UserLoginDTO();
		loginDTO.setUser(userDTO);
		loginDTO.setMenuList(menuList);
		return loginDTO;
	}

}
