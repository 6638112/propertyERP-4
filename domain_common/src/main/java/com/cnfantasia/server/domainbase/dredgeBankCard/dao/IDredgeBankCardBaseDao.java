package com.cnfantasia.server.domainbase.dredgeBankCard.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.dredgeBankCard.entity.DredgeBankCard;

/**
 * 描述:(用户绑定的银行卡信息) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IDredgeBankCardBaseDao {
	/**
	 * 根据条件查询(用户绑定的银行卡信息)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<DredgeBankCard> selectDredgeBankCardByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(用户绑定的银行卡信息)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<DredgeBankCard> selectDredgeBankCardByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(用户绑定的银行卡信息)信息
	 * @param id
	 * @return
	 */
	public DredgeBankCard selectDredgeBankCardBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(用户绑定的银行卡信息)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectDredgeBankCardCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(用户绑定的银行卡信息)新增一条记录
	 * @param dredgeBankCard
	 * @return
	 */
	public int insertDredgeBankCard(DredgeBankCard dredgeBankCard);
	
	/**
	 * 批量新增(用户绑定的银行卡信息)信息
	 * @param dredgeBankCardList
	 * @return
	 */
	public int insertDredgeBankCardBatch(List<DredgeBankCard> dredgeBankCardList);
	
	/**
	 * 更新(用户绑定的银行卡信息)信息
	 * @param dredgeBankCard
	 * @return
	 */
	public int updateDredgeBankCard(DredgeBankCard dredgeBankCard);
	
	/**
	 * 批量更新(用户绑定的银行卡信息)信息
	 * @param dredgeBankCardList
	 * @return
	 */
	public int updateDredgeBankCardBatch(List<DredgeBankCard> dredgeBankCardList);
	
	/**
	 * 根据序列号删除(用户绑定的银行卡信息)信息_逻辑删除
	 * @param id
	 * @return
	 */
	/* 
	public int deleteDredgeBankCardLogic(java.math.BigInteger id);
	 */
	/**
	 * 根据Id 批量删除(用户绑定的银行卡信息)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	/* 
	public int deleteDredgeBankCardLogicBatch(List<java.math.BigInteger> idList);
	 */
	
//	/**
//	 * 根据序列号删除(用户绑定的银行卡信息)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteDredgeBankCard(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(用户绑定的银行卡信息)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteDredgeBankCardBatch(List<java.math.BigInteger> idList);
	
	
}
