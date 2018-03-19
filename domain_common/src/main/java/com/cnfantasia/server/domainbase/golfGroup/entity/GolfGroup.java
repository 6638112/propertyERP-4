package com.cnfantasia.server.domainbase.golfGroup.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(高尔夫组团表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GolfGroup implements Serializable{
*/


public class GolfGroup extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/** 团长的ID */	private String groupOpenid;	/** 组团日期 */	private String groupDate;	/**  */	private String groupTime;
	public GolfGroup(){
	}
	public GolfGroup(GolfGroup arg){
		this.id = arg.getId();		this.groupOpenid = arg.getGroupOpenid();		this.groupDate = arg.getGroupDate();		this.groupTime = arg.getGroupTime();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param groupOpenid 团长的ID	 * @param groupDate 组团日期	 * @param groupTime 	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 */
	public GolfGroup(BigInteger id,String groupOpenid,String groupDate,String groupTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.groupOpenid = groupOpenid;		this.groupDate = groupDate;		this.groupTime = groupTime;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("groupOpenid=").append(groupOpenid).append(";");		sbf.append("groupDate=").append(groupDate).append(";");		sbf.append("groupTime=").append(groupTime).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public String getGroupOpenid() {		return groupOpenid;	}	public void setGroupOpenid(String groupOpenid) {		this.groupOpenid = groupOpenid;	}	public String getGroupDate() {		return groupDate;	}	public void setGroupDate(String groupDate) {		this.groupDate = groupDate;	}	public String getGroupTime() {		return groupTime;	}	public void setGroupTime(String groupTime) {		this.groupTime = groupTime;	}
	
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
		GolfGroup other = (GolfGroup) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
