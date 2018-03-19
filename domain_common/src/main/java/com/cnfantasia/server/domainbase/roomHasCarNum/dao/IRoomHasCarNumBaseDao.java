package com.cnfantasia.server.domainbase.roomHasCarNum.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.roomHasCarNum.entity.RoomHasCarNum;

/**
 * 描述:(房间车牌对应表) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IRoomHasCarNumBaseDao {
	/**
	 * 根据条件查询(房间车牌对应表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<RoomHasCarNum> selectRoomHasCarNumByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(房间车牌对应表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<RoomHasCarNum> selectRoomHasCarNumByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(房间车牌对应表)信息
	 * @param id
	 * @return
	 */
	public RoomHasCarNum selectRoomHasCarNumBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(房间车牌对应表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectRoomHasCarNumCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(房间车牌对应表)新增一条记录
	 * @param roomHasCarNum
	 * @return
	 */
	public int insertRoomHasCarNum(RoomHasCarNum roomHasCarNum);
	
	/**
	 * 批量新增(房间车牌对应表)信息
	 * @param roomHasCarNumList
	 * @return
	 */
	public int insertRoomHasCarNumBatch(List<RoomHasCarNum> roomHasCarNumList);
	
	/**
	 * 更新(房间车牌对应表)信息
	 * @param roomHasCarNum
	 * @return
	 */
	public int updateRoomHasCarNum(RoomHasCarNum roomHasCarNum);
	
	/**
	 * 批量更新(房间车牌对应表)信息
	 * @param roomHasCarNumList
	 * @return
	 */
	public int updateRoomHasCarNumBatch(List<RoomHasCarNum> roomHasCarNumList);
	
	/**
	 * 根据序列号删除(房间车牌对应表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteRoomHasCarNumLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(房间车牌对应表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteRoomHasCarNumLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(房间车牌对应表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteRoomHasCarNum(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(房间车牌对应表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteRoomHasCarNumBatch(List<java.math.BigInteger> idList);
	
	
}
