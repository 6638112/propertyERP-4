package com.cnfantasia.server.domainbase.payBillSplit.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(费用账单拆分表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PayBillSplit implements Serializable{
*/


public class PayBillSplit extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PayBillSplit(){
	}
	public PayBillSplit(PayBillSplit arg){
		this.id = arg.getId();
	}
	/**
	public PayBillSplit(BigInteger id,BigInteger parentBillId,Long manageAmount,String nameDesc,Long succPayAmount,Double discount,BigInteger prizeRecordId,String billSubMonth,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String discountMonth){
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
		PayBillSplit other = (PayBillSplit) obj;
		if (id == null) {
		return true;
	}
	
}