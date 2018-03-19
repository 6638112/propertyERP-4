package com.cnfantasia.server.domainbase.commLoggerControl.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.commLoggerControl.entity.CommLoggerControl;

/**
 * 描述:(公共日志记录控制表) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface ICommLoggerControlBaseDao {
	/**
	 * 根据条件查询(公共日志记录控制表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<CommLoggerControl> selectCommLoggerControlByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(公共日志记录控制表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<CommLoggerControl> selectCommLoggerControlByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(公共日志记录控制表)信息
	 * @param id
	 * @return
	 */
	public CommLoggerControl selectCommLoggerControlBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(公共日志记录控制表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectCommLoggerControlCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(公共日志记录控制表)新增一条记录
	 * @param commLoggerControl
	 * @return
	 */
	public int insertCommLoggerControl(CommLoggerControl commLoggerControl);
	
	/**
	 * 批量新增(公共日志记录控制表)信息
	 * @param commLoggerControlList
	 * @return
	 */
	public int insertCommLoggerControlBatch(List<CommLoggerControl> commLoggerControlList);
	
	/**
	 * 更新(公共日志记录控制表)信息
	 * @param commLoggerControl
	 * @return
	 */
	public int updateCommLoggerControl(CommLoggerControl commLoggerControl);
	
	/**
	 * 批量更新(公共日志记录控制表)信息
	 * @param commLoggerControlList
	 * @return
	 */
	public int updateCommLoggerControlBatch(List<CommLoggerControl> commLoggerControlList);
	
	/**
	 * 根据序列号删除(公共日志记录控制表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteCommLoggerControlLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(公共日志记录控制表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteCommLoggerControlLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(公共日志记录控制表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteCommLoggerControl(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(公共日志记录控制表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteCommLoggerControlBatch(List<java.math.BigInteger> idList);
	
	
}
