package com.cnfantasia.server.domainbase.commLogger.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(公共日志记录表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CommLogger implements Serializable{
*/


public class CommLogger extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public CommLogger(){
	}
	public CommLogger(CommLogger arg){
		this.id = arg.getId();
	}
	/**
	public CommLogger(BigInteger id,BigInteger userId,BigInteger defaultRoomId,String userAccNo,Long userAccType,String actionUrlTail,String actionUrlAll,String requestParams,String actionDesc,String actionResStatus,String actionResCode,String actionResMsg,Integer isUndefinedException,String excepStackInfo,String ip,String deviceId,String os,String osVer,BigInteger tCommSysUrlFId,String reqStartTime,Long reqDealTime,String reqEndTime,String transNo,String responseData,String channel,String version,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public BigInteger getId() {
	
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
		CommLogger other = (CommLogger) obj;
		if (id == null) {
		return true;
	}
	
}