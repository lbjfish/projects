package com.bingobox.basedata.service;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.BoxFranchiseePO;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.framework.common.CommonPage;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface BoxService {

    /**
     * 通过盒子id 获取盒子信息
     * @param boxId
     * @return
     */
    BoxPO getBoxByBoxId(Long boxId);

    /**
     *
     * @param param
     * @return
     */
	List<BoxPO> franchiseeBoxList(JSONObject param);

    /**
     * 分页查询盒子信息
     * @param boxFranchiseePO
     * @return
     * @throws Exception
     */
    CommonPage<BoxFranchiseePO> listBoxByPage(BoxFranchiseePO boxFranchiseePO, Integer pageNum, Integer pageSize) throws Exception;

    /**
     * 插入盒子信息
     * @param boxPO
     * @return
     * @throws Exception
     */
    Integer saveBox(BoxPO boxPO) throws Exception;

    /**
     * 修改盒子信息
     * @param boxPO
     * @return
     * @throws Exception
     */
    Integer updateBox(BoxPO boxPO) throws Exception;

    /**
     * 通过盒子编号模糊查询盒子列表
     * @param boxCode
     * @return
     * @throws Exception
     */
    List<BoxPO> listBoxFuzzyByBoxCode(String boxCode) throws Exception;

    /**
     * 通过加盟商id查询盒子列表
     * @param franchiseeId
     * @return
     * @throws Exception
     */
    List<BoxPO> listBoxByFranchiseeId(Long franchiseeId) throws Exception;
}
