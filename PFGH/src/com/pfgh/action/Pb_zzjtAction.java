package com.pfgh.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.pfgh.entity.Pfgh_pb_hjjhs;
import com.pfgh.entity.Pfgh_pb_hkbhs;
import com.pfgh.entity.Pfgh_pb_pbyzhs;
import com.pfgh.entity.base.BasePb_zzjt;
import com.pfgh.service.Pb_zzjtService;

@Controller
@Scope("prototype")
public class Pb_zzjtAction {
	@Resource
	private Pb_zzjtService pb_zzjtService;
	
	private BasePb_zzjt zzjt;
	private BasePb_zzjt zzjt2;
	
	private List<Map<String,Object>> yzbzs;
	private String bdbh;
	private List<String> wqsls;
	private List<Pfgh_pb_pbyzhs> zhs;
	private List<Pfgh_pb_hjjhs> jhs;
	private List<Pfgh_pb_hkbhs> bhs;
	
	public String findSelect(){
		zzjt = pb_zzjtService.findWfbl(0);
		zzjt2 = pb_zzjtService.findDfbl(1);
		zhs = pb_zzjtService.findZhs();
		jhs = pb_zzjtService.findJhs();
		bhs = pb_zzjtService.findBhs();
		return "index";
	}
	
	public String findByBh(){
		yzbzs = pb_zzjtService.findByBh(bdbh);
		return "bdbh";
	}
	
	public String findByBh2(){
		wqsls = pb_zzjtService.findByBh2(bdbh);
		return "bdbh2";
	}
	
	public Pb_zzjtService getPb_zzjtService() {
		return pb_zzjtService;
	}

	public void setPb_zzjtService(Pb_zzjtService pb_zzjtService) {
		this.pb_zzjtService = pb_zzjtService;
	}

	public BasePb_zzjt getZzjt() {
		return zzjt;
	}

	public void setZzjt(BasePb_zzjt zzjt) {
		this.zzjt = zzjt;
	}

	public BasePb_zzjt getZzjt2() {
		return zzjt2;
	}

	public void setZzjt2(BasePb_zzjt zzjt2) {
		this.zzjt2 = zzjt2;
	}

	public String getBdbh() {
		return bdbh;
	}

	public void setBdbh(String bdbh) {
		this.bdbh = bdbh;
	}

	public List<Map<String, Object>> getYzbzs() {
		return yzbzs;
	}

	public void setYzbzs(List<Map<String, Object>> yzbzs) {
		this.yzbzs = yzbzs;
	}

	public List<String> getWqsls() {
		return wqsls;
	}

	public void setWqsls(List<String> wqsls) {
		this.wqsls = wqsls;
	}

	public List<Pfgh_pb_pbyzhs> getZhs() {
		return zhs;
	}

	public void setZhs(List<Pfgh_pb_pbyzhs> zhs) {
		this.zhs = zhs;
	}

	public List<Pfgh_pb_hjjhs> getJhs() {
		return jhs;
	}

	public void setJhs(List<Pfgh_pb_hjjhs> jhs) {
		this.jhs = jhs;
	}

	public List<Pfgh_pb_hkbhs> getBhs() {
		return bhs;
	}

	public void setBhs(List<Pfgh_pb_hkbhs> bhs) {
		this.bhs = bhs;
	}
}
