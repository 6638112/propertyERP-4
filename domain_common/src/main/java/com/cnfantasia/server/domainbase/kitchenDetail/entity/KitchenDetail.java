package com.cnfantasia.server.domainbase.kitchenDetail.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(厨房菜谱详情) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class KitchenDetail implements Serializable{
*/


public class KitchenDetail extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	private Integer category;
	/** 参数名称 */
	public KitchenDetail(){
	}
	public KitchenDetail(KitchenDetail arg){
		this.id = arg.getId();
		this.key = arg.getKey();
	}
	/**
	public KitchenDetail(BigInteger id,Integer type,Integer category,String key,String value,BigInteger tKitchenCookbookFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
		this.key = key;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("key=").append(key).append(";");
	}
	
	public BigInteger getId() {
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	
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
		KitchenDetail other = (KitchenDetail) obj;
		if (id == null) {
		return true;
	}
	
}