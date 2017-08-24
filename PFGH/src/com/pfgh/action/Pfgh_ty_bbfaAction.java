package com.pfgh.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.pfgh.entity.Pfgh_ty_bbfa;
import com.pfgh.entity.Pfgh_ty_bdzb;
import com.pfgh.entity.Pfgh_ty_zzxd;
import com.pfgh.service.Pfgh_ty_bbfaService;

@Controller
@Scope("prototype")
public class Pfgh_ty_bbfaAction {
	
	@Resource
	private Pfgh_ty_bbfaService bbfaService;
	
	private List<Pfgh_ty_bbfa> famcs;
	private List<Pfgh_ty_zzxd> zzxds;
	private List<Map<String,Object>> mapList;
	private List<Pfgh_ty_bdzb> bdzbs;
	private Map<String,Object> map;
	private String fanm;
	private String xdms;
	private String bzsjbdnm;
	
	public String index(){
		famcs = bbfaService.findFamc();
		return "index";
	}
	
	public String findSelect(){
		zzxds = bbfaService.findAllByFanm(fanm);
		return "select";
	}
	
	public String findBwmb(){
		mapList = bbfaService.findEntity(xdms);
		return "bwmb";
	}
	
	public String findBdbs(){
		mapList = bbfaService.findBdByNm(fanm);
		return "bdbs";
	}
	
	public String findBdbs2(){
		bdzbs = bbfaService.findBdOneToOne(bzsjbdnm, fanm);
		return "bdbs2";
	}
	
	public String findLdps(){
		map = bbfaService.findLdByNm(fanm);
		return "ldps";
	}

	public Pfgh_ty_bbfaService getBbfaService() {
		return bbfaService;
	}

	public void setBbfaService(Pfgh_ty_bbfaService bbfaService) {
		this.bbfaService = bbfaService;
	}

	public List<Pfgh_ty_bbfa> getFamcs() {
		return famcs;
	}

	public void setFamcs(List<Pfgh_ty_bbfa> famcs) {
		this.famcs = famcs;
	}

	public List<Pfgh_ty_zzxd> getZzxds() {
		return zzxds;
	}

	public void setZzxds(List<Pfgh_ty_zzxd> zzxds) {
		this.zzxds = zzxds;
	}

	public String getFanm() {
		return fanm;
	}

	public void setFanm(String fanm) {
		this.fanm = fanm;
	}

	public List<Map<String, Object>> getMapList() {
		return mapList;
	}

	public void setMapList(List<Map<String, Object>> mapList) {
		this.mapList = mapList;
	}

	public String getXdms() {
		return xdms;
	}

	public void setXdms(String xdms) {
		this.xdms = xdms;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Pfgh_ty_bdzb> getBdzbs() {
		return bdzbs;
	}

	public void setBdzbs(List<Pfgh_ty_bdzb> bdzbs) {
		this.bdzbs = bdzbs;
	}

	public String getBzsjbdnm() {
		return bzsjbdnm;
	}

	public void setBzsjbdnm(String bzsjbdnm) {
		this.bzsjbdnm = bzsjbdnm;
	}
}
