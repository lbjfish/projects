package com.pfgh.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.opensymphony.xwork2.ActionSupport;
import com.pfgh.entity.Pfgh_FK_DKDDBZ;
import com.pfgh.entity.Pfgh_FK_GPBZ;
import com.pfgh.entity.Pfgh_FK_PZCS;
import com.pfgh.entity.Pfgh_FK_ZCYJBZ;
import com.pfgh.entity.Pfgh_fk_ddxq;
import com.pfgh.entity.Pfgh_fk_gpxq;
import com.pfgh.entity.Pfgh_fk_ldxq;
import com.pfgh.service.Pfgh_FK_PZCSService;

@Controller
@Scope("prototype")
public class FkzzfxAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 11231L;
	@Resource
	private Pfgh_FK_PZCSService pzcsService;
	
	private List<Pfgh_FK_PZCS> pzcss;
	private List<Pfgh_FK_GPBZ> pzcss2;
	private List<Pfgh_FK_DKDDBZ> pzcss3;
	private List<Pfgh_FK_ZCYJBZ> pzcss4;
	private Pfgh_FK_GPBZ gpbz;
	private Pfgh_FK_DKDDBZ ddbz;
	private Pfgh_FK_ZCYJBZ yjbz;
	private String bh;
	private String gpz;
	private String ddz;
	private String ldz;
	private List<Map<String,Object>> taskinfos;
	private Double csz;
	private String csbh;
	
	public String index(){
		pzcss2 = pzcsService.findGp();
		return "index";
	}
	
	public String index2(){
		pzcss3 = pzcsService.findDk();
		return "index2";
	}
	public String index3(){
		pzcss4 = pzcsService.findZc();
		return "index3";
	}
	
	public String dataLee(){
		pzcss = pzcsService.findAll();
		return "pzcss";
	}
	
	public String findGpBh(){
		gpbz = pzcsService.findGpByBh(bh);
		return "gpbh";
	}
	
	public String findDkBh(){
		ddbz = pzcsService.findDkByBh(bh);
		return "dkbh";
	}
	
	public String findLdBh(){
		yjbz = pzcsService.findLdByBh(bh);
		return "ldbh";
	}
	
	public String insertGp(){
		pzcsService.deleteAllGpxq();
		Gson gson = new Gson();
		List<Pfgh_fk_gpxq> list = gson.fromJson(gpz, new TypeToken<List<Pfgh_fk_gpxq>>(){}.getType());
		for(Pfgh_fk_gpxq gpxq : list){
			pzcsService.insertGpxq(gpxq);
		}
		return "insgp";
	}
	
	public String insertDd(){
		pzcsService.deleteAllDdxq();
		Gson gson = new Gson();
		List<Pfgh_fk_ddxq> list = gson.fromJson(ddz, new TypeToken<List<Pfgh_fk_ddxq>>(){}.getType());
		for(Pfgh_fk_ddxq ddxq : list){
			pzcsService.insertDdxq(ddxq);
		}
		return "insdd";
	}
	
	public String insertLd(){
		pzcsService.deleteAllLdxq();
		Gson gson = new Gson();
		List<Pfgh_fk_ldxq> list = gson.fromJson(ldz, new TypeToken<List<Pfgh_fk_ldxq>>(){}.getType());
		for(Pfgh_fk_ldxq ldxq : list){
			pzcsService.insertLdxq(ldxq);
		}
		return "insld";
	}
	
	public String index0(){
		taskinfos = pzcsService.findTaskinfo();
		return "index0";
	}
	
	public String updatePzcs(){
		pzcsService.updatePzcs(csz, csbh);
		return "updpz";
	}
	
	public List<Pfgh_FK_PZCS> getPzcss() {
		return pzcss;
	}

	public void setPzcss(List<Pfgh_FK_PZCS> pzcss) {
		this.pzcss = pzcss;
	}

	public List<Pfgh_FK_GPBZ> getPzcss2() {
		return pzcss2;
	}

	public void setPzcss2(List<Pfgh_FK_GPBZ> pzcss2) {
		this.pzcss2 = pzcss2;
	}

	public List<Pfgh_FK_DKDDBZ> getPzcss3() {
		return pzcss3;
	}

	public void setPzcss3(List<Pfgh_FK_DKDDBZ> pzcss3) {
		this.pzcss3 = pzcss3;
	}

	public List<Pfgh_FK_ZCYJBZ> getPzcss4() {
		return pzcss4;
	}

	public void setPzcss4(List<Pfgh_FK_ZCYJBZ> pzcss4) {
		this.pzcss4 = pzcss4;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public Pfgh_FK_GPBZ getGpbz() {
		return gpbz;
	}

	public void setGpbz(Pfgh_FK_GPBZ gpbz) {
		this.gpbz = gpbz;
	}

	public Pfgh_FK_DKDDBZ getDdbz() {
		return ddbz;
	}

	public void setDdbz(Pfgh_FK_DKDDBZ ddbz) {
		this.ddbz = ddbz;
	}

	public Pfgh_FK_ZCYJBZ getYjbz() {
		return yjbz;
	}

	public void setYjbz(Pfgh_FK_ZCYJBZ yjbz) {
		this.yjbz = yjbz;
	}

	public String getGpz() {
		return gpz;
	}

	public void setGpz(String gpz) {
		this.gpz = gpz;
	}

	public String getDdz() {
		return ddz;
	}

	public void setDdz(String ddz) {
		this.ddz = ddz;
	}

	public String getLdz() {
		return ldz;
	}

	public void setLdz(String ldz) {
		this.ldz = ldz;
	}

	public List<Map<String, Object>> getTaskinfos() {
		return taskinfos;
	}

	public void setTaskinfos(List<Map<String, Object>> taskinfos) {
		this.taskinfos = taskinfos;
	}

	public Double getCsz() {
		return csz;
	}

	public void setCsz(Double csz) {
		this.csz = csz;
	}

	public String getCsbh() {
		return csbh;
	}

	public void setCsbh(String csbh) {
		this.csbh = csbh;
	}
}
