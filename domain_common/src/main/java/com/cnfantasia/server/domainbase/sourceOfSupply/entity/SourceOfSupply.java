package com.cnfantasia.server.domainbase.sourceOfSupply.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(供应商的货源地) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class SourceOfSupply implements Serializable{
*/


public class SourceOfSupply extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public SourceOfSupply(){
	}
	public SourceOfSupply(SourceOfSupply arg){
		this.id = arg.getId();
	}
	/**
	public SourceOfSupply(BigInteger id,String name,String desc,String introduceUrl,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tEbuySupplyMerchantFId){
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
		SourceOfSupply other = (SourceOfSupply) obj;
		if (id == null) {
		return true;
	}
	
}