package com.pfgh.entity.base;

import java.util.List;

import com.pfgh.entity.Pb_dfbdcs;
import com.pfgh.entity.Pb_wfbdcs;
import com.pfgh.entity.Pb_zzjt;

/**
 * 实体类：Pbzzjt的基类(与数据库无关)
 * @author lbj
 *
 */
public class BasePb_zzjt extends Pb_zzjt {
	private List<Pb_wfbdcs> wfbdcs;
	private List<Pb_dfbdcs> dfbdcs;

	public List<Pb_wfbdcs> getWfbdcs() {
		return wfbdcs;
	}

	public void setWfbdcs(List<Pb_wfbdcs> wfbdcs) {
		this.wfbdcs = wfbdcs;
	}

	public List<Pb_dfbdcs> getDfbdcs() {
		return dfbdcs;
	}

	public void setDfbdcs(List<Pb_dfbdcs> dfbdcs) {
		this.dfbdcs = dfbdcs;
	}

	@Override
	public String toString() {
		return "BasePb_zzjt ["+super.toString() +", wfbdcs=" + wfbdcs +", dfbdcs="+ dfbdcs + "]";
	}
	
}
