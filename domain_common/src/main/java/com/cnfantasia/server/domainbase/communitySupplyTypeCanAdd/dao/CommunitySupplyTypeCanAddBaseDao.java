package com.cnfantasia.server.domainbase.communitySupplyTypeCanAdd.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.communitySupplyTypeCanAdd.entity.CommunitySupplyTypeCanAdd;

/**
 * 描述:(新增商家时的可选类别) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class CommunitySupplyTypeCanAddBaseDao extends AbstractBaseDao implements ICommunitySupplyTypeCanAddBaseDao{
	/**
	 * 根据条件查询(新增商家时的可选类别)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<CommunitySupplyTypeCanAdd> selectCommunitySupplyTypeCanAddByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("communitySupplyTypeCanAddBase.select_communitySupplyTypeCanAdd",paramMap);
	}
	/**
	 * 按条件分页查询(新增商家时的可选类别)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<CommunitySupplyTypeCanAdd> selectCommunitySupplyTypeCanAddByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectCommunitySupplyTypeCanAddCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<CommunitySupplyTypeCanAdd> resMap= sqlSession.selectList("communitySupplyTypeCanAddBase.select_communitySupplyTypeCanAdd_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(新增商家时的可选类别)信息
	 * @param id
	 * @return
	 */
	@Override
	public CommunitySupplyTypeCanAdd selectCommunitySupplyTypeCanAddBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("communitySupplyTypeCanAddBase.select_communitySupplyTypeCanAdd_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(新增商家时的可选类别)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectCommunitySupplyTypeCanAddCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("communitySupplyTypeCanAddBase.select_communitySupplyTypeCanAdd_count", paramMap);
	}
	/**
	 * 往(新增商家时的可选类别)新增一条记录
	 * @param communitySupplyTypeCanAdd
	 * @return
	 */
	@Override
	public int insertCommunitySupplyTypeCanAdd(CommunitySupplyTypeCanAdd communitySupplyTypeCanAdd){
		return sqlSession.insert("communitySupplyTypeCanAddBase.insert_communitySupplyTypeCanAdd",communitySupplyTypeCanAdd);
	}
	/**
	 * 批量新增(新增商家时的可选类别)信息
	 * @param communitySupplyTypeCanAddList
	 * @return
	 */
	@Override
	public int insertCommunitySupplyTypeCanAddBatch(List<CommunitySupplyTypeCanAdd> communitySupplyTypeCanAddList) {
		return sqlSession.insert("communitySupplyTypeCanAddBase.insert_communitySupplyTypeCanAdd_Batch",communitySupplyTypeCanAddList);
	}
	
	/**
	 * 更新(新增商家时的可选类别)信息
	 * @param communitySupplyTypeCanAdd
	 * @return
	 */
	@Override
	public int updateCommunitySupplyTypeCanAdd(CommunitySupplyTypeCanAdd communitySupplyTypeCanAdd){
		return sqlSession.update("communitySupplyTypeCanAddBase.update_communitySupplyTypeCanAdd", communitySupplyTypeCanAdd);
	}
	/**
	 * 批量更新(新增商家时的可选类别)信息
	 * @param communitySupplyTypeCanAddList
	 * @return
	 */
	@Override
	public int updateCommunitySupplyTypeCanAddBatch(List<CommunitySupplyTypeCanAdd> communitySupplyTypeCanAddList) {
		return sqlSession.update("communitySupplyTypeCanAddBase.update_communitySupplyTypeCanAdd_Batch", communitySupplyTypeCanAddList);
	}
	
	/**
	 * 根据序列号删除(新增商家时的可选类别)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteCommunitySupplyTypeCanAddLogic(java.math.BigInteger id){
		CommunitySupplyTypeCanAdd communitySupplyTypeCanAdd = new CommunitySupplyTypeCanAdd();
		communitySupplyTypeCanAdd.setId(id);
		communitySupplyTypeCanAdd.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("communitySupplyTypeCanAddBase.delete_communitySupplyTypeCanAdd_Logic",communitySupplyTypeCanAdd);
	}
	
	/**
	 * 根据Id 批量删除(新增商家时的可选类别)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteCommunitySupplyTypeCanAddLogicBatch(List<java.math.BigInteger> idList) {
		List<CommunitySupplyTypeCanAdd> delList = new java.util.ArrayList<CommunitySupplyTypeCanAdd>();
		for(java.math.BigInteger id:idList){
			CommunitySupplyTypeCanAdd communitySupplyTypeCanAdd = new CommunitySupplyTypeCanAdd();
			communitySupplyTypeCanAdd.setId(id);
			communitySupplyTypeCanAdd.setSys0DelState(RecordState_DELETED);
			delList.add(communitySupplyTypeCanAdd);
		}
		return sqlSession.update("communitySupplyTypeCanAddBase.delete_communitySupplyTypeCanAdd_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(新增商家时的可选类别)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteCommunitySupplyTypeCanAdd(java.math.BigInteger id){
//		return sqlSession.delete("communitySupplyTypeCanAddBase.delete_communitySupplyTypeCanAdd", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(新增商家时的可选类别)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteCommunitySupplyTypeCanAddBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("communitySupplyTypeCanAddBase.delete_communitySupplyTypeCanAdd_Batch", idList);
//	}
	
	
}
