package com.cnfantasia.server.domainbase.groupBuilding.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;import java.lang.Long;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(小区信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GroupBuilding implements Serializable{
*/


public class GroupBuilding extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 电话 */	private String tel;	/** 缴费周期开始时间 */	private Integer payPeriodStart;	/** 缴费周期结束时间 */	private Integer payPeriodEnd;	/** 所属物业管理 */	private BigInteger tPropertyManagementFId;	/** 名称 */	private String name;	/**  */	private BigInteger tBlockFId;	/**  */	private BigInteger tAddressBlockSelfDefinedFId;	/** 小区等级 */	private Integer level;	/** 是否签约标志 */	private Integer signStatus;	/** 浅度合作时间  */	private String lightCooperationTime;	/** 合作类型 */	private Integer cooperationType;	/** 高级合作时间 （上传资质） */	private String highCooperationTime;	/** 全面签约时间 */	private String allCooperationTime;	/** 是否可缴纳物业费 */	private Integer propfeeCanpay;	/** 拼音名称 */	private String pinyinName;	/** 审核状态 */	private Integer checkStatus;	/** 审核意见描述 */	private String auditDesc;	/** 创建人 */	private BigInteger creater;	/** 图标地址 */	private String iconUrl;	/** 大图地址 */	private String picDescUrl;	/** 小区地址描述 */	private String addressDesc;	/** 所属物业公司 */	private BigInteger tPropertyCompanyFId;	/**  */	private BigInteger tCompanyUserFId;	/** 居委会名称 */	private String neighborName;	/** 居委会电话 */	private String neighborTel;	/** 街道办名称 */	private String streetName;	/** 街道办电话 */	private String streetTel;	/** 小区联系人 */	private String contectUser;	/** 小区联系人电话 */	private String contectTel;	/** 数据来源类型 */	private Integer sourceType;	/** 百度经度 */	private String baiduLocatLng;	/** 百度纬度 */	private String baiduLocatLat;	/** 百度的位置的附加信息，是否精确查找。1为精确查找，0为不精确 */	private Long baiduPrecise;	/** 百度地址类型 */	private String baiduLevel;	/** 物业账单提前月份数 */	private Integer propertyMonthChange;	/** 序号 */	private String szgt01Seqid;	/** 预售证号 */	private String szgt01Presellno;	/** 开发企业 */	private String szgt01Enterprisename;	/** 批准时间 */	private String szgt01Allowtime;	/** 合同流水号 */	private String szgt02Contractflowno;	/** 面积 */	private String szgt02Area;	/** 用途 */	private String szgt02Usedesc;	/** 楼层 */	private String szgt02Floor;	/** 房源编码 */	private String szgt02Roomsrccode;	/** 代理中介名称 */	private String szgt02Agentname;	/** 代理中介电话 */	private String szgt02Agenttel;	/** 发布日期 */	private String szgt02Publishtime;	/** 百度数据抓取状态 */	private Integer baiduFetchStatus;	/** 美丽加数据抓取状态 */	private Integer mljFetchStatus;	/** 抓取状态，字段弃用 */	private Integer fetchStatus;	/** 电商店铺抓取状态 */	private Integer ebuyFetchStatus;	/** 门禁开通状态 */	private Integer keyStatus;	/** 是否有缴费优惠（1有，0没有） */	private Integer isPrefer;	/** 优惠名称 */	private String preferName;	/** 胡萝卜广告是否显示配置 */	private Integer hlbSwitch;	/** 自动结算日（每月几号） */	private Integer settlementDay;	/** 是否开启缴费校验 */	private Integer verificationStatus;	/** 月卡缴费优惠是否开启 */	private Integer carMonthIsOpen;	/** 临停车缴费优惠是否开启 */	private Integer carTmpIsOpen;	/** 是否需要发票开关 */	private Integer needBillIsOpen;	/** 小区账单平均值 */	private Long billAmtAvg;	/** 周期缴费方式（1固定周期，2选择周期） */	private Integer propertyPeriodType;	/** 选择周期月份数（使用逗号分隔 */	private String periodMonths;	/** 物业账单打印模板 */	private String billPrintDesc;	/** 是否需要发送物业缴费短信 */	private Integer isSendWyMsg;
	public GroupBuilding(){
	}
	public GroupBuilding(GroupBuilding arg){
		this.id = arg.getId();		this.tel = arg.getTel();		this.payPeriodStart = arg.getPayPeriodStart();		this.payPeriodEnd = arg.getPayPeriodEnd();		this.tPropertyManagementFId = arg.gettPropertyManagementFId();		this.name = arg.getName();		this.tBlockFId = arg.gettBlockFId();		this.tAddressBlockSelfDefinedFId = arg.gettAddressBlockSelfDefinedFId();		this.level = arg.getLevel();		this.signStatus = arg.getSignStatus();		this.lightCooperationTime = arg.getLightCooperationTime();		this.cooperationType = arg.getCooperationType();		this.highCooperationTime = arg.getHighCooperationTime();		this.allCooperationTime = arg.getAllCooperationTime();		this.propfeeCanpay = arg.getPropfeeCanpay();		this.pinyinName = arg.getPinyinName();		this.checkStatus = arg.getCheckStatus();		this.auditDesc = arg.getAuditDesc();		this.creater = arg.getCreater();		this.iconUrl = arg.getIconUrl();		this.picDescUrl = arg.getPicDescUrl();		this.addressDesc = arg.getAddressDesc();		this.tPropertyCompanyFId = arg.gettPropertyCompanyFId();		this.tCompanyUserFId = arg.gettCompanyUserFId();		this.neighborName = arg.getNeighborName();		this.neighborTel = arg.getNeighborTel();		this.streetName = arg.getStreetName();		this.streetTel = arg.getStreetTel();		this.contectUser = arg.getContectUser();		this.contectTel = arg.getContectTel();		this.sourceType = arg.getSourceType();		this.baiduLocatLng = arg.getBaiduLocatLng();		this.baiduLocatLat = arg.getBaiduLocatLat();		this.baiduPrecise = arg.getBaiduPrecise();		this.baiduLevel = arg.getBaiduLevel();		this.propertyMonthChange = arg.getPropertyMonthChange();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();		this.szgt01Seqid = arg.getSzgt01Seqid();		this.szgt01Presellno = arg.getSzgt01Presellno();		this.szgt01Enterprisename = arg.getSzgt01Enterprisename();		this.szgt01Allowtime = arg.getSzgt01Allowtime();		this.szgt02Contractflowno = arg.getSzgt02Contractflowno();		this.szgt02Area = arg.getSzgt02Area();		this.szgt02Usedesc = arg.getSzgt02Usedesc();		this.szgt02Floor = arg.getSzgt02Floor();		this.szgt02Roomsrccode = arg.getSzgt02Roomsrccode();		this.szgt02Agentname = arg.getSzgt02Agentname();		this.szgt02Agenttel = arg.getSzgt02Agenttel();		this.szgt02Publishtime = arg.getSzgt02Publishtime();		this.baiduFetchStatus = arg.getBaiduFetchStatus();		this.mljFetchStatus = arg.getMljFetchStatus();		this.fetchStatus = arg.getFetchStatus();		this.ebuyFetchStatus = arg.getEbuyFetchStatus();		this.keyStatus = arg.getKeyStatus();		this.isPrefer = arg.getIsPrefer();		this.preferName = arg.getPreferName();		this.hlbSwitch = arg.getHlbSwitch();		this.settlementDay = arg.getSettlementDay();		this.verificationStatus = arg.getVerificationStatus();		this.carMonthIsOpen = arg.getCarMonthIsOpen();		this.carTmpIsOpen = arg.getCarTmpIsOpen();		this.needBillIsOpen = arg.getNeedBillIsOpen();		this.billAmtAvg = arg.getBillAmtAvg();		this.propertyPeriodType = arg.getPropertyPeriodType();		this.periodMonths = arg.getPeriodMonths();		this.billPrintDesc = arg.getBillPrintDesc();		this.isSendWyMsg = arg.getIsSendWyMsg();
	}
	/**	 * 	 * @param id 	 * @param tel 电话	 * @param payPeriodStart 缴费周期开始时间	 * @param payPeriodEnd 缴费周期结束时间	 * @param tPropertyManagementFId 所属物业管理	 * @param name 名称	 * @param tBlockFId 	 * @param tAddressBlockSelfDefinedFId 	 * @param level 小区等级	 * @param signStatus 是否签约标志	 * @param lightCooperationTime 浅度合作时间 	 * @param cooperationType 合作类型	 * @param highCooperationTime 高级合作时间 （上传资质）	 * @param allCooperationTime 全面签约时间	 * @param propfeeCanpay 是否可缴纳物业费	 * @param pinyinName 拼音名称	 * @param checkStatus 审核状态	 * @param auditDesc 审核意见描述	 * @param creater 创建人	 * @param iconUrl 图标地址	 * @param picDescUrl 大图地址	 * @param addressDesc 小区地址描述	 * @param tPropertyCompanyFId 所属物业公司	 * @param tCompanyUserFId 	 * @param neighborName 居委会名称	 * @param neighborTel 居委会电话	 * @param streetName 街道办名称	 * @param streetTel 街道办电话	 * @param contectUser 小区联系人	 * @param contectTel 小区联系人电话	 * @param sourceType 数据来源类型	 * @param baiduLocatLng 百度经度	 * @param baiduLocatLat 百度纬度	 * @param baiduPrecise 百度的位置的附加信息，是否精确查找。1为精确查找，0为不精确	 * @param baiduLevel 百度地址类型	 * @param propertyMonthChange 物业账单提前月份数	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 * @param szgt01Seqid 序号	 * @param szgt01Presellno 预售证号	 * @param szgt01Enterprisename 开发企业	 * @param szgt01Allowtime 批准时间	 * @param szgt02Contractflowno 合同流水号	 * @param szgt02Area 面积	 * @param szgt02Usedesc 用途	 * @param szgt02Floor 楼层	 * @param szgt02Roomsrccode 房源编码	 * @param szgt02Agentname 代理中介名称	 * @param szgt02Agenttel 代理中介电话	 * @param szgt02Publishtime 发布日期	 * @param baiduFetchStatus 百度数据抓取状态	 * @param mljFetchStatus 美丽加数据抓取状态	 * @param fetchStatus 抓取状态，字段弃用	 * @param ebuyFetchStatus 电商店铺抓取状态	 * @param keyStatus 门禁开通状态	 * @param isPrefer 是否有缴费优惠（1有，0没有）	 * @param preferName 优惠名称	 * @param hlbSwitch 胡萝卜广告是否显示配置	 * @param settlementDay 自动结算日（每月几号）	 * @param verificationStatus 是否开启缴费校验	 * @param carMonthIsOpen 月卡缴费优惠是否开启	 * @param carTmpIsOpen 临停车缴费优惠是否开启	 * @param needBillIsOpen 是否需要发票开关	 * @param billAmtAvg 小区账单平均值	 * @param propertyPeriodType 周期缴费方式（1固定周期，2选择周期）	 * @param periodMonths 选择周期月份数（使用逗号分隔	 * @param billPrintDesc 物业账单打印模板	 * @param isSendWyMsg 是否需要发送物业缴费短信	 */
	public GroupBuilding(BigInteger id,String tel,Integer payPeriodStart,Integer payPeriodEnd,BigInteger tPropertyManagementFId,String name,BigInteger tBlockFId,BigInteger tAddressBlockSelfDefinedFId,Integer level,Integer signStatus,String lightCooperationTime,Integer cooperationType,String highCooperationTime,String allCooperationTime,Integer propfeeCanpay,String pinyinName,Integer checkStatus,String auditDesc,BigInteger creater,String iconUrl,String picDescUrl,String addressDesc,BigInteger tPropertyCompanyFId,BigInteger tCompanyUserFId,String neighborName,String neighborTel,String streetName,String streetTel,String contectUser,String contectTel,Integer sourceType,String baiduLocatLng,String baiduLocatLat,Long baiduPrecise,String baiduLevel,Integer propertyMonthChange,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String szgt01Seqid,String szgt01Presellno,String szgt01Enterprisename,String szgt01Allowtime,String szgt02Contractflowno,String szgt02Area,String szgt02Usedesc,String szgt02Floor,String szgt02Roomsrccode,String szgt02Agentname,String szgt02Agenttel,String szgt02Publishtime,Integer baiduFetchStatus,Integer mljFetchStatus,Integer fetchStatus,Integer ebuyFetchStatus,Integer keyStatus,Integer isPrefer,String preferName,Integer hlbSwitch,Integer settlementDay,Integer verificationStatus,Integer carMonthIsOpen,Integer carTmpIsOpen,Integer needBillIsOpen,Long billAmtAvg,Integer propertyPeriodType,String periodMonths,String billPrintDesc,Integer isSendWyMsg){
		this.id = id;		this.tel = tel;		this.payPeriodStart = payPeriodStart;		this.payPeriodEnd = payPeriodEnd;		this.tPropertyManagementFId = tPropertyManagementFId;		this.name = name;		this.tBlockFId = tBlockFId;		this.tAddressBlockSelfDefinedFId = tAddressBlockSelfDefinedFId;		this.level = level;		this.signStatus = signStatus;		this.lightCooperationTime = lightCooperationTime;		this.cooperationType = cooperationType;		this.highCooperationTime = highCooperationTime;		this.allCooperationTime = allCooperationTime;		this.propfeeCanpay = propfeeCanpay;		this.pinyinName = pinyinName;		this.checkStatus = checkStatus;		this.auditDesc = auditDesc;		this.creater = creater;		this.iconUrl = iconUrl;		this.picDescUrl = picDescUrl;		this.addressDesc = addressDesc;		this.tPropertyCompanyFId = tPropertyCompanyFId;		this.tCompanyUserFId = tCompanyUserFId;		this.neighborName = neighborName;		this.neighborTel = neighborTel;		this.streetName = streetName;		this.streetTel = streetTel;		this.contectUser = contectUser;		this.contectTel = contectTel;		this.sourceType = sourceType;		this.baiduLocatLng = baiduLocatLng;		this.baiduLocatLat = baiduLocatLat;		this.baiduPrecise = baiduPrecise;		this.baiduLevel = baiduLevel;		this.propertyMonthChange = propertyMonthChange;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;		this.szgt01Seqid = szgt01Seqid;		this.szgt01Presellno = szgt01Presellno;		this.szgt01Enterprisename = szgt01Enterprisename;		this.szgt01Allowtime = szgt01Allowtime;		this.szgt02Contractflowno = szgt02Contractflowno;		this.szgt02Area = szgt02Area;		this.szgt02Usedesc = szgt02Usedesc;		this.szgt02Floor = szgt02Floor;		this.szgt02Roomsrccode = szgt02Roomsrccode;		this.szgt02Agentname = szgt02Agentname;		this.szgt02Agenttel = szgt02Agenttel;		this.szgt02Publishtime = szgt02Publishtime;		this.baiduFetchStatus = baiduFetchStatus;		this.mljFetchStatus = mljFetchStatus;		this.fetchStatus = fetchStatus;		this.ebuyFetchStatus = ebuyFetchStatus;		this.keyStatus = keyStatus;		this.isPrefer = isPrefer;		this.preferName = preferName;		this.hlbSwitch = hlbSwitch;		this.settlementDay = settlementDay;		this.verificationStatus = verificationStatus;		this.carMonthIsOpen = carMonthIsOpen;		this.carTmpIsOpen = carTmpIsOpen;		this.needBillIsOpen = needBillIsOpen;		this.billAmtAvg = billAmtAvg;		this.propertyPeriodType = propertyPeriodType;		this.periodMonths = periodMonths;		this.billPrintDesc = billPrintDesc;		this.isSendWyMsg = isSendWyMsg;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("tel=").append(tel).append(";");		sbf.append("payPeriodStart=").append(payPeriodStart).append(";");		sbf.append("payPeriodEnd=").append(payPeriodEnd).append(";");		sbf.append("tPropertyManagementFId=").append(tPropertyManagementFId).append(";");		sbf.append("name=").append(name).append(";");		sbf.append("tBlockFId=").append(tBlockFId).append(";");		sbf.append("tAddressBlockSelfDefinedFId=").append(tAddressBlockSelfDefinedFId).append(";");		sbf.append("level=").append(level).append(";");		sbf.append("signStatus=").append(signStatus).append(";");		sbf.append("lightCooperationTime=").append(lightCooperationTime).append(";");		sbf.append("cooperationType=").append(cooperationType).append(";");		sbf.append("highCooperationTime=").append(highCooperationTime).append(";");		sbf.append("allCooperationTime=").append(allCooperationTime).append(";");		sbf.append("propfeeCanpay=").append(propfeeCanpay).append(";");		sbf.append("pinyinName=").append(pinyinName).append(";");		sbf.append("checkStatus=").append(checkStatus).append(";");		sbf.append("auditDesc=").append(auditDesc).append(";");		sbf.append("creater=").append(creater).append(";");		sbf.append("iconUrl=").append(iconUrl).append(";");		sbf.append("picDescUrl=").append(picDescUrl).append(";");		sbf.append("addressDesc=").append(addressDesc).append(";");		sbf.append("tPropertyCompanyFId=").append(tPropertyCompanyFId).append(";");		sbf.append("tCompanyUserFId=").append(tCompanyUserFId).append(";");		sbf.append("neighborName=").append(neighborName).append(";");		sbf.append("neighborTel=").append(neighborTel).append(";");		sbf.append("streetName=").append(streetName).append(";");		sbf.append("streetTel=").append(streetTel).append(";");		sbf.append("contectUser=").append(contectUser).append(";");		sbf.append("contectTel=").append(contectTel).append(";");		sbf.append("sourceType=").append(sourceType).append(";");		sbf.append("baiduLocatLng=").append(baiduLocatLng).append(";");		sbf.append("baiduLocatLat=").append(baiduLocatLat).append(";");		sbf.append("baiduPrecise=").append(baiduPrecise).append(";");		sbf.append("baiduLevel=").append(baiduLevel).append(";");		sbf.append("propertyMonthChange=").append(propertyMonthChange).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		sbf.append("szgt01Seqid=").append(szgt01Seqid).append(";");		sbf.append("szgt01Presellno=").append(szgt01Presellno).append(";");		sbf.append("szgt01Enterprisename=").append(szgt01Enterprisename).append(";");		sbf.append("szgt01Allowtime=").append(szgt01Allowtime).append(";");		sbf.append("szgt02Contractflowno=").append(szgt02Contractflowno).append(";");		sbf.append("szgt02Area=").append(szgt02Area).append(";");		sbf.append("szgt02Usedesc=").append(szgt02Usedesc).append(";");		sbf.append("szgt02Floor=").append(szgt02Floor).append(";");		sbf.append("szgt02Roomsrccode=").append(szgt02Roomsrccode).append(";");		sbf.append("szgt02Agentname=").append(szgt02Agentname).append(";");		sbf.append("szgt02Agenttel=").append(szgt02Agenttel).append(";");		sbf.append("szgt02Publishtime=").append(szgt02Publishtime).append(";");		sbf.append("baiduFetchStatus=").append(baiduFetchStatus).append(";");		sbf.append("mljFetchStatus=").append(mljFetchStatus).append(";");		sbf.append("fetchStatus=").append(fetchStatus).append(";");		sbf.append("ebuyFetchStatus=").append(ebuyFetchStatus).append(";");		sbf.append("keyStatus=").append(keyStatus).append(";");		sbf.append("isPrefer=").append(isPrefer).append(";");		sbf.append("preferName=").append(preferName).append(";");		sbf.append("hlbSwitch=").append(hlbSwitch).append(";");		sbf.append("settlementDay=").append(settlementDay).append(";");		sbf.append("verificationStatus=").append(verificationStatus).append(";");		sbf.append("carMonthIsOpen=").append(carMonthIsOpen).append(";");		sbf.append("carTmpIsOpen=").append(carTmpIsOpen).append(";");		sbf.append("needBillIsOpen=").append(needBillIsOpen).append(";");		sbf.append("billAmtAvg=").append(billAmtAvg).append(";");		sbf.append("propertyPeriodType=").append(propertyPeriodType).append(";");		sbf.append("periodMonths=").append(periodMonths).append(";");		sbf.append("billPrintDesc=").append(billPrintDesc).append(";");		sbf.append("isSendWyMsg=").append(isSendWyMsg).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public String getTel() {		return tel;	}	public void setTel(String tel) {		this.tel = tel;	}	public Integer getPayPeriodStart() {		return payPeriodStart;	}	public void setPayPeriodStart(Integer payPeriodStart) {		this.payPeriodStart = payPeriodStart;	}	public Integer getPayPeriodEnd() {		return payPeriodEnd;	}	public void setPayPeriodEnd(Integer payPeriodEnd) {		this.payPeriodEnd = payPeriodEnd;	}	public BigInteger gettPropertyManagementFId() {		return tPropertyManagementFId;	}	public void settPropertyManagementFId(BigInteger tPropertyManagementFId) {		this.tPropertyManagementFId = tPropertyManagementFId;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public BigInteger gettBlockFId() {		return tBlockFId;	}	public void settBlockFId(BigInteger tBlockFId) {		this.tBlockFId = tBlockFId;	}	public BigInteger gettAddressBlockSelfDefinedFId() {		return tAddressBlockSelfDefinedFId;	}	public void settAddressBlockSelfDefinedFId(BigInteger tAddressBlockSelfDefinedFId) {		this.tAddressBlockSelfDefinedFId = tAddressBlockSelfDefinedFId;	}	public Integer getLevel() {		return level;	}	public void setLevel(Integer level) {		this.level = level;	}	public Integer getSignStatus() {		return signStatus;	}	public void setSignStatus(Integer signStatus) {		this.signStatus = signStatus;	}	public String getLightCooperationTime() {		return lightCooperationTime;	}	public void setLightCooperationTime(String lightCooperationTime) {		this.lightCooperationTime = lightCooperationTime;	}	public Integer getCooperationType() {		return cooperationType;	}	public void setCooperationType(Integer cooperationType) {		this.cooperationType = cooperationType;	}	public String getHighCooperationTime() {		return highCooperationTime;	}	public void setHighCooperationTime(String highCooperationTime) {		this.highCooperationTime = highCooperationTime;	}	public String getAllCooperationTime() {		return allCooperationTime;	}	public void setAllCooperationTime(String allCooperationTime) {		this.allCooperationTime = allCooperationTime;	}	public Integer getPropfeeCanpay() {		return propfeeCanpay;	}	public void setPropfeeCanpay(Integer propfeeCanpay) {		this.propfeeCanpay = propfeeCanpay;	}	public String getPinyinName() {		return pinyinName;	}	public void setPinyinName(String pinyinName) {		this.pinyinName = pinyinName;	}	public Integer getCheckStatus() {		return checkStatus;	}	public void setCheckStatus(Integer checkStatus) {		this.checkStatus = checkStatus;	}	public String getAuditDesc() {		return auditDesc;	}	public void setAuditDesc(String auditDesc) {		this.auditDesc = auditDesc;	}	public BigInteger getCreater() {		return creater;	}	public void setCreater(BigInteger creater) {		this.creater = creater;	}	public String getIconUrl() {		return iconUrl;	}	public void setIconUrl(String iconUrl) {		this.iconUrl = iconUrl;	}	public String getPicDescUrl() {		return picDescUrl;	}	public void setPicDescUrl(String picDescUrl) {		this.picDescUrl = picDescUrl;	}	public String getAddressDesc() {		return addressDesc;	}	public void setAddressDesc(String addressDesc) {		this.addressDesc = addressDesc;	}	public BigInteger gettPropertyCompanyFId() {		return tPropertyCompanyFId;	}	public void settPropertyCompanyFId(BigInteger tPropertyCompanyFId) {		this.tPropertyCompanyFId = tPropertyCompanyFId;	}	public BigInteger gettCompanyUserFId() {		return tCompanyUserFId;	}	public void settCompanyUserFId(BigInteger tCompanyUserFId) {		this.tCompanyUserFId = tCompanyUserFId;	}	public String getNeighborName() {		return neighborName;	}	public void setNeighborName(String neighborName) {		this.neighborName = neighborName;	}	public String getNeighborTel() {		return neighborTel;	}	public void setNeighborTel(String neighborTel) {		this.neighborTel = neighborTel;	}	public String getStreetName() {		return streetName;	}	public void setStreetName(String streetName) {		this.streetName = streetName;	}	public String getStreetTel() {		return streetTel;	}	public void setStreetTel(String streetTel) {		this.streetTel = streetTel;	}	public String getContectUser() {		return contectUser;	}	public void setContectUser(String contectUser) {		this.contectUser = contectUser;	}	public String getContectTel() {		return contectTel;	}	public void setContectTel(String contectTel) {		this.contectTel = contectTel;	}	public Integer getSourceType() {		return sourceType;	}	public void setSourceType(Integer sourceType) {		this.sourceType = sourceType;	}	public String getBaiduLocatLng() {		return baiduLocatLng;	}	public void setBaiduLocatLng(String baiduLocatLng) {		this.baiduLocatLng = baiduLocatLng;	}	public String getBaiduLocatLat() {		return baiduLocatLat;	}	public void setBaiduLocatLat(String baiduLocatLat) {		this.baiduLocatLat = baiduLocatLat;	}	public Long getBaiduPrecise() {		return baiduPrecise;	}	public void setBaiduPrecise(Long baiduPrecise) {		this.baiduPrecise = baiduPrecise;	}	public String getBaiduLevel() {		return baiduLevel;	}	public void setBaiduLevel(String baiduLevel) {		this.baiduLevel = baiduLevel;	}	public Integer getPropertyMonthChange() {		return propertyMonthChange;	}	public void setPropertyMonthChange(Integer propertyMonthChange) {		this.propertyMonthChange = propertyMonthChange;	}	public String getSzgt01Seqid() {		return szgt01Seqid;	}	public void setSzgt01Seqid(String szgt01Seqid) {		this.szgt01Seqid = szgt01Seqid;	}	public String getSzgt01Presellno() {		return szgt01Presellno;	}	public void setSzgt01Presellno(String szgt01Presellno) {		this.szgt01Presellno = szgt01Presellno;	}	public String getSzgt01Enterprisename() {		return szgt01Enterprisename;	}	public void setSzgt01Enterprisename(String szgt01Enterprisename) {		this.szgt01Enterprisename = szgt01Enterprisename;	}	public String getSzgt01Allowtime() {		return szgt01Allowtime;	}	public void setSzgt01Allowtime(String szgt01Allowtime) {		this.szgt01Allowtime = szgt01Allowtime;	}	public String getSzgt02Contractflowno() {		return szgt02Contractflowno;	}	public void setSzgt02Contractflowno(String szgt02Contractflowno) {		this.szgt02Contractflowno = szgt02Contractflowno;	}	public String getSzgt02Area() {		return szgt02Area;	}	public void setSzgt02Area(String szgt02Area) {		this.szgt02Area = szgt02Area;	}	public String getSzgt02Usedesc() {		return szgt02Usedesc;	}	public void setSzgt02Usedesc(String szgt02Usedesc) {		this.szgt02Usedesc = szgt02Usedesc;	}	public String getSzgt02Floor() {		return szgt02Floor;	}	public void setSzgt02Floor(String szgt02Floor) {		this.szgt02Floor = szgt02Floor;	}	public String getSzgt02Roomsrccode() {		return szgt02Roomsrccode;	}	public void setSzgt02Roomsrccode(String szgt02Roomsrccode) {		this.szgt02Roomsrccode = szgt02Roomsrccode;	}	public String getSzgt02Agentname() {		return szgt02Agentname;	}	public void setSzgt02Agentname(String szgt02Agentname) {		this.szgt02Agentname = szgt02Agentname;	}	public String getSzgt02Agenttel() {		return szgt02Agenttel;	}	public void setSzgt02Agenttel(String szgt02Agenttel) {		this.szgt02Agenttel = szgt02Agenttel;	}	public String getSzgt02Publishtime() {		return szgt02Publishtime;	}	public void setSzgt02Publishtime(String szgt02Publishtime) {		this.szgt02Publishtime = szgt02Publishtime;	}	public Integer getBaiduFetchStatus() {		return baiduFetchStatus;	}	public void setBaiduFetchStatus(Integer baiduFetchStatus) {		this.baiduFetchStatus = baiduFetchStatus;	}	public Integer getMljFetchStatus() {		return mljFetchStatus;	}	public void setMljFetchStatus(Integer mljFetchStatus) {		this.mljFetchStatus = mljFetchStatus;	}	public Integer getFetchStatus() {		return fetchStatus;	}	public void setFetchStatus(Integer fetchStatus) {		this.fetchStatus = fetchStatus;	}	public Integer getEbuyFetchStatus() {		return ebuyFetchStatus;	}	public void setEbuyFetchStatus(Integer ebuyFetchStatus) {		this.ebuyFetchStatus = ebuyFetchStatus;	}	public Integer getKeyStatus() {		return keyStatus;	}	public void setKeyStatus(Integer keyStatus) {		this.keyStatus = keyStatus;	}	public Integer getIsPrefer() {		return isPrefer;	}	public void setIsPrefer(Integer isPrefer) {		this.isPrefer = isPrefer;	}	public String getPreferName() {		return preferName;	}	public void setPreferName(String preferName) {		this.preferName = preferName;	}	public Integer getHlbSwitch() {		return hlbSwitch;	}	public void setHlbSwitch(Integer hlbSwitch) {		this.hlbSwitch = hlbSwitch;	}	public Integer getSettlementDay() {		return settlementDay;	}	public void setSettlementDay(Integer settlementDay) {		this.settlementDay = settlementDay;	}	public Integer getVerificationStatus() {		return verificationStatus;	}	public void setVerificationStatus(Integer verificationStatus) {		this.verificationStatus = verificationStatus;	}	public Integer getCarMonthIsOpen() {		return carMonthIsOpen;	}	public void setCarMonthIsOpen(Integer carMonthIsOpen) {		this.carMonthIsOpen = carMonthIsOpen;	}	public Integer getCarTmpIsOpen() {		return carTmpIsOpen;	}	public void setCarTmpIsOpen(Integer carTmpIsOpen) {		this.carTmpIsOpen = carTmpIsOpen;	}	public Integer getNeedBillIsOpen() {		return needBillIsOpen;	}	public void setNeedBillIsOpen(Integer needBillIsOpen) {		this.needBillIsOpen = needBillIsOpen;	}	public Long getBillAmtAvg() {		return billAmtAvg;	}	public void setBillAmtAvg(Long billAmtAvg) {		this.billAmtAvg = billAmtAvg;	}	public Integer getPropertyPeriodType() {		return propertyPeriodType;	}	public void setPropertyPeriodType(Integer propertyPeriodType) {		this.propertyPeriodType = propertyPeriodType;	}	public String getPeriodMonths() {		return periodMonths;	}	public void setPeriodMonths(String periodMonths) {		this.periodMonths = periodMonths;	}	public String getBillPrintDesc() {		return billPrintDesc;	}	public void setBillPrintDesc(String billPrintDesc) {		this.billPrintDesc = billPrintDesc;	}	public Integer getIsSendWyMsg() {		return isSendWyMsg;	}	public void setIsSendWyMsg(Integer isSendWyMsg) {		this.isSendWyMsg = isSendWyMsg;	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupBuilding other = (GroupBuilding) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
