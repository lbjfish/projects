package com.pfgh.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.pfgh.entity.Pfgh_pb_dmbljgx;
import com.pfgh.entity.Pfgh_pb_dmbwlxx;
import com.pfgh.service.TubiaoService;

@Controller
@Scope("prototype")
public class TubiaoAction {
	
	@Resource
	private TubiaoService tubiaoService;
	
	private List<Pfgh_pb_dmbwlxx> dmbws;
	private List<Pfgh_pb_dmbljgx> dmblj;
	
	private List<Map<String,Object>> listmap = new ArrayList<Map<String,Object>>();
	
	public String chuanzhi(){
		dmbws = tubiaoService.findAll();
		return "chuanzhi";
	}
	
	public String chuanzhi2(){
		dmblj = tubiaoService.findAll2();
		dmbws = tubiaoService.findAll();
		for(int i=0;i<dmblj.size();i++){
			Map<String,Object> map = new LinkedHashMap<String,Object>();
			for(int j=0;j<dmbws.size();j++){
				if(dmblj.get(i).getQdbh().equals(dmbws.get(j).getMbbh())){
					map.put("mc1", dmbws.get(j).getMbmc());
				}
			}
			for(int k=0;k<dmbws.size();k++){
				if(dmblj.get(i).getZdbh().equals(dmbws.get(k).getMbbh())){
					map.put("mc2", dmbws.get(k).getMbmc());
				}
			}
			listmap.add(map);
		}
		return "chuanzhi2";
	}

	public List<Pfgh_pb_dmbwlxx> getDmbws() {
		return dmbws;
	}

	public void setDmbws(List<Pfgh_pb_dmbwlxx> dmbws) {
		this.dmbws = dmbws;
	}

	public List<Pfgh_pb_dmbljgx> getDmblj() {
		return dmblj;
	}

	public void setDmblj(List<Pfgh_pb_dmbljgx> dmblj) {
		this.dmblj = dmblj;
	}

	public List<Map<String, Object>> getListmap() {
		return listmap;
	}

	public void setListmap(List<Map<String, Object>> listmap) {
		this.listmap = listmap;
	}
}
