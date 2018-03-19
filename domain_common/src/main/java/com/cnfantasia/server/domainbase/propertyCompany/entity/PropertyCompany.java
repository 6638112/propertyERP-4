package com.cnfantasia.server.domainbase.propertyCompany.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(物业公司) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PropertyCompany implements Serializable{
*/


public class PropertyCompany extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PropertyCompany(){
	}
	public PropertyCompany(PropertyCompany arg){
		this.id = arg.getId();
	}
	/**
	public PropertyCompany(BigInteger id,String name,String editName,String bankName,String accountNo,String accountName,String bankBranch,String bankProvince,String bankCity,Integer revenueDate,String editBankName,String editAccountNo,String editAccountName,String editBankBranch,String editBankProvince,String editBankCity,Integer editRevenueDate,String tel,String editTel,String desc,BigInteger adminId,String email,String mobilePhone,String editMobilePhone,String linkman,String editLinkman,String photoCredentials,String photoBusinessLicense,Integer isAudited,Integer isEdit,String auditResult,Integer cooperationType,String editResult,String lightCooperationTime,Integer isLightCooperation,String highCooperationTime,Integer isHighCooperation,String allCooperationTime,Integer isAllCooperation,Integer caropenStatus,String photoUrl,String follower,String sys0AddTime,String sys0EditTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		PropertyCompany other = (PropertyCompany) obj;
		if (id == null) {
		return true;
	}
	
}