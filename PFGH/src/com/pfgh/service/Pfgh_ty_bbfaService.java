package com.pfgh.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pfgh.entity.Pfgh_ty_bbfa;
import com.pfgh.entity.Pfgh_ty_bdzb;
import com.pfgh.entity.Pfgh_ty_zzxd;

public interface Pfgh_ty_bbfaService {
	/**
	 * 下拉列表
	 * @return 所有方案值
	 */
	public List<Pfgh_ty_bbfa> findFamc(); 
	
	/**
	 * 根据fanm查所有行动值
	 * @return 
	 */
	public List<Pfgh_ty_zzxd> findAllByFanm(String fanm);
	
	/**
	 * 把保卫目标的名称、性质、中心经度、中心纬度查出来（有两种可能）
	 * @param xdms
	 * @return
	 */
	public List<Map<String,Object>> findEntity(String xdms);
	
	/**
	 * 把部队部署的名称、性质、经度、纬度查出来
	 * @param fanm
	 * @return
	 */
	public List<Map<String,Object>> findBdByNm(String fanm);
	
	/**
	 * 把雷达配属的名称、雷达类型、经度、纬度查出来
	 * @param fanm
	 * @return
	 */
	public Map<String,Object> findLdByNm(String fanm);
	
	/**
	 * 求部队配属的名称点击
	 * @param bzsjbdnm
	 * @param fanm
	 * @return
	 */
	public List<Pfgh_ty_bdzb> findBdOneToOne(String bzsjbdnm,String fanm);
}
