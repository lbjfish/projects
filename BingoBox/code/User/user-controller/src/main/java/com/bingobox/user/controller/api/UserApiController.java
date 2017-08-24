package com.bingobox.user.controller.api;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.common.CommonResultCode;
import com.bingobox.framework.common.GroupAdd;
import com.bingobox.framework.util.VaildatorUtils;
import com.bingobox.user.controller.BaseController;
import com.bingobox.user.dto.UserLoginDTO;
import com.bingobox.user.framework.constant.ResultCode;
import com.bingobox.user.framework.constant.StatusEnum;
import com.bingobox.user.framework.constant.UserConstant;
import com.bingobox.user.po.UserInfo;
import com.bingobox.user.req.ReqLoginByPwd;
import com.bingobox.user.req.ReqModifyPwd;
import com.bingobox.user.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserApiController extends BaseController {

	@Autowired
	private UserService userService;

	/**
	 * 创建用户
	 * 
	 * @param userInfo
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public CommonResult<Object> create(@RequestBody UserInfo userInfo) {
		CommonResult<Object> commonResult = checkToken(userInfo.getToken());
		VaildatorUtils.validateEntity(userInfo, GroupAdd.class);
		userInfo.setStatus(StatusEnum.USER_UN_ACTIVATION.getStatus());
		userService.insert(userInfo);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg());
		return commonResult;
	}

	/**
	 * 用户登录
	 * 
	 * @param mobile
	 *            手机号
	 * @param pwd
	 *            密码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public CommonResult<Object> loginByMobile(@RequestBody ReqLoginByPwd reqLoginByPwd) throws Exception {
		CommonResult<Object> commonResult = new CommonResult<>();
		VaildatorUtils.validateEntity(reqLoginByPwd);

		String kaptcha = getVerifyCode(UserConstant.USER_LOGIN_KAPTCHA_CODE_KEY);
		if (!reqLoginByPwd.getKaptcha().equals(kaptcha)) {
			commonResult.setResult(ResultCode.LOGIN_CODE_ERROR.getCode(), ResultCode.LOGIN_CODE_ERROR.getMsg());
			return commonResult;
		}
		UserInfo info = userService.selectByLoginName(reqLoginByPwd.getMobile());
		if (info == null) {
			commonResult.setResult(ResultCode.LOGIN_UNUSER.getCode(), ResultCode.LOGIN_UNUSER.getMsg());
			return commonResult;
		}
		if (!info.getPwd().equals(reqLoginByPwd.getPwd())) {
			commonResult.setResult(ResultCode.LOGIN_UNPWD.getCode(), ResultCode.LOGIN_UNPWD.getMsg());
			return commonResult;
		}
		UserLoginDTO loginDTO = userService.selectLoginInfo(info);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), loginDTO);
		return commonResult;
	}

	/**
	 * 修改密码
	 * 
	 * @param reqModifyPwd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
	public CommonResult<Object> modifyPwd(@RequestBody ReqModifyPwd reqModifyPwd) throws Exception {
		CommonResult<Object> commonResult = new CommonResult<>();
		VaildatorUtils.validateEntity(reqModifyPwd);
		UserInfo info = userService.selectByLoginName(reqModifyPwd.getMobile());
		if (info == null) {
			commonResult.setResult(ResultCode.LOGIN_UNUSER.getCode(), ResultCode.LOGIN_UNUSER.getMsg());
			return commonResult;
		}
		if (!info.getPwd().equals(reqModifyPwd.getOldPwd())) {
			commonResult.setResult(ResultCode.LOGIN_UNPWD.getCode(), ResultCode.LOGIN_UNPWD.getMsg());
			return commonResult;
		}
		info.setPwd(reqModifyPwd.getNewPwd());
		info.setStatus(StatusEnum.USER_ACTIVATION.getStatus());// 激活用户
		userService.update(info);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg());
		return commonResult;
	}

	private String getVerifyCode(String common) {
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if (common.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
}
