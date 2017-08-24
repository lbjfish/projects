package com.bingobox.basedata.service.impl;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.SendResult;
import com.aliyun.openservices.ons.api.bean.ProducerBean;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONArray;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.bingobox.basedata.dao.FranchiseeBoxMappingDao;
import com.bingobox.basedata.dao.FranchiseeDao;
import com.bingobox.basedata.dao.FranchiseeContactDao;
import com.bingobox.basedata.dao.FranchiseeFinanceDao;
import com.bingobox.basedata.dao.CityDao;
import com.bingobox.basedata.po.BoxPO;
import com.bingobox.basedata.po.CityPO;
import com.bingobox.basedata.po.FilePO;
import com.bingobox.basedata.po.FranchiseeBoxMappingPO;
import com.bingobox.basedata.po.FranchiseePO;
import com.bingobox.basedata.po.FranchiseeContactPO;
import com.bingobox.basedata.po.FranchiseeFinancePO;
import com.bingobox.basedata.service.BoxService;
import com.bingobox.basedata.service.FileService;
import com.bingobox.basedata.service.FranchiseeService;
import com.bingobox.common.service.api.CodeServiceApi;
import com.bingobox.framework.common.CommonPage;
import com.bingobox.framework.common.CommonResult;
import com.bingobox.framework.common.CommonResultCode;
import com.bingobox.snapshot.dto.OrderProcessSnapshotDTO;
import com.github.pagehelper.PageHelper;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 
 * @author ZhangNing
 *
 */

@Service("franchiseeService")
public class FranchiseeServiceImpl implements FranchiseeService {
	@Autowired
	private FranchiseeDao franchiseeDao;
	@Autowired
	private FranchiseeContactDao franchiseeContactDao;
	@Autowired
	private FranchiseeFinanceDao franchiseeFinanceDao;
	@Autowired
	private FranchiseeBoxMappingDao franchiseeBoxMappingDao;
	@Autowired
	private CityDao cityDao;
	
    @Autowired
    private BoxService boxService;
    @Autowired
    private FileService fileService;
    
    @Autowired
    private  CodeServiceApi  codeServiceApi;
    
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@Override
    public FranchiseePO getFranchisee(Long franchiseeId) throws Exception {
		FranchiseePO franchiseePO = franchiseeDao.getFranchisee(franchiseeId);
		return franchiseePO;
	}

	@Override
	public CommonResult<CommonPage<FranchiseePO>> list(Long franchiseeCode, String franchiseeName, Integer isValid, Integer pageNum, Integer pageSize) {
		
		if(pageNum == null){
			pageNum = 0;
		}
		if(pageSize == null){
			pageSize = 20;
		}
		PageHelper.startPage(pageNum, pageSize);
		
		FranchiseePO franchiseePO = new FranchiseePO();
		if(franchiseeCode != null) {
			franchiseePO.setFranchiseeCode(franchiseeCode);
		}
		
		if(franchiseeName != null) {
			franchiseePO.setFranchiseeName(franchiseeName);
		}
		
		if(isValid != null){
			franchiseePO.setIsValid(isValid);
		}
		
		List<FranchiseePO> list = franchiseeDao.getList(franchiseePO);
		
		CommonPage<FranchiseePO> page = new CommonPage<FranchiseePO>(list);
		
		CommonResult<CommonPage<FranchiseePO>> cr = new CommonResult<CommonPage<FranchiseePO>>();
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(page);
		return cr;
	}

	@Override
	public CommonResult<FranchiseePO> detail(Long franchiseeId) {
		
		FranchiseePO detail = franchiseeDao.detail(franchiseeId);
		
		CommonResult<FranchiseePO> cr = new CommonResult<FranchiseePO>();
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(detail);
		return cr;
	}
	
	@Override
	public CommonResult<FranchiseeFinancePO> franchiseeFinanceDetail(Long franchiseeId) {
		
		
		FranchiseeFinancePO detail = franchiseeFinanceDao.detail(franchiseeId);
		
		CommonResult<FranchiseeFinancePO> cr = new CommonResult<FranchiseeFinancePO>();
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(detail);
		return cr;
	}
	
