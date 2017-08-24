package com.bingobox.basedata.controller.api;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.controller.BaseController;
import com.bingobox.basedata.framework.basedataenum.CoordinateSystemEnum;
import com.bingobox.basedata.po.BoxFranchiseePO;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.basedata.req.ReqBox;
import com.bingobox.basedata.req.ReqBoxFranchisee;
import com.bingobox.basedata.service.BoxService;
import com.bingobox.framework.common.*;
import com.bingobox.framework.constant.BingoBoxConstants;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import com.bingobox.framework.util.VaildatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Controller
@RequestMapping(value ="/api/box")
public class BoxController extends BaseController {

    @Autowired
    private BoxService boxService;

    /**
     * 分页查询盒子信息
     * @param reqBoxFranchisee
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "list", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> list(@RequestBody ReqBoxFranchisee reqBoxFranchisee) throws Exception{
        BoxFranchiseePO boxFranchiseePO = BingoBoxBeanUtils.generatorObject(reqBoxFranchisee, BoxFranchiseePO.class);
        Integer pageNum = reqBoxFranchisee.getPageNum();
        Integer pageSize =reqBoxFranchisee.getPageSize();
        CommonPage<BoxFranchiseePO>  commonPage = boxService.listBoxByPage(boxFranchiseePO, pageNum, pageSize);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("commonPage", commonPage);
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), jsonObject);
        return commonResult;
    }

    /**
     * 插入盒子信息
     * @param reqBox
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> save(@RequestBody ReqBox reqBox) throws Exception{
        VaildatorUtils.validateEntity(reqBox, GroupAdd.class);
        BoxPO boxPO = BingoBoxBeanUtils.generatorObject(reqBox, BoxPO.class);
        boxPO.setCoordinateSystem(CoordinateSystemEnum.GAODE.getKey());
        boxPO.setLastUpdateTime(new Date());
        //TODO 获取当前用户信息
        boxPO.setLastUpdateUserId(1L);
        boxPO.setCreateUserId(1L);
        boxPO.setCreateTime(new Date());
        boxPO.setIsDelete(BingoBoxConstants.IS_DELETE.NO);
        Integer saveRowsCount = boxService.saveBox(boxPO);
        CommonResult<Object> commonResult = checkToken(reqBox.getToken());
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), saveRowsCount);
        return commonResult;
    }

    /**
     * 通过盒子id获取盒子信息
     * @param boxId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getboxbyid/{boxId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> getBoxById(@PathVariable("boxId") Long boxId) throws Exception{
        BoxPO boxPO = boxService.getBoxByBoxId(boxId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("boxPO", boxPO);
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), jsonObject);
        return commonResult;
    }

    /**
     * 修改盒子信息
     * @param reqBox
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> update(@RequestBody ReqBox reqBox)throws Exception{
        VaildatorUtils.validateEntity(reqBox, GroupUpdate.class);
        BoxPO boxPO = BingoBoxBeanUtils.generatorObject(reqBox, BoxPO.class);
        boxPO.setLastUpdateTime(new Date());
        //TODO 获取当前用户
        boxPO.setLastUpdateUserId(1L);
        Integer count = boxService.updateBox(boxPO);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("boxPO", boxPO);
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), jsonObject);
        return commonResult;
    }


    /**
     * 通过盒子编号模糊查询盒子信息
     * @param boxCode
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "fruzzysearch/{boxCode}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> fruzzySearch(@PathVariable String boxCode)throws Exception{
        List<BoxPO> boxPOs = boxService.listBoxFuzzyByBoxCode(boxCode);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("boxPOs", boxPOs);
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), jsonObject);
        return commonResult;
    }

    /**
     * 通过加盟商id查询盒子列表
     * @param franchiseeId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getboxbyfranchiseeid/{franchiseeId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> getBoxByFranchiseeId(@PathVariable Long franchiseeId) throws Exception{
        List<BoxPO> boxPOs = boxService.listBoxByFranchiseeId(franchiseeId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("boxPOs", boxPOs);
        CommonResult<Object> commonResult = new CommonResult<>();
        commonResult.setResult(CommonResultCode.SUCCESS.getCode(), CommonResultCode.SUCCESS.getMsg(), jsonObject);
        return commonResult;
    }


}
