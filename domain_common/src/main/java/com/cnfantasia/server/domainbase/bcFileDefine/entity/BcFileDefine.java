package com.cnfantasia.server.domainbase.bcFileDefine.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(出盘回盘文件格式定义) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class BcFileDefine implements Serializable{
*/


public class BcFileDefine extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public BcFileDefine(){
	}
	public BcFileDefine(BcFileDefine arg){
		this.id = arg.getId();
	}
	/**
	public BcFileDefine(BigInteger id,Integer orderSeq,String fieldName,Long width,String alignment,String fillChar,Integer issumColumn,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tBcFinanceOrgFId){
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
		BcFileDefine other = (BcFileDefine) obj;
		if (id == null) {
		return true;
	}
	
}