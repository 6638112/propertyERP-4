package com.cnfantasia.server.domainbase.ebuyPrepayWeixinLog.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.ebuyPrepayWeixinLog.entity.EbuyPrepayWeixinLog;

/**
 * 描述:(微信预支付日志表) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IEbuyPrepayWeixinLogBaseDao {
	/**
	 * 根据条件查询(微信预支付日志表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<EbuyPrepayWeixinLog> selectEbuyPrepayWeixinLogByCondition(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 按条件分页查询(微信预支付日志表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<EbuyPrepayWeixinLog> selectEbuyPrepayWeixinLogByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim);
	/**
	 * 根据序列号查询(微信预支付日志表)信息
	 * @param id
	 * @return
	 */
	public EbuyPrepayWeixinLog selectEbuyPrepayWeixinLogBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(微信预支付日志表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectEbuyPrepayWeixinLogCount(Map<String,Object> paramMap,boolean isDim);
	/**
	 * 往(微信预支付日志表)新增一条记录
	 * @param ebuyPrepayWeixinLog
	 * @return
	 */
	public int insertEbuyPrepayWeixinLog(EbuyPrepayWeixinLog ebuyPrepayWeixinLog);
	
	/**
	 * 批量新增(微信预支付日志表)信息
	 * @param ebuyPrepayWeixinLogList
	 * @return
	 */
	public int insertEbuyPrepayWeixinLogBatch(List<EbuyPrepayWeixinLog> ebuyPrepayWeixinLogList);
	
	/**
	 * 更新(微信预支付日志表)信息
	 * @param ebuyPrepayWeixinLog
	 * @return
	 */
	public int updateEbuyPrepayWeixinLog(EbuyPrepayWeixinLog ebuyPrepayWeixinLog);
	
	/**
	 * 批量更新(微信预支付日志表)信息
	 * @param ebuyPrepayWeixinLogList
	 * @return
	 */
	public int updateEbuyPrepayWeixinLogBatch(List<EbuyPrepayWeixinLog> ebuyPrepayWeixinLogList);
	
	/**
	 * 根据序列号删除(微信预支付日志表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteEbuyPrepayWeixinLogLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(微信预支付日志表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteEbuyPrepayWeixinLogLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(微信预支付日志表)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteEbuyPrepayWeixinLog(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(微信预支付日志表)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteEbuyPrepayWeixinLogBatch(List<java.math.BigInteger> idList);
	
	
}
