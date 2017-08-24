package com.bingobox.basedata.dao;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.po.BoxFranchiseePO;
import com.bingobox.basedata.po.BoxPO;

import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public interface BoxDao {
    BoxPO getBoxById(Long boxId);

    List<BoxPO> listBoxByParam(BoxPO boxPO);

    Integer saveBox(BoxPO boxPO);

    Integer updateBox(BoxPO boxPO);

	List<BoxPO> franchiseeBoxList(JSONObject param);

    List<BoxFranchiseePO> listBoxByPage(BoxFranchiseePO boxFranchiseePO);

    List<BoxPO> listBoxFuzzyByBoxCode(BoxPO boxPO);

    List<BoxPO> listBoxByFranchiseeId(Long franchiseeId);
}
