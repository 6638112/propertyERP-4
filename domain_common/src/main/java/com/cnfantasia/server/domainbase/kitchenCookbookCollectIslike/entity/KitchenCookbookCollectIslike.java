package com.cnfantasia.server.domainbase.kitchenCookbookCollectIslike.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(家庭成员是否喜欢吃对应菜谱) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class KitchenCookbookCollectIslike implements Serializable{
*/


public class KitchenCookbookCollectIslike extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public KitchenCookbookCollectIslike(){
	}
	public KitchenCookbookCollectIslike(KitchenCookbookCollectIslike arg){
		this.id = arg.getId();
	}
	/**
	public KitchenCookbookCollectIslike(BigInteger id,BigInteger userId,BigInteger roomId,BigInteger tKitchenCookbookCollectFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		KitchenCookbookCollectIslike other = (KitchenCookbookCollectIslike) obj;
		if (id == null) {
		return true;
	}
	
}