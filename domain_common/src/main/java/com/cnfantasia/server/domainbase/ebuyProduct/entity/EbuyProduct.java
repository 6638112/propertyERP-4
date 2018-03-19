package com.cnfantasia.server.domainbase.ebuyProduct.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(商品表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyProduct implements Serializable{
*/


public class EbuyProduct extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyProduct(){
	}
	public EbuyProduct(EbuyProduct arg){
		this.id = arg.getId();
	}
	/**
	public EbuyProduct(BigInteger id,BigInteger srcId,BigInteger tSupplyMerchantFId,String name,String nameMini,Integer isPreSell,Long price,Long priceDiscount,Long purchasePrice,BigInteger defaultDeliveryId,BigInteger leftCount,String createTime,BigInteger selNum,String picBase,String picBaseMini,BigInteger tEbuyProductTypeFId,BigInteger tEbuyProductTypeForEnterFId,BigInteger tEbuyDeliveryDescId,String priceUnit,String code,String erpCode,String specification,String desc,Integer status,Integer statusAudit,String upShelfTime,String downShelfTime,String picSpecial,Long pricePoint,Long priceDiscountPoint,Integer pointType,Long wlappType,Integer specialProductType,String applicationRang,String endTime,String convertProcess,String attentionInfo,Integer filmTicketNum,BigInteger tSourceOfSupplyFId,Integer isHotSale,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		EbuyProduct other = (EbuyProduct) obj;
		if (id == null) {
		return true;
	}
	
}