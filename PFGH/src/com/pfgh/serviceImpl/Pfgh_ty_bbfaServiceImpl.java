package com.pfgh.serviceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfgh.dao.Pfgh_ty_bbfaDao;
import com.pfgh.entity.Pfgh_ty_bbfa;
import com.pfgh.entity.Pfgh_ty_bdzb;
import com.pfgh.entity.Pfgh_ty_bzbs;
import com.pfgh.entity.Pfgh_ty_zbxh;
import com.pfgh.entity.Pfgh_ty_zysdwz;
import com.pfgh.entity.Pfgh_ty_zzbs;
import com.pfgh.entity.Pfgh_ty_zzxd;
import com.pfgh.service.Pfgh_ty_bbfaService;

@Service
@Transactional
public class Pfgh_ty_bbfaServiceImpl implements Pfgh_ty_bbfaService{
	
	@Resource
	private Pfgh_ty_bbfaDao pfgh_ty_bbfaDao;
	
	@Override
	public List<Pfgh_ty_bbfa> findFamc() {
		return pfgh_ty_bbfaDao.findFamc();
	}

	@Override
	public List<Pfgh_ty_zzxd> findAllByFanm(String fanm) {
		return pfgh_ty_bbfaDao.findAllByFanm(fanm);
	}

	@Override
	public List<Map<String, Object>> findEntity(String xdms) {
		if(xdms == null){
			return null;
		}else{
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			String xdmss[] = xdms.split(",");
			for(int i=0;i<xdmss.length;i++){
				Map<String,Object> map = new LinkedHashMap<String,Object>();
				List<Pfgh_ty_bzbs> bzbss = pfgh_ty_bbfaDao.findMXByNm(xdmss[i]);
				List<Pfgh_ty_zysdwz> zys = pfgh_ty_bbfaDao.findMXByNm2(xdmss[i]);
				if(bzbss.size() != 0){
					double centerJd = 0.0;
					double centerWd = 0.0;
					for(int j=0;j<bzbss.size();j++){
						centerJd = centerJd + bzbss.get(j).getJd();
						centerWd = centerWd + bzbss.get(j).getWd();
					}
					centerJd = centerJd/bzbss.size();
					centerWd = centerWd/bzbss.size();
					BigDecimal centerJd1 = new BigDecimal(centerJd);
					BigDecimal centerWd1 = new BigDecimal(centerWd);
					map.put("mc", bzbss.get(0).getBlqfbz().getBzmc());
					map.put("xz", bzbss.get(0).getBlqfbz().getBzlb());
					map.put("zxjd", centerJd1.setScale(3,BigDecimal.ROUND_HALF_UP));
					map.put("zxwd", centerWd1.setScale(3,BigDecimal.ROUND_HALF_UP));
					list.add(map);
				}else if(zys.size() != 0){
					double centerJd = 0.0;
					double centerWd = 0.0;
					for(int j=0;j<zys.size();j++){
						centerJd = centerJd + zys.get(j).getJd();
						centerWd = centerWd + zys.get(j).getWd();
					}
					centerJd = centerJd/zys.size();
					centerWd = centerWd/zys.size();
					BigDecimal centerJd1 = new BigDecimal(centerJd);
					BigDecimal centerWd1 = new BigDecimal(centerWd);
					map.put("mc", zys.get(0).getZysds().getSdmc());
					map.put("xz", zys.get(0).getZysds().getSdxz());
					map.put("zxjd", centerJd1.setScale(3,BigDecimal.ROUND_HALF_UP));
					map.put("zxwd", centerWd1.setScale(3,BigDecimal.ROUND_HALF_UP));
					list.add(map);
				}
			}
			return list;
		}
	}

	@Override
	public List<Map<String, Object>> findBdByNm(String fanm) {
		return pfgh_ty_bbfaDao.findBdByNm(fanm);
	}

	@Override
	public Map<String, Object> findLdByNm(String fanm) {
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		List<Pfgh_ty_bdzb> bdzbs = pfgh_ty_bbfaDao.findBdzbByMc(fanm);
		map.put("mc", bdzbs.get(0).getZbmc());
		List<Pfgh_ty_zbxh> zbxhs =  pfgh_ty_bbfaDao.findZbxhByXz(bdzbs.get(0).getZbxhnm());
		map.put("lx", zbxhs.get(0).getZbxhmc());
		List<Pfgh_ty_zzbs> zzbss = pfgh_ty_bbfaDao.findZzbsByJW(fanm);
		map.put("jd", zzbss.get(0).getJd());
		map.put("wd", zzbss.get(0).getWd());
		return map;
	}

	@Override
	public List<Pfgh_ty_bdzb> findBdOneToOne(String bzsjbdnm, String fanm) {
		return pfgh_ty_bbfaDao.findBdOneToOne(bzsjbdnm, fanm);
	}
	
}
