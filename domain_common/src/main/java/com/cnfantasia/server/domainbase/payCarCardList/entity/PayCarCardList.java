package com.cnfantasia.server.domainbase.payCarCardList.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(车禁月卡付款列表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PayCarCardList implements Serializable{
*/


public class PayCarCardList extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 主键 */
	public PayCarCardList(){
	}
	public PayCarCardList(PayCarCardList arg){
		this.id = arg.getId();
	}
	/**
	public PayCarCardList(BigInteger id,String desc,Integer sys0DelState,Long payPrice,BigInteger payTime){
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
		PayCarCardList other = (PayCarCardList) obj;
		if (id == null) {
		return true;
	}
	
}