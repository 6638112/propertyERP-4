package com.cnfantasia.server.domainbase.messageToBeSend.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(待发送短信或待推送消息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MessageToBeSend implements Serializable{
*/


public class MessageToBeSend extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public MessageToBeSend(){
	}
	public MessageToBeSend(MessageToBeSend arg){
		this.id = arg.getId();
	}
	/**
	public MessageToBeSend(BigInteger id,Integer msgType,String title,String content,Integer sendRange,String sendTime,Integer sendStatus,String operatorUser,Long sendCount,String shortUrl,String whiteList,String blackList,String jumpTarget,String ebuyProductDetail,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		MessageToBeSend other = (MessageToBeSend) obj;
		if (id == null) {
		return true;
	}
	
}