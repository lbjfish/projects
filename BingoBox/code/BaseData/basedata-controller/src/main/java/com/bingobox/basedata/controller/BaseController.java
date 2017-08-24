package com.bingobox.basedata.controller;

import com.bingobox.framework.common.BaseApiController;
import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.exception.BusinessException;
import com.bingobox.framework.redis.RedisClient;
import com.bingobox.user.dto.UserDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class BaseController extends BaseApiController {

	@Autowired
	private RedisClient redisClient;

	/**
	 * 从缓存获取用户信息
	 * 
	 * @param token
	 * @return
	 * @throws IOException
	 */
	public UserDTO getUserInfoByToken(String token) throws IOException {
		UserDTO userDTO = redisClient.get(token, UserDTO.class);
		if (userDTO == null) {
			throw new BusinessException("用户Token失效");
		}
		return userDTO;
	}

	/**
	 * 校验token
	 * 
	 * @param token
	 * @return
	 * @throws IOException
	 */
	public CommonResult<Object> checkToken(String token) {
		if (StringUtils.isBlank(token)) {
			throw new BusinessException("token不能为空");
		}
		UserDTO userDTO = null;
		try {
			userDTO = redisClient.get(token, UserDTO.class);
		} catch (IOException e) {
			LOGGER.error("内部缓存读取失败", e);
			throw new BusinessException("内部缓存读取失败");
		}
		if (userDTO == null) {
			throw new BusinessException("token对象不存在");
		}
		return new CommonResult<Object>();

	}

}
