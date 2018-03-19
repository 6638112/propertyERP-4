package com.cnfantasia.server.domainbase.propertyCardTransactionFlowing.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(物业代扣卡交易流水) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyCardTransactionFlowing implements Serializable{
*/


public class PropertyCardTransactionFlowing extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PropertyCardTransactionFlowing(){
	}
	public PropertyCardTransactionFlowing(PropertyCardTransactionFlowing arg){
		this.id = arg.getId();
	}
	/**
	public PropertyCardTransactionFlowing(BigInteger id,String transNo,Long transAmt,Integer transType,String description,String transTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tUserFId,BigInteger tEbuyOrderFId,BigInteger tPayBillFId){
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
		PropertyCardTransactionFlowing other = (PropertyCardTransactionFlowing) obj;
		if (id == null) {
		return true;
	}
	
}