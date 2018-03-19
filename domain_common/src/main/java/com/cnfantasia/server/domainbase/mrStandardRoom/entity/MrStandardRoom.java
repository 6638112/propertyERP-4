package com.cnfantasia.server.domainbase.mrStandardRoom.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.Double;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(抄表收费标准(房间)) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MrStandardRoom implements Serializable{
*/


public class MrStandardRoom extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 小区id */	private BigInteger tGbId;	/** 楼栋id */	private BigInteger tBuildingId;	/** 房间id */	private BigInteger tRealRoomId;	/** 收费项id */	private BigInteger tMrFeeItemId;	/** 计费规则配置id */	private BigInteger tMrCalculateRuleCfgId;	/** 计量倍率 */	private Double multiplierTimes;	/** 计费表名称 */	private String mrName;
	public MrStandardRoom(){
	}
	public MrStandardRoom(MrStandardRoom arg){
		this.id = arg.getId();		this.tGbId = arg.gettGbId();		this.tBuildingId = arg.gettBuildingId();		this.tRealRoomId = arg.gettRealRoomId();		this.tMrFeeItemId = arg.gettMrFeeItemId();		this.tMrCalculateRuleCfgId = arg.gettMrCalculateRuleCfgId();		this.multiplierTimes = arg.getMultiplierTimes();		this.mrName = arg.getMrName();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param tGbId 小区id	 * @param tBuildingId 楼栋id	 * @param tRealRoomId 房间id	 * @param tMrFeeItemId 收费项id	 * @param tMrCalculateRuleCfgId 计费规则配置id	 * @param multiplierTimes 计量倍率	 * @param mrName 计费表名称	 * @param sys0AddTime 	 * @param sys0UpdTime 	 * @param sys0DelTime 	 * @param sys0AddUser 	 * @param sys0UpdUser 	 * @param sys0DelUser 	 * @param sys0DelState 	 */
	public MrStandardRoom(BigInteger id,BigInteger tGbId,BigInteger tBuildingId,BigInteger tRealRoomId,BigInteger tMrFeeItemId,BigInteger tMrCalculateRuleCfgId,Double multiplierTimes,String mrName,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.tGbId = tGbId;		this.tBuildingId = tBuildingId;		this.tRealRoomId = tRealRoomId;		this.tMrFeeItemId = tMrFeeItemId;		this.tMrCalculateRuleCfgId = tMrCalculateRuleCfgId;		this.multiplierTimes = multiplierTimes;		this.mrName = mrName;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("tGbId=").append(tGbId).append(";");		sbf.append("tBuildingId=").append(tBuildingId).append(";");		sbf.append("tRealRoomId=").append(tRealRoomId).append(";");		sbf.append("tMrFeeItemId=").append(tMrFeeItemId).append(";");		sbf.append("tMrCalculateRuleCfgId=").append(tMrCalculateRuleCfgId).append(";");		sbf.append("multiplierTimes=").append(multiplierTimes).append(";");		sbf.append("mrName=").append(mrName).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public BigInteger gettGbId() {		return tGbId;	}	public void settGbId(BigInteger tGbId) {		this.tGbId = tGbId;	}	public BigInteger gettBuildingId() {		return tBuildingId;	}	public void settBuildingId(BigInteger tBuildingId) {		this.tBuildingId = tBuildingId;	}	public BigInteger gettRealRoomId() {		return tRealRoomId;	}	public void settRealRoomId(BigInteger tRealRoomId) {		this.tRealRoomId = tRealRoomId;	}	public BigInteger gettMrFeeItemId() {		return tMrFeeItemId;	}	public void settMrFeeItemId(BigInteger tMrFeeItemId) {		this.tMrFeeItemId = tMrFeeItemId;	}	public BigInteger gettMrCalculateRuleCfgId() {		return tMrCalculateRuleCfgId;	}	public void settMrCalculateRuleCfgId(BigInteger tMrCalculateRuleCfgId) {		this.tMrCalculateRuleCfgId = tMrCalculateRuleCfgId;	}	public Double getMultiplierTimes() {		return multiplierTimes;	}	public void setMultiplierTimes(Double multiplierTimes) {		this.multiplierTimes = multiplierTimes;	}	public String getMrName() {		return mrName;	}	public void setMrName(String mrName) {		this.mrName = mrName;	}
	
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
		MrStandardRoom other = (MrStandardRoom) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
