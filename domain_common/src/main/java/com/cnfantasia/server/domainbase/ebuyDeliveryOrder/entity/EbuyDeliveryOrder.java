package com.cnfantasia.server.domainbase.ebuyDeliveryOrder.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(送货单) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyDeliveryOrder implements Serializable{
*/


public class EbuyDeliveryOrder extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyDeliveryOrder(){
	}
	public EbuyDeliveryOrder(EbuyDeliveryOrder arg){
		this.id = arg.getId();
	}
	/**
	public EbuyDeliveryOrder(BigInteger id,BigInteger tEbuyOrderFId,BigInteger tSupplyMerchantFId,Long amount,Long totalCoupon,BigInteger tEbuyExpressCompanyFId,Long deliveryRealFee,Long deliverySettlementFee,BigInteger deliveryId,Integer userDeliveryType,BigInteger buyerId,String createTime,String deliveryTime,String receiveTime,String deliveryNo,String expressNo,Integer status,Integer refundStatus,Integer revenueStatus,Integer pushStatus,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Integer settleStatus,Integer cashStatus){
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
		EbuyDeliveryOrder other = (EbuyDeliveryOrder) obj;
		if (id == null) {
		return true;
	}
	
}