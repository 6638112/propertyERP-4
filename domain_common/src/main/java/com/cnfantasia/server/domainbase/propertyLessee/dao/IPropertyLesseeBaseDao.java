package com.cnfantasia.server.domainbase.propertyLessee.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.propertyLessee.entity.PropertyLessee;

/**
 * 描述:(租户信息表) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IPropertyLesseeBaseDao {
	/**
	 * 根据条件查询(租户信息表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<PropertyLessee> selectPropertyLesseeByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(租户信息表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<PropertyLessee> selectPropertyLesseeByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(租户信息表)信息
	 * @param id
	 * @return
	 */
	public PropertyLessee selectPropertyLesseeBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(租户信息表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectPropertyLesseeCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(租户信息表)新增一条记录
	 * @param propertyLessee
	 * @return
	 */
	public int insertPropertyLessee(PropertyLessee propertyLessee);
	
	/**
	 * 批量新增(租户信息表)信息
	 * @param propertyLesseeList
	 * @return
	 */
	public int insertPropertyLesseeBatch(List<PropertyLessee> propertyLesseeList);
	
	/**
	 * 更新(租户信息表)信息
	 * @param propertyLessee
	 * @return
	 */
	public int updatePropertyLessee(PropertyLessee propertyLessee);
	
	/**
	 * 批量更新(租户信息表)信息
	 * @param propertyLesseeList
	 * @return
	 */
	public int updatePropertyLesseeBatch(List<PropertyLessee> propertyLesseeList);
	
	/**
	 * 根据序列号删除(租户信息表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deletePropertyLesseeLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(租户信息表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deletePropertyLesseeLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(租户信息表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deletePropertyLessee(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(租户信息表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deletePropertyLesseeBatch(List<java.math.BigInteger> idList);
	
	
}
