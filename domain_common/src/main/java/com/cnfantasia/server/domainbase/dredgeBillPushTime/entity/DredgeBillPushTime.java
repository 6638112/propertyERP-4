package com.cnfantasia.server.domainbase.dredgeBillPushTime.entity;

/* */ import java.io.Serializable;/* */
import java.math.BigInteger;
/*  import com.cnfantasia.server.domain.pub.BaseEntity; */
/**
 * 描述:(疏通工单推送时间记录表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/* */
public class DredgeBillPushTime implements Serializable{
/* */

/* 
public class DredgeBillPushTime extends BaseEntity{
 */
	private static final long serialVersionUID = 1L;
	/**  */
	public DredgeBillPushTime(){
	}
	public DredgeBillPushTime(DredgeBillPushTime arg){
		this.id = arg.getId();
	}
	/**
	public DredgeBillPushTime(BigInteger id,BigInteger tDredgeBillFId,Integer pushLevel,String pushTime){
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
		DredgeBillPushTime other = (DredgeBillPushTime) obj;
		if (id == null) {
		return true;
	}
	
}