	@Override
	public CommonResult<JSONObject> add(JSONObject param) throws Exception {
		CommonResult<JSONObject> cr = new CommonResult<JSONObject>();
		if(param.getString("franchiseeName") == null || param.getLong("provinceId") == null || param.getLong("cityId") == null 
				|| param.getLong("districtId") == null || param.getString("createUserName") == null || 
				param.getString("contactName") == null || param.getString("contactPhone") == null) {
			cr.setCode(100001);
			cr.setMsg("必填参数缺失！");
			cr.setData(param);
			return cr;
		}
		FranchiseePO franchiseePO = new FranchiseePO();
		franchiseePO.setFranchiseeName(param.getString("franchiseeName"));
		franchiseePO.setProvinceId(param.getLong("provinceId"));
		franchiseePO.setCityId(param.getLong("cityId"));
		franchiseePO.setDistrictId(param.getLong("districtId"));
		franchiseePO.setCreateUserName(param.getString("createUserName"));
		
		if(param.getInteger("isValid") == null) {
			franchiseePO.setIsValid(0);
		}else{
			franchiseePO.setIsValid(param.getInteger("isValid"));
		}
		
		
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		//String curDate = dateFormat.format(date);
		
		franchiseePO.setCreateTime(date);
		franchiseePO.setLastUpdateTime(date);
		Long franchiseeCode = codeServiceApi.getIncrementSequence();
		franchiseePO.setFranchiseeCode(franchiseeCode);

		
		franchiseeDao.add(franchiseePO);
//		JSONObject franchiseeJsonObject = new JSONObject();
//		franchiseeJsonObject.put("franchiseeId", franchiseePO.getFranchiseeId());
//		franchiseeJsonObject.put("franchiseeCode", franchiseePO.getFranchiseeId()+100000L);
//		franchiseeDao.update(franchiseeJsonObject);
		
		
		FranchiseeContactPO franchiseecontactPO = new FranchiseeContactPO();
		franchiseecontactPO.setFranchiseeId(franchiseePO.getFranchiseeId());
		franchiseecontactPO.setContactName(param.getString("contactName"));
		franchiseecontactPO.setContactPhone(param.getString("contactPhone"));
		if(param.getString("contactEmail") != null){
			franchiseecontactPO.setContactEmail(param.getString("contactEmail"));
		}
		
		if(param.getString("address") != null){
			franchiseecontactPO.setAddress(param.getString("address"));
		}
		franchiseecontactPO.setCreateTime(date);
		franchiseecontactPO.setLastUpdateTime(date);
		

		
		franchiseeContactDao.add(franchiseecontactPO); 
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("franchiseeId", franchiseePO.getFranchiseeId());
		
		//新建插入一条财务信息 ，其余接口调更新
		this.franchiseeFinanceAdd(jsonObject);
		
		//快照
		SendResult sendResult = this.franchiseeSnapshot(franchiseePO.getFranchiseeId());
        if(sendResult != null) {
        	String lognInfo = "FranchiseeService.add()方法，"
                    + "异步消息发送结果：新建加盟商（"
                    + sendResult.toString() + "）";
            logger.info(lognInfo);
        }
        
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(jsonObject);
		return cr;
	}
	
	/**
	 * 加盟商数据表发快照
	 * @param franchiseeId
	 * @return
	 */
	private SendResult franchiseeSnapshot(Long franchiseeId) {
		CommonResult<FranchiseePO> franchiseeSnapshot = this.detail(franchiseeId);
		FranchiseePO franchiseePOSnapshot = franchiseeSnapshot.getData();
		JSONObject mqJsonObject = new JSONObject();
		mqJsonObject.put("franchiseeId", franchiseeId);
		mqJsonObject.put("franchiseeCode", franchiseePOSnapshot.getFranchiseeCode());
		mqJsonObject.put("franchiseeName", franchiseePOSnapshot.getFranchiseeName());
		mqJsonObject.put("provinceId", franchiseePOSnapshot.getProvinceId());
		mqJsonObject.put("cityId", franchiseePOSnapshot.getCityId());
		mqJsonObject.put("districtId", franchiseePOSnapshot.getDistrictId());
		mqJsonObject.put("isValid", franchiseePOSnapshot.getIsValid());
		mqJsonObject.put("createUserName", franchiseePOSnapshot.getCreateUserName());
		mqJsonObject.put("createTime", franchiseePOSnapshot.getCreateTime());
		mqJsonObject.put("lastUpdateTime", franchiseePOSnapshot.getLastUpdateTime());
		mqJsonObject.put("isDelete", franchiseePOSnapshot.getIsDelete());

                        
		//快照
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mq/mq-producer.xml");
        ProducerBean producer = (ProducerBean) ctx.getBean("producer");
        producer.start();
        // 异步消息：获取缓存中订单实例并处理产品实例状态
        byte[] mqJsonObjectByte = mqJsonObject.toString().getBytes();
        Message orderProcessSnapshotMsg = new Message("UnorderedMsg_Topic", "saveFranchiseeSnapshot", mqJsonObjectByte);
        SendResult sendResult = producer.send(orderProcessSnapshotMsg);
		return sendResult;
	}
	
