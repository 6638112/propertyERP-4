package com.cnfantasia.server.domainbase.userHasTRoom.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.userHasTRoom.entity.UserHasTRoom;

/**
 * 描述:(用户门牌关系) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IUserHasTRoomBaseDao {
	/**
	 * 根据条件查询(用户门牌关系)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<UserHasTRoom> selectUserHasTRoomByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(用户门牌关系)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<UserHasTRoom> selectUserHasTRoomByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(用户门牌关系)信息
	 * @param id
	 * @return
	 */
	public UserHasTRoom selectUserHasTRoomBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(用户门牌关系)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectUserHasTRoomCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(用户门牌关系)新增一条记录
	 * @param userHasTRoom
	 * @return
	 */
	public int insertUserHasTRoom(UserHasTRoom userHasTRoom);
	
	/**
	 * 批量新增(用户门牌关系)信息
	 * @param userHasTRoomList
	 * @return
	 */
	public int insertUserHasTRoomBatch(List<UserHasTRoom> userHasTRoomList);
	
	/**
	 * 更新(用户门牌关系)信息
	 * @param userHasTRoom
	 * @return
	 */
	public int updateUserHasTRoom(UserHasTRoom userHasTRoom);
	
	/**
	 * 批量更新(用户门牌关系)信息
	 * @param userHasTRoomList
	 * @return
	 */
	public int updateUserHasTRoomBatch(List<UserHasTRoom> userHasTRoomList);
	
	/**
	 * 根据序列号删除(用户门牌关系)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteUserHasTRoomLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(用户门牌关系)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteUserHasTRoomLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(用户门牌关系)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteUserHasTRoom(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(用户门牌关系)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteUserHasTRoomBatch(List<java.math.BigInteger> idList);
	
	
}
