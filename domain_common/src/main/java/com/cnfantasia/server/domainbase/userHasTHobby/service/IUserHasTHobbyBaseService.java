package com.cnfantasia.server.domainbase.userHasTHobby.service;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;
import com.cnfantasia.server.domainbase.userHasTHobby.entity.UserHasTHobby;

/**
 * 描述:(用户爱好关系表) 服务类接口定义
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IUserHasTHobbyBaseService {
	
	/**
	 * 根据条件查询(用户爱好关系表)信息,精确查询
	 * @param paramMap 
	 * @return
	 */
	public List<UserHasTHobby> getUserHasTHobbyByCondition(Map<String,Object> paramMap);
	/**
	 * 根据条件查询(用户爱好关系表)信息,模糊查询
	 * @param paramMap 
	 * @return
	 */
	public List<UserHasTHobby> getUserHasTHobbyByConditionDim(Map<String,Object> paramMap);
	/**
	 * 按条件分页查询(用户爱好关系表)信息,精确查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<UserHasTHobby> getUserHasTHobbyByCondition(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 按条件分页查询(用户爱好关系表)信息,模糊查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<UserHasTHobby> getUserHasTHobbyByConditionDim(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 根据序列号查询(用户爱好关系表)信息
	 * @param id
	 * @return
	 */
	public UserHasTHobby getUserHasTHobbyBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(用户爱好关系表)记录数,精确查询
	 * @param paramMap
	 * @return
	 */
	public int getUserHasTHobbyCount(Map<String,Object> paramMap);
	/**
	 * 根据条件查询满足条件的(用户爱好关系表)记录数,模糊查询
	 * @param paramMap
	 * @return
	 */
	public int getUserHasTHobbyCountDim(Map<String,Object> paramMap);
	/**
	 * 往(用户爱好关系表)新增一条记录
	 * @param userHasTHobby
	 * @return
	 */
	public int insertUserHasTHobby(UserHasTHobby userHasTHobby);
	/**
	 * 批量新增(用户爱好关系表)
	 * @param userHasTHobbyList
	 * @return
	 */
	public int insertUserHasTHobbyBatch(List<UserHasTHobby> userHasTHobbyList);
	/**
	 * 更新(用户爱好关系表)信息
	 * @param userHasTHobby
	 * @return
	 */
	public int updateUserHasTHobby(UserHasTHobby userHasTHobby);
	/**
	 * 批量更新(用户爱好关系表)信息
	 * @param userHasTHobbyList
	 * @return
	 */
	public int updateUserHasTHobbyBatch(List<UserHasTHobby> userHasTHobbyList);
	/**
	 * 根据序列号删除(用户爱好关系表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteUserHasTHobbyLogic(java.math.BigInteger id);
	
	/**
	 * 根据序列号批量删除(用户爱好关系表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteUserHasTHobbyLogicBatch(List<java.math.BigInteger> idList);
	
//	/**
//	 * 根据序列号删除(用户爱好关系表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteUserHasTHobby(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(用户爱好关系表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteUserHasTHobbyBatch(List<java.math.BigInteger> idList);
	
}
