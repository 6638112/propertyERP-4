package com.cnfantasia.server.domainbase.groupBuildingExt.entity;

/* */ import java.io.Serializable;/* */
import java.math.BigInteger;
/*  import com.cnfantasia.server.domain.pub.BaseEntity; */
/**
 * 描述:(小区信息扩展表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/* */
public class GroupBuildingExt implements Serializable{
/* */

/* 
public class GroupBuildingExt extends BaseEntity{
 */
	private static final long serialVersionUID = 1L;
	/**  */
	public GroupBuildingExt(){
	}
	public GroupBuildingExt(GroupBuildingExt arg){
		this.id = arg.getId();
	}
	/**
	public GroupBuildingExt(BigInteger id,Integer validByMobile,Integer fixedFeeStatus,Integer meterFeeStatus,Integer tempFeeStatus,Integer cannotAskHelp,Integer openBankCollection,String askHelpPlacehole,Integer payToPc){
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
		GroupBuildingExt other = (GroupBuildingExt) obj;
		if (id == null) {
		return true;
	}
	
}