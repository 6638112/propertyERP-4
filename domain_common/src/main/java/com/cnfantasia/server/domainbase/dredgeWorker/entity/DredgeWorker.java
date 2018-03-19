package com.cnfantasia.server.domainbase.dredgeWorker.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(疏通师傅) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class DredgeWorker implements Serializable{
*/


public class DredgeWorker extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public DredgeWorker(){
	}
	public DredgeWorker(DredgeWorker arg){
		this.id = arg.getId();
	}
	/**
	public DredgeWorker(BigInteger id,String idNo,String realName,String idNumberPic1,String idNumberPic2,String personalDesc,Integer auditStatus,Double level,Integer workerLevel,String auditDesc,BigInteger tUserFId,Integer createType,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,BigInteger tServiceSupplierFId){
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
		DredgeWorker other = (DredgeWorker) obj;
		if (id == null) {
		return true;
	}
	
}