package com.cnfantasia.server.domainbase.room.entity;/* import java.io.Serializable;*/import java.math.BigInteger;import java.lang.String;import java.lang.Integer;import java.lang.Double; import com.cnfantasia.server.domain.pub.BaseEntity;/** * 描述:(门牌信息) 实体类 *  * @version 1.00 * @author null *  *//*public class Room implements Serializable{*/public class Room extends BaseEntity{	private static final long serialVersionUID = 1L;	/** 门牌号 */	private BigInteger id;	/** 房间花号 */	private String huaId;	/**  */	private BigInteger tRealRoomFId;	/** 房间创建人 */	private BigInteger creater;	/** 临时待审核真实门牌Id */	private BigInteger tRealRoomFIdTmp;	/** 是否为首次兑换粮票使用的门牌 */	private Integer firstHbconvertState;	/** 真实门牌是否已经被确认 */	private Integer realroomCheckStatus;	/** 缴费者姓名(备用) */	private String payUserName;	/** 最低折扣 */	private Double miniDiscount;	/** 最低折扣Id */	private BigInteger miniDiscountId;	/**  */	private String miniDiscountPeriodStart;	/**  */	private String miniDiscountPeriodEnd;	public Room(){	}	public Room(Room arg){		this.id = arg.getId();		this.huaId = arg.getHuaId();		this.tRealRoomFId = arg.gettRealRoomFId();		this.creater = arg.getCreater();		this.tRealRoomFIdTmp = arg.gettRealRoomFIdTmp();		this.firstHbconvertState = arg.getFirstHbconvertState();		this.realroomCheckStatus = arg.getRealroomCheckStatus();		this.payUserName = arg.getPayUserName();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();		this.miniDiscount = arg.getMiniDiscount();		this.miniDiscountId = arg.getMiniDiscountId();		this.miniDiscountPeriodStart = arg.getMiniDiscountPeriodStart();		this.miniDiscountPeriodEnd = arg.getMiniDiscountPeriodEnd();	}	/**	 * 	 * @param id 门牌号	 * @param huaId 房间花号	 * @param tRealRoomFId 	 * @param creater 房间创建人	 * @param tRealRoomFIdTmp 临时待审核真实门牌Id	 * @param firstHbconvertState 是否为首次兑换粮票使用的门牌	 * @param realroomCheckStatus 真实门牌是否已经被确认	 * @param payUserName 缴费者姓名(备用)	 * @param sys0AddTime 新增时间	 * @param sys0UpdTime 更新时间	 * @param sys0DelTime 删除时间	 * @param sys0AddUser 新增者	 * @param sys0UpdUser 修改者	 * @param sys0DelUser 删除者	 * @param sys0DelState 记录状态	 * @param miniDiscount 最低折扣	 * @param miniDiscountId 最低折扣Id	 * @param miniDiscountPeriodStart 	 * @param miniDiscountPeriodEnd 	 */	public Room(BigInteger id,String huaId,BigInteger tRealRoomFId,BigInteger creater,BigInteger tRealRoomFIdTmp,Integer firstHbconvertState,Integer realroomCheckStatus,String payUserName,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Double miniDiscount,BigInteger miniDiscountId,String miniDiscountPeriodStart,String miniDiscountPeriodEnd){		this.id = id;		this.huaId = huaId;		this.tRealRoomFId = tRealRoomFId;		this.creater = creater;		this.tRealRoomFIdTmp = tRealRoomFIdTmp;		this.firstHbconvertState = firstHbconvertState;		this.realroomCheckStatus = realroomCheckStatus;		this.payUserName = payUserName;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;		this.miniDiscount = miniDiscount;		this.miniDiscountId = miniDiscountId;		this.miniDiscountPeriodStart = miniDiscountPeriodStart;		this.miniDiscountPeriodEnd = miniDiscountPeriodEnd;	}	@Override	public String toString() {		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("huaId=").append(huaId).append(";");		sbf.append("tRealRoomFId=").append(tRealRoomFId).append(";");		sbf.append("creater=").append(creater).append(";");		sbf.append("tRealRoomFIdTmp=").append(tRealRoomFIdTmp).append(";");		sbf.append("firstHbconvertState=").append(firstHbconvertState).append(";");		sbf.append("realroomCheckStatus=").append(realroomCheckStatus).append(";");		sbf.append("payUserName=").append(payUserName).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		sbf.append("miniDiscount=").append(miniDiscount).append(";");		sbf.append("miniDiscountId=").append(miniDiscountId).append(";");		sbf.append("miniDiscountPeriodStart=").append(miniDiscountPeriodStart).append(";");		sbf.append("miniDiscountPeriodEnd=").append(miniDiscountPeriodEnd).append(";");		return sbf.toString();	}		public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public String getHuaId() {		return huaId;	}	public void setHuaId(String huaId) {		this.huaId = huaId;	}	public BigInteger gettRealRoomFId() {		return tRealRoomFId;	}	public void settRealRoomFId(BigInteger tRealRoomFId) {		this.tRealRoomFId = tRealRoomFId;	}	public BigInteger getCreater() {		return creater;	}	public void setCreater(BigInteger creater) {		this.creater = creater;	}	public BigInteger gettRealRoomFIdTmp() {		return tRealRoomFIdTmp;	}	public void settRealRoomFIdTmp(BigInteger tRealRoomFIdTmp) {		this.tRealRoomFIdTmp = tRealRoomFIdTmp;	}	public Integer getFirstHbconvertState() {		return firstHbconvertState;	}	public void setFirstHbconvertState(Integer firstHbconvertState) {		this.firstHbconvertState = firstHbconvertState;	}	public Integer getRealroomCheckStatus() {		return realroomCheckStatus;	}	public void setRealroomCheckStatus(Integer realroomCheckStatus) {		this.realroomCheckStatus = realroomCheckStatus;	}	public String getPayUserName() {		return payUserName;	}	public void setPayUserName(String payUserName) {		this.payUserName = payUserName;	}	public Double getMiniDiscount() {		return miniDiscount;	}	public void setMiniDiscount(Double miniDiscount) {		this.miniDiscount = miniDiscount;	}	public BigInteger getMiniDiscountId() {		return miniDiscountId;	}	public void setMiniDiscountId(BigInteger miniDiscountId) {		this.miniDiscountId = miniDiscountId;	}	public String getMiniDiscountPeriodStart() {		return miniDiscountPeriodStart;	}	public void setMiniDiscountPeriodStart(String miniDiscountPeriodStart) {		this.miniDiscountPeriodStart = miniDiscountPeriodStart;	}	public String getMiniDiscountPeriodEnd() {		return miniDiscountPeriodEnd;	}	public void setMiniDiscountPeriodEnd(String miniDiscountPeriodEnd) {		this.miniDiscountPeriodEnd = miniDiscountPeriodEnd;	}		@Override	public int hashCode() {		final int prime = 31;		int result = 1;		result = prime * result + ((id == null) ? 0 : id.hashCode());		return result;	}		@Override	public boolean equals(Object obj) {		if (this == obj)			return true;		if (obj == null)			return false;		if (getClass() != obj.getClass())			return false;		Room other = (Room) obj;		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;		return true;	}	}