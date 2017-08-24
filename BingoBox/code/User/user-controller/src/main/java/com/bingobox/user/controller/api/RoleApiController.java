package com.bingobox.user.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.common.CommonResultCode;
import com.bingobox.framework.common.GroupAdd;
import com.bingobox.framework.common.GroupSelect;
import com.bingobox.framework.common.GroupUpdate;
import com.bingobox.framework.util.VaildatorUtils;
import com.bingobox.user.controller.BaseController;
import com.bingobox.user.po.RoleInfo;
import com.bingobox.user.service.RoleService;

@RestController
@RequestMapping(value = "/api/user/role")
public class RoleApiController extends BaseController {

	@Autowired
	private RoleService roleService;

	/**
	 * 获取角色和权限列表
	 * 
	 * @param reqRoleList
	 * @return
	 */
	@RequestMapping(value = "/getRoleList", method = RequestMethod.POST)
	public CommonResult<Object> getRoleList(@RequestBody RoleInfo roleInfo) {
		CommonResult<Object> commonResult = checkToken(roleInfo.getToken());
		VaildatorUtils.validateEntity(roleInfo);
		List<RoleInfo> roleList = roleService.selectRoleList(roleInfo);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), roleList);
		return commonResult;
	}

	/**
	 * 获取角色和权限信息
	 * 
	 * @param roleInfo
	 * @return
	 */
	@RequestMapping(value = "/getRoleInfo", method = RequestMethod.POST)
	public CommonResult<Object> getRoleInfo(@RequestBody RoleInfo roleInfo) {
		CommonResult<Object> commonResult = checkToken(roleInfo.getToken());
		VaildatorUtils.validateEntity(roleInfo, GroupSelect.class);
		RoleInfo info = roleService.selectRoleInfo(roleInfo.getId());
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), info);
		return commonResult;
	}

	/**
	 * 新增角色和权限信息
	 * 
	 * @param roleInfo
	 * @return
	 */
	@RequestMapping(value = "/addRoleInfo", method = RequestMethod.POST)
	public CommonResult<Object> addRoleInfo(@RequestBody RoleInfo roleInfo) {
		CommonResult<Object> commonResult = checkToken(roleInfo.getToken());
		VaildatorUtils.validateEntity(roleInfo, GroupAdd.class);
		roleService.insertRoleInfo(roleInfo);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg());
		return commonResult;
	}

	/**
	 * 更新角色和权限信息
	 * 
	 * @param roleInfo
	 * @return
	 */
	@RequestMapping(value = "/updateRoleInfo", method = RequestMethod.POST)
	public CommonResult<Object> updateRoleInfo(@RequestBody RoleInfo roleInfo) {
		CommonResult<Object> commonResult = checkToken(roleInfo.getToken());
		VaildatorUtils.validateEntity(roleInfo, GroupUpdate.class);
		roleService.updateRoleInfo(roleInfo);
		commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg());
		return commonResult;
	}

}