	@Override
	public CommonResult<JSONObject> update(JSONObject param) {
		CommonResult<JSONObject> cr = new CommonResult<JSONObject>();
		if(param.getLong("franchiseeId") == null) {
			cr.setCode(100001);
			cr.setMsg("必填参数缺失！");
			cr.setData(param);
			return cr;
		}
		franchiseeDao.update(param); 
		franchiseeContactDao.update(param); 
		
		
		//快照  
		SendResult sendResult = this.franchiseeSnapshot(param.getLong("franchiseeId"));
        if(sendResult != null) {
        	String lognInfo = "FranchiseeService.udpdate()方法，"
                    + "异步消息发送结果：更新加盟商（"
                    + sendResult.toString() + "）";
            logger.info(lognInfo);
        }
        
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		return cr;
	}
	
	@Override
	public CommonResult<JSONObject> franchiseeFinanceAdd(JSONObject param) {
		CommonResult<JSONObject> cr = new CommonResult<JSONObject>();
		FranchiseeFinancePO franchiseeFinancePO = new FranchiseeFinancePO();
		if(param.getLong("franchiseeId") != null){
			franchiseeFinancePO.setFranchiseeId(param.getLong("franchiseeId"));
		}else{
			cr.setCode(100001);
			cr.setMsg("必填参数缺失！");
			cr.setData(param);
			return cr;
		}
		if(param.getString("beneficiaryCompanyName") !=null){
			franchiseeFinancePO.setBeneficiaryCompanyName(param.getString("beneficiaryCompanyName"));
		}
		if(param.getString("businessLicenceNumber") != null){
			franchiseeFinancePO.setBusinessLicenceNumber(param.getString("businessLicenceNumber"));
		}
		if(param.getString("beneficiaryBankAccount") != null){
			franchiseeFinancePO.setBeneficiaryBankAccount(param.getString("beneficiaryBankAccount"));
		}
		if(param.getString("beneficiaryBankAddress") != null){
			franchiseeFinancePO.setBeneficiaryBankAddress(param.getString("beneficiaryBankAddress"));
		}
		if(param.getString("beneficiaryBankName") !=null){
			franchiseeFinancePO.setBeneficiaryBankName(param.getString("beneficiaryBankName"));
		}
		if(param.getString("invoiceCompanyName") != null){
			franchiseeFinancePO.setInvoiceCompanyName(param.getString("invoiceCompanyName"));
		}
		if(param.getString("taxpayerRegistrationNumber") != null){
			franchiseeFinancePO.setTaxpayerRegistrationNumber(param.getString("taxpayerRegistrationNumber"));
		}
		if(param.getString("companyAddress") != null){
			franchiseeFinancePO.setCompanyAddress(param.getString("companyAddress"));
		}
		if(param.getString("invoiceBankName") != null){
			franchiseeFinancePO.setInvoiceBankName(param.getString("invoiceBankName"));
		}
		if(param.getString("invoiceBankPhone") != null){
			franchiseeFinancePO.setInvoiceBankPhone(param.getString("invoiceBankPhone"));
		}
		if(param.getString("invoiceBankAccount") != null){
			franchiseeFinancePO.setInvoiceBankAccount(param.getString("invoiceBankAccount"));
		}
		if(param.getString("invoiceBankAddress") != null){
			franchiseeFinancePO.setInvoiceBankAddress(param.getString("invoiceBankAddress"));
		}
		if(param.getInteger("settlementType") != null){
			franchiseeFinancePO.setSettlementType(param.getInteger("settlementType"));
		}
		if(param.getInteger("settlementDate") != null){
			franchiseeFinancePO.setSettlementDate(param.getInteger("settlementDate"));
		}
		
		Date date = new Date(System.currentTimeMillis());
		franchiseeFinancePO.setCreateTime(date);
		franchiseeFinancePO.setLastUpdateTime(date);
		
		if(param.getJSONArray("file") !=null){
			List<FilePO> fileList = new ArrayList<>();
			

			JSONArray files = param.getJSONArray("file");
			for(int i = 0; i < files.size(); i++){
				JSONObject jsonObject = (JSONObject) files.get(i);
				String filePath = jsonObject.getString("filePath");
				Integer fileType = jsonObject.getInteger("fileType");
				FilePO filePO = new FilePO();
				filePO.setFilePath(filePath);
				filePO.setFileType(fileType);
				filePO.setEntityId(franchiseeFinancePO.getFranchiseeId());
				filePO.setFileClass(1);
				filePO.setCreateTime(date);
				filePO.setLastUpdateTime(date);
				fileList.add(filePO);
				
				
			}
			fileService.add(fileList);
		}
		
		franchiseeFinanceDao.add(franchiseeFinancePO); 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("franchiseeFinanceId", franchiseeFinancePO.getFranchiseeFinanceId());
		
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(jsonObject);
		return cr;
	}

