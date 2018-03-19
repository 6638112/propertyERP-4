package com.cnfantasia.server.domainbase.ebuySupplyMerchantBankAccount.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(楼下店等电商供应商银行卡信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuySupplyMerchantBankAccount implements Serializable{
*/


public class EbuySupplyMerchantBankAccount extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuySupplyMerchantBankAccount(){
	}
	public EbuySupplyMerchantBankAccount(EbuySupplyMerchantBankAccount arg){
		this.id = arg.getId();
	}
	/**
	public EbuySupplyMerchantBankAccount(BigInteger id,BigInteger tSupplyMerchantId,String accountBank,String accountName,String bankName,String bankBranch,String bankProvince,String bankCity,String linkTel,String sys0UpdTime,Integer sys0DelState){
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
		EbuySupplyMerchantBankAccount other = (EbuySupplyMerchantBankAccount) obj;
		if (id == null) {
		return true;
	}
	
}