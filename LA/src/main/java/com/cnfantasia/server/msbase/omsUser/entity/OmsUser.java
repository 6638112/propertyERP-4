package com.cnfantasia.server.msbase.omsUser.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;

import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(OMS用户表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class OmsUser implements Serializable{
*/


public class OmsUser extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 用户编号 */
	public OmsUser(){
	}
	/**
	public OmsUser(BigInteger id,String userAccount,String password,String realName,String sex,String birthday,String imgprofile,Long userState,Integer passwdStatus,String lastPwderrTime,String lastLoginTime,String lastPwdmodTime,String lastPwdResetTime,BigInteger merchantId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		OmsUser other = (OmsUser) obj;
		if (id == null) {
		return true;
	}
	
}