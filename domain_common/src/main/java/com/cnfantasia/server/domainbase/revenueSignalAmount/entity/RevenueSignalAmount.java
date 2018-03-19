package com.cnfantasia.server.domainbase.revenueSignalAmount.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(单个提款项的收益参数信息信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class RevenueSignalAmount implements Serializable{
*/


public class RevenueSignalAmount extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public RevenueSignalAmount(){
	}
	public RevenueSignalAmount(RevenueSignalAmount arg){
		this.id = arg.getId();
	}
	/**
	public RevenueSignalAmount(BigInteger id,Integer miniRoleType,BigInteger miniRoleId,Integer goalType,Integer goalDetailType,BigInteger goalId,String goalRevTime,String goalRevTimeStr,Double srcMoney,Double amount,String moneyTime,BigInteger revConfigId,String revConfigJson,Integer tkStatus,String tkSuccTime,BigInteger revApplyId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String roleName,Double amountPtbt,Double amountUsrReal,String payFlowNo,Integer payMethod,String orderNo,BigInteger tGroupBuildingId,BigInteger tPropertyManagementFId){
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
		RevenueSignalAmount other = (RevenueSignalAmount) obj;
		if (id == null) {
		return true;
	}
	
}