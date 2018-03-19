package com.cnfantasia.server.domainbase.dredgeBillAmountDetail.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(上门维修费用明细) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class DredgeBillAmountDetail implements Serializable{
*/


public class DredgeBillAmountDetail extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public DredgeBillAmountDetail(){
	}
	public DredgeBillAmountDetail(DredgeBillAmountDetail arg){
		this.id = arg.getId();
	}
	/**
	public DredgeBillAmountDetail(BigInteger id,Integer feeType,String feeName,Long payAmount,Integer isIncludePlatformFee,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tDredgeBillFId){
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
		DredgeBillAmountDetail other = (DredgeBillAmountDetail) obj;
		if (id == null) {
		return true;
	}
	
}