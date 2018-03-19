package com.cnfantasia.server.domainbase.kitchenCookbookAddressRelation.service;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;
import com.cnfantasia.server.domainbase.kitchenCookbookAddressRelation.entity.KitchenCookbookAddressRelation;

/**
 * 描述:(菜谱地址关系表) 服务类接口定义
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IKitchenCookbookAddressRelationBaseService {
	
	/**
	 * 根据条件查询(菜谱地址关系表)信息,精确查询
	 * @param paramMap 
	 * @return
	 */
	public List<KitchenCookbookAddressRelation> getKitchenCookbookAddressRelationByCondition(Map<String,Object> paramMap);
	/**
	 * 根据条件查询(菜谱地址关系表)信息,模糊查询
	 * @param paramMap 
	 * @return
	 */
	public List<KitchenCookbookAddressRelation> getKitchenCookbookAddressRelationByConditionDim(Map<String,Object> paramMap);
	/**
	 * 按条件分页查询(菜谱地址关系表)信息,精确查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<KitchenCookbookAddressRelation> getKitchenCookbookAddressRelationByCondition(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 按条件分页查询(菜谱地址关系表)信息,模糊查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<KitchenCookbookAddressRelation> getKitchenCookbookAddressRelationByConditionDim(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 根据序列号查询(菜谱地址关系表)信息
	 * @param id
	 * @return
	 */
	public KitchenCookbookAddressRelation getKitchenCookbookAddressRelationBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(菜谱地址关系表)记录数,精确查询
	 * @param paramMap
	 * @return
	 */
	public int getKitchenCookbookAddressRelationCount(Map<String,Object> paramMap);
	/**
	 * 根据条件查询满足条件的(菜谱地址关系表)记录数,模糊查询
	 * @param paramMap
	 * @return
	 */
	public int getKitchenCookbookAddressRelationCountDim(Map<String,Object> paramMap);
	/**
	 * 往(菜谱地址关系表)新增一条记录
	 * @param kitchenCookbookAddressRelation
	 * @return
	 */
	public int insertKitchenCookbookAddressRelation(KitchenCookbookAddressRelation kitchenCookbookAddressRelation);
	/**
	 * 批量新增(菜谱地址关系表)
	 * @param kitchenCookbookAddressRelationList
	 * @return
	 */
	public int insertKitchenCookbookAddressRelationBatch(List<KitchenCookbookAddressRelation> kitchenCookbookAddressRelationList);
	/**
	 * 更新(菜谱地址关系表)信息
	 * @param kitchenCookbookAddressRelation
	 * @return
	 */
	public int updateKitchenCookbookAddressRelation(KitchenCookbookAddressRelation kitchenCookbookAddressRelation);
	/**
	 * 批量更新(菜谱地址关系表)信息
	 * @param kitchenCookbookAddressRelationList
	 * @return
	 */
	public int updateKitchenCookbookAddressRelationBatch(List<KitchenCookbookAddressRelation> kitchenCookbookAddressRelationList);
	/**
	 * 根据序列号删除(菜谱地址关系表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteKitchenCookbookAddressRelationLogic(java.math.BigInteger id);
	
	/**
	 * 根据序列号批量删除(菜谱地址关系表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteKitchenCookbookAddressRelationLogicBatch(List<java.math.BigInteger> idList);
	
//	/**
//	 * 根据序列号删除(菜谱地址关系表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteKitchenCookbookAddressRelation(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(菜谱地址关系表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteKitchenCookbookAddressRelationBatch(List<java.math.BigInteger> idList);
	
}
