package com.cnfantasia.server.domainbase.encryptUrl.service;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;
import com.cnfantasia.server.domainbase.encryptUrl.entity.EncryptUrl;

/**
 * 描述:(加密url) 服务类接口定义
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IEncryptUrlBaseService {
	
	/**
	 * 根据条件查询(加密url)信息,精确查询
	 * @param paramMap 
	 * @return
	 */
	public List<EncryptUrl> getEncryptUrlByCondition(Map<String,Object> paramMap);
	/**
	 * 根据条件查询(加密url)信息,模糊查询
	 * @param paramMap 
	 * @return
	 */
	public List<EncryptUrl> getEncryptUrlByConditionDim(Map<String,Object> paramMap);
	/**
	 * 按条件分页查询(加密url)信息,精确查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<EncryptUrl> getEncryptUrlByCondition(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 按条件分页查询(加密url)信息,模糊查询
	 * @param paramMap
	 * @param pageModel
	 * @return
	 */
	public List<EncryptUrl> getEncryptUrlByConditionDim(Map<String,Object> paramMap,PageModel pageModel);
	/**
	 * 根据序列号查询(加密url)信息
	 * @param id
	 * @return
	 */
	public EncryptUrl getEncryptUrlBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(加密url)记录数,精确查询
	 * @param paramMap
	 * @return
	 */
	public int getEncryptUrlCount(Map<String,Object> paramMap);
	/**
	 * 根据条件查询满足条件的(加密url)记录数,模糊查询
	 * @param paramMap
	 * @return
	 */
	public int getEncryptUrlCountDim(Map<String,Object> paramMap);
	/**
	 * 往(加密url)新增一条记录
	 * @param encryptUrl
	 * @return
	 */
	public int insertEncryptUrl(EncryptUrl encryptUrl);
	/**
	 * 批量新增(加密url)
	 * @param encryptUrlList
	 * @return
	 */
	public int insertEncryptUrlBatch(List<EncryptUrl> encryptUrlList);
	/**
	 * 更新(加密url)信息
	 * @param encryptUrl
	 * @return
	 */
	public int updateEncryptUrl(EncryptUrl encryptUrl);
	/**
	 * 批量更新(加密url)信息
	 * @param encryptUrlList
	 * @return
	 */
	public int updateEncryptUrlBatch(List<EncryptUrl> encryptUrlList);
	/**
	 * 根据序列号删除(加密url)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteEncryptUrlLogic(java.math.BigInteger id);
	
	/**
	 * 根据序列号批量删除(加密url)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteEncryptUrlLogicBatch(List<java.math.BigInteger> idList);
	
//	/**
//	 * 根据序列号删除(加密url)信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteEncryptUrl(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(加密url)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteEncryptUrlBatch(List<java.math.BigInteger> idList);
	
}
