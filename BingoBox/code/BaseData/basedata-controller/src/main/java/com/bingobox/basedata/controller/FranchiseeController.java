package com.bingobox.basedata.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bingobox.basedata.service.FranchiseeService;
import com.bingobox.framework.common.BaseApiController;
import com.bingobox.framework.common.CommonPage;
import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import com.bingobox.framework.util.VaildatorUtils;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.CityPO;
import com.bingobox.basedata.po.FranchiseePO;
import com.bingobox.basedata.req.ReqBindBox;
import com.bingobox.basedata.req.ReqFranchiseeAdd;
import com.bingobox.basedata.req.ReqFranchiseeDetail;
import com.bingobox.basedata.req.ReqFranchiseeFinanceDetail;
import com.bingobox.basedata.req.ReqFranchiseeFinanceUpdate;
import com.bingobox.basedata.req.ReqFranchiseeList;
import com.bingobox.basedata.req.ReqFranchiseeUpdate;
import com.bingobox.basedata.po.FranchiseeFinancePO;


/**
 * 
 * @author ZhangNing
 *
 */
@Controller
@RequestMapping(value = "/api/franchisee")
public class FranchiseeController extends BaseApiController{

    @Autowired
    private FranchiseeService franchiseeService;

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    public JSONObject getJsonParam(HttpServletRequest request) throws IOException {
	    
		String body = "";
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		request.setCharacterEncoding("UTF-8");
		InputStream inputStream = request.getInputStream();
		if (inputStream != null) {
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
			char[] charBuffer = new char[128];
			int bytesRead = -1;
			while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
				stringBuilder.append(charBuffer, 0, bytesRead);
			}
		} else {
			stringBuilder.append("");
		}
		body = stringBuilder.toString();
		return JSONObject.parseObject(body);
	}
    /**
     * 
     * @return
     * @throws Exception
     */
    @RequestMapping("index")
    @ResponseBody
    public FranchiseePO getFranchisee() throws Exception {
        
        logger.info("FranchiseeController类getFranchisee()方法");
        return franchiseeService.getFranchisee(1L);
    }

    /**
     * 加盟商列表
     * @param reqFranchiseeList
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<FranchiseePO>> list(@RequestBody ReqFranchiseeList reqFranchiseeList) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeList);
        logger.info("FranchiseeController类list()方法");
        return franchiseeService.list(reqFranchiseeList.getFranchiseeCode(), reqFranchiseeList.getFranchiseeName(), reqFranchiseeList.getIsValid(),
        		 reqFranchiseeList.getPageNum(), reqFranchiseeList.getPageSize());
    }
 
    /**
     * 城市列表
     * @param request
     * @param response
     * @param modelMap
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/city/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CityPO>> cityList(@RequestParam(value = "parentRegionInfoId", required = true) Long parentRegionInfoId) throws Exception {
        logger.info("FranchiseeController类list()方法");
        return franchiseeService.cityList(parentRegionInfoId);

    }
    
    /**
     * 新建加盟商
     * @param reqFranchiseeAdd
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<JSONObject> add(@RequestBody ReqFranchiseeAdd reqFranchiseeAdd) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeAdd);
    	JSONObject param = JSONObject.parseObject(JSON.toJSONString(reqFranchiseeAdd));
		return franchiseeService.add(param);
    }
    
    /**
     * 新增加盟商财务信息
     * @param request
     * @param response
     * @param modelMap
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/finance/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<JSONObject> franchiseeFinanceAdd(HttpServletRequest request,
            HttpServletResponse response, org.springframework.ui.Model modelMap) throws Exception {
    	JSONObject param = this.getJsonParam(request);
		return franchiseeService.franchiseeFinanceAdd(param);
    }
    
    /**
     * 编辑加盟商 
     * @param request
     * @param response
     * @param modelMap
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<JSONObject> update(@RequestBody ReqFranchiseeUpdate reqFranchiseeUpdate) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeUpdate);
    	JSONObject param = JSONObject.parseObject(JSON.toJSONString(reqFranchiseeUpdate));
		return franchiseeService.update(param);
    }
    
    /**
     * 编辑加盟商财务信息
     * @param request
     * @param response
     * @param modelMap
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/franchiseeFinance/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<JSONObject> franchiseeFinanceUpdate(@RequestBody ReqFranchiseeFinanceUpdate reqFranchiseeFinance) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeFinance);
    	JSONObject param = JSONObject.parseObject(JSON.toJSONString(reqFranchiseeFinance));
		return franchiseeService.franchiseeFinanceUpdate(param);
    }   
    
    /**
     * 查看加盟商信息
     * @param reqFranchiseeDetail
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<FranchiseePO> detail(@RequestBody ReqFranchiseeDetail reqFranchiseeDetail) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeDetail);
        logger.info("FranchiseeController类detail()方法");
        return franchiseeService.detail(reqFranchiseeDetail.getFranchiseeId());
    }
  
    /**
     * 查看加盟商财务信息
     * @param reqFranchiseeFinanceDetail
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/franchiseeFinance/detail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<FranchiseeFinancePO> franchiseeFinanceDetail(@RequestBody ReqFranchiseeFinanceDetail reqFranchiseeFinanceDetail) throws Exception {
    	VaildatorUtils.validateEntity(reqFranchiseeFinanceDetail);
    	
        logger.info("FranchiseeController类franchiseefinanceDetail()方法");
        
        return franchiseeService.franchiseeFinanceDetail(reqFranchiseeFinanceDetail.getFranchiseeId());
    }
    
    /**
     * 盒子列表
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/box/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<JSONObject> boxList(@RequestParam(value = "franchiseeId", required = true) Long franchiseeId) throws Exception {
        
        logger.info("FranchiseeController类boxlist()方法");
        
        return franchiseeService.boxList(franchiseeId);
    }
    
    /**
     * 绑定盒子
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/bind/box", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Void> bindBox(@RequestBody ReqBindBox reqBindBox) throws Exception {
    	VaildatorUtils.validateEntity(reqBindBox);
    	
        logger.info("FranchiseeController类bindBox()方法");
        
        JSONObject param = JSONObject.parseObject(JSON.toJSONString(reqBindBox));
        return franchiseeService.bindBox(param);
    }
    
    /**
     * 解绑盒子
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "unbind/box", method = RequestMethod.POST)
    @ResponseBody
    public FranchiseePO unbindingBox() throws Exception {
        
        logger.info("FranchiseeController类boxlist()方法");
        
        
        return franchiseeService.getFranchisee(1L);
    }
}

