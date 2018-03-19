package com.cnfantasia.server.domainbase.redpointModelcodeConfig.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(红点模块编码配置表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class RedpointModelcodeConfig implements Serializable{
*/


public class RedpointModelcodeConfig extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 模块编码 */	private String code;	/** 所属父类编码 */	private String parentCode;	/** 点击状态是否绑定 */	private Integer isClickStatusBind;	/** 当前模块code描述 */	private String desc;
	public RedpointModelcodeConfig(){
	}
	public RedpointModelcodeConfig(RedpointModelcodeConfig arg){
		this.id = arg.getId();		this.code = arg.getCode();		this.parentCode = arg.getParentCode();		this.isClickStatusBind = arg.getIsClickStatusBind();		this.desc = arg.getDesc();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param code 模块编码	 * @param parentCode 所属父类编码	 * @param isClickStatusBind 点击状态是否绑定	 * @param desc 当前模块code描述	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 */
	public RedpointModelcodeConfig(BigInteger id,String code,String parentCode,Integer isClickStatusBind,String desc,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.code = code;		this.parentCode = parentCode;		this.isClickStatusBind = isClickStatusBind;		this.desc = desc;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("code=").append(code).append(";");		sbf.append("parentCode=").append(parentCode).append(";");		sbf.append("isClickStatusBind=").append(isClickStatusBind).append(";");		sbf.append("desc=").append(desc).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public String getCode() {		return code;	}	public void setCode(String code) {		this.code = code;	}	public String getParentCode() {		return parentCode;	}	public void setParentCode(String parentCode) {		this.parentCode = parentCode;	}	public Integer getIsClickStatusBind() {		return isClickStatusBind;	}	public void setIsClickStatusBind(Integer isClickStatusBind) {		this.isClickStatusBind = isClickStatusBind;	}	public String getDesc() {		return desc;	}	public void setDesc(String desc) {		this.desc = desc;	}
	
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
		RedpointModelcodeConfig other = (RedpointModelcodeConfig) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