	@Override
	public CommonResult<JSONObject> franchiseeFinanceUpdate(JSONObject param) {
		CommonResult<JSONObject> cr = new CommonResult<JSONObject>();
		if(param.getLong("franchiseeId") == null){
			cr.setCode(100001);
			cr.setMsg("必填参数缺失！");
			cr.setData(param);
			return cr;
		}

		
		if(param.getJSONArray("file") !=null){
			//先删掉，再插入
			JSONObject fileJson = new JSONObject();
			fileJson.put("isDelete", 1);
			fileJson.put("franchiseeId", param.getLong("franchiseeId"));
			fileService.update(fileJson);
			
			List<FilePO> fileList = new ArrayList<>();
			Date date = new Date(System.currentTimeMillis());

			JSONArray files = param.getJSONArray("file");
			for(int i = 0; i < files.size(); i++){
				JSONObject jsonObject = (JSONObject) files.get(i);
				String filePath = jsonObject.getString("filePath");
				Integer fileType = jsonObject.getInteger("fileType");
				
				FilePO filePO = new FilePO();
				filePO.setFilePath(filePath);
				filePO.setFileType(fileType);
				filePO.setEntityId(param.getLong("franchiseeId"));
				filePO.setFileClass(1);
				filePO.setCreateTime(date);
				filePO.setLastUpdateTime(date);
				fileList.add(filePO);
				
				
			}
			fileService.add(fileList);
		}
		
		Long count = franchiseeFinanceDao.update(param); 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("count", count);
		
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(jsonObject);
		return cr;
	}
	
	@Override
	public CommonResult<JSONObject> boxList(Long franchiseeId) {
		
		FranchiseePO franchiseePO = franchiseeDao.getFranchisee(franchiseeId); 
		JSONObject param = new JSONObject();
		param.put("franchiseeId", franchiseeId);
		List<BoxPO> boxPO = boxService.franchiseeBoxList(param);
		JSONObject result = new JSONObject();
		result.put("franchiseeCode", franchiseePO.getFranchiseeCode());
		result.put("franchiseeName", franchiseePO.getFranchiseeName());
		result.put("boxCount", boxPO.size());
		result.put("boxList", boxPO);
		
		CommonResult<JSONObject> cr = new CommonResult<JSONObject>();
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(result);
		return cr;
	}

	@Override
	public CommonResult<Void> bindBox(JSONObject param) {
        List<FranchiseeBoxMappingPO> list = new ArrayList<FranchiseeBoxMappingPO>();
        CommonResult<Void> cr = new CommonResult<Void>();
        
		if(param.getJSONArray("boxIds") == null || param.getLong("franchiseeId") == null){
			cr.setCode(100001);
			cr.setMsg("必填参数缺失！");
			return cr;
		}else{
			JSONArray boxIds = param.getJSONArray("boxIds");
			for(int i = 0; i < boxIds.size(); i++){
				FranchiseeBoxMappingPO franchiseeBoxMappingPO = new FranchiseeBoxMappingPO();
				franchiseeBoxMappingPO.setFranchiseeId(param.getLong("franchiseeId"));
				franchiseeBoxMappingPO.setBoxId(boxIds.getLong(i));
				list.add(franchiseeBoxMappingPO);
			}
		}
		franchiseeBoxMappingDao.add(list);
		
		
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		return cr;
	}

	@Override
	public CommonResult<List<CityPO>> cityList(Long parentRegionInfoId) {
		CityPO cityPO = new CityPO();
		cityPO.setParentRegionInfoId(parentRegionInfoId);
		List<CityPO> list = cityDao.list(cityPO);
		
		CommonResult<List<CityPO>> cr = new CommonResult<List<CityPO>>();
		cr.setCode(CommonResultCode.SUCCESS.getCode());
		cr.setMsg(CommonResultCode.SUCCESS.getMsg());
		cr.setData(list);
		return cr;
	}
}
