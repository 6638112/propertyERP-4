package com.cnfantasia.server.domainbase.dredgeType2nd.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(疏通二级类型) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class DredgeType2nd implements Serializable{
*/


public class DredgeType2nd extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public DredgeType2nd(){
	}
	public DredgeType2nd(DredgeType2nd arg){
		this.id = arg.getId();
	}
	/**
	public DredgeType2nd(BigInteger id,BigInteger tDredgeTypeFId,String name,String picUrl,Long estinatePrice,Long originalPrice,Long discountPrice,String desc,String priceDesc,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		DredgeType2nd other = (DredgeType2nd) obj;
		if (id == null) {
		return true;
	}
	
}