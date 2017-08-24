package com.bingobox.box.controller;

import com.bingobox.basedata.dto.BoxDTO;
import com.bingobox.basedata.service.api.BoxServiceApi;
import com.bingobox.box.dto.BoxInfoDTO;
import com.bingobox.framework.common.BaseApiController;
import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.common.CommonResultCode;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By yongfengdu on 2017/8/2
 * 查看盒子
 */
@RestController
@RequestMapping(value = "/api/box")
public class BoxController extends BaseApiController {

	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BoxServiceApi boxServiceApi;


	@RequestMapping(value = "/boxManagerList", method = RequestMethod.GET)
	public CommonResult<Object> boxManagerList(@RequestParam BoxDTO boxDto) {
		logger.info("BoxController类boxManagerList()方法");
        CommonResult<Object> commonResult = new CommonResult<Object>();
		try {

			List<BoxDTO> boxDtos = boxServiceApi.listBoxByParam(boxDto);
			List<BoxInfoDTO> boxInfoDtos = BingoBoxBeanUtils.generatorList(boxDtos,BoxInfoDTO.class);
			//add province name,city name
			//database has no box_type
			//database has no box_run_status
//			boxInfoDTO.setProvinceName("");
//			boxInfoDTO.setCityName("");
//			boxInfoDTO.setDistrictName("");
//			boxInfoDTO.setRunStatus("");
			commonResult.setData(boxInfoDtos);
			commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg());
		} catch (Exception e) {
			commonResult.setResult(CommonResultCode.SERVER_ERROR.getCode(),CommonResultCode.SERVER_ERROR.getMsg());
		}
		return commonResult;
	}




}
