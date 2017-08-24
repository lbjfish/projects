package com.pfgh.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pfgh.annotation.MyBatisDao;
import com.pfgh.entity.Pfgh_ty_bbfa;
import com.pfgh.entity.Pfgh_ty_bdzb;
import com.pfgh.entity.Pfgh_ty_bzbs;
import com.pfgh.entity.Pfgh_ty_zbxh;
import com.pfgh.entity.Pfgh_ty_zysdwz;
import com.pfgh.entity.Pfgh_ty_zzbs;
import com.pfgh.entity.Pfgh_ty_zzxd;

@MyBatisDao
public interface Pfgh_ty_bbfaDao {
	
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
	 * （保卫目标）根据xdms 返回 性质、名称、经度、维度等
	 * @param xdms
	 * @return Pfgh_ty_bbfa 里的性质、名称、经度、维度等
	 */
	public List<Pfgh_ty_bzbs> findMXByNm(String xdms);
	
	/**
	 * （保卫目标）根据xdms 返回 性质、名称、经度、维度等
	 * @param xdms
	 * @return Pfgh_ty_zysd 里的性质、名称、经度、维度等
	 */
	public List<Pfgh_ty_zysdwz> findMXByNm2(String xdms);
	
	/**
	 * （部队部署） 根据fanm 返回 名称、级别、经度、维度等
	 * @param fanm
	 * @return list map
	 */
	public List<Map<String,Object>> findBdByNm(String fanm);
	
	/**
	 * 求雷达配属的名称
	 * @param fanm
	 * @return
	 */
	public List<Pfgh_ty_bdzb> findBdzbByMc(String fanm);
	
	/**
	 * 求雷达配属的性质
	 * @param fanm
	 * @return
	 */
	public List<Pfgh_ty_zbxh> findZbxhByXz(String zbxhnm);
	
	/**
	 * 求雷达配属的经纬度
	 * @param fanm
	 * @return
	 */
	public List<Pfgh_ty_zzbs> findZzbsByJW(String fanm);
	
	/**
	 * 求部队配属的名称点击
	 * @param bzsjbdnm
	 * @param fanm
	 * @return
	 */
	public List<Pfgh_ty_bdzb> findBdOneToOne(@Param("bzsjbdnm")String bzsjbdnm,@Param("fanm")String fanm);
}
