package com.cnfantasia.server.domainbase.ebuyProductRecommend.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.ebuyProductRecommend.entity.EbuyProductRecommend;

/**
 * 描述:(推荐的商品) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class EbuyProductRecommendBaseDao extends AbstractBaseDao implements IEbuyProductRecommendBaseDao{
	/**
	 * 根据条件查询(推荐的商品)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyProductRecommend> selectEbuyProductRecommendByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("ebuyProductRecommendBase.select_ebuyProductRecommend",paramMap);
	}
	/**
	 * 按条件分页查询(推荐的商品)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<EbuyProductRecommend> selectEbuyProductRecommendByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectEbuyProductRecommendCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<EbuyProductRecommend> resMap= sqlSession.selectList("ebuyProductRecommendBase.select_ebuyProductRecommend_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(推荐的商品)信息
	 * @param id
	 * @return
	 */
	@Override
	public EbuyProductRecommend selectEbuyProductRecommendBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("ebuyProductRecommendBase.select_ebuyProductRecommend_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(推荐的商品)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectEbuyProductRecommendCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("ebuyProductRecommendBase.select_ebuyProductRecommend_count", paramMap);
	}
	/**
	 * 往(推荐的商品)新增一条记录
	 * @param ebuyProductRecommend
	 * @return
	 */
	@Override
	public int insertEbuyProductRecommend(EbuyProductRecommend ebuyProductRecommend){
		return sqlSession.insert("ebuyProductRecommendBase.insert_ebuyProductRecommend",ebuyProductRecommend);
	}
	/**
	 * 批量新增(推荐的商品)信息
	 * @param ebuyProductRecommendList
	 * @return
	 */
	@Override
	public int insertEbuyProductRecommendBatch(List<EbuyProductRecommend> ebuyProductRecommendList) {
		return sqlSession.insert("ebuyProductRecommendBase.insert_ebuyProductRecommend_Batch",ebuyProductRecommendList);
	}
	
	/**
	 * 更新(推荐的商品)信息
	 * @param ebuyProductRecommend
	 * @return
	 */
	@Override
	public int updateEbuyProductRecommend(EbuyProductRecommend ebuyProductRecommend){
		return sqlSession.update("ebuyProductRecommendBase.update_ebuyProductRecommend", ebuyProductRecommend);
	}
	/**
	 * 批量更新(推荐的商品)信息
	 * @param ebuyProductRecommendList
	 * @return
	 */
	@Override
	public int updateEbuyProductRecommendBatch(List<EbuyProductRecommend> ebuyProductRecommendList) {
		return sqlSession.update("ebuyProductRecommendBase.update_ebuyProductRecommend_Batch", ebuyProductRecommendList);
	}
	
	/**
	 * 根据序列号删除(推荐的商品)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteEbuyProductRecommendLogic(java.math.BigInteger id){
		EbuyProductRecommend ebuyProductRecommend = new EbuyProductRecommend();
		ebuyProductRecommend.setId(id);
		ebuyProductRecommend.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("ebuyProductRecommendBase.delete_ebuyProductRecommend_Logic",ebuyProductRecommend);
	}
	
	/**
	 * 根据Id 批量删除(推荐的商品)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteEbuyProductRecommendLogicBatch(List<java.math.BigInteger> idList) {
		List<EbuyProductRecommend> delList = new java.util.ArrayList<EbuyProductRecommend>();
		for(java.math.BigInteger id:idList){
			EbuyProductRecommend ebuyProductRecommend = new EbuyProductRecommend();
			ebuyProductRecommend.setId(id);
			ebuyProductRecommend.setSys0DelState(RecordState_DELETED);
			delList.add(ebuyProductRecommend);
		}
		return sqlSession.update("ebuyProductRecommendBase.delete_ebuyProductRecommend_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(推荐的商品)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyProductRecommend(java.math.BigInteger id){
//		return sqlSession.delete("ebuyProductRecommendBase.delete_ebuyProductRecommend", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(推荐的商品)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteEbuyProductRecommendBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("ebuyProductRecommendBase.delete_ebuyProductRecommend_Batch", idList);
//	}
	
	
}
