package com.cnfantasia.server.domainbase.prizeRecordTmp.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(临时用户中奖记录) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PrizeRecordTmp implements Serializable{
*/


public class PrizeRecordTmp extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 摇奖人 */
	public PrizeRecordTmp(){
	}
	public PrizeRecordTmp(PrizeRecordTmp arg){
		this.id = arg.getId();
	}
	/**
	public PrizeRecordTmp(BigInteger id,String prizeTime,String endTime,Double discount,BigInteger tUserTmpFId,Integer adjustType,Integer poolType,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		PrizeRecordTmp other = (PrizeRecordTmp) obj;
		if (id == null) {
		return true;
	}
	
}