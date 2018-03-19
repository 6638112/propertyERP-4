package com.cnfantasia.server.domainbase.omsUserHasPropertyDistrict.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.omsUserHasPropertyDistrict.entity.OmsUserHasPropertyDistrict;

/**
 * 描述:(用户和片区关联表) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class OmsUserHasPropertyDistrictBaseDao extends AbstractBaseDao implements IOmsUserHasPropertyDistrictBaseDao{
	/**
	 * 根据条件查询(用户和片区关联表)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<OmsUserHasPropertyDistrict> selectOmsUserHasPropertyDistrictByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("omsUserHasPropertyDistrictBase.select_omsUserHasPropertyDistrict",paramMap);
	}
	/**
	 * 按条件分页查询(用户和片区关联表)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<OmsUserHasPropertyDistrict> selectOmsUserHasPropertyDistrictByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectOmsUserHasPropertyDistrictCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<OmsUserHasPropertyDistrict> resMap= sqlSession.selectList("omsUserHasPropertyDistrictBase.select_omsUserHasPropertyDistrict_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(用户和片区关联表)信息
	 * @param id
	 * @return
	 */
	@Override
	public OmsUserHasPropertyDistrict selectOmsUserHasPropertyDistrictBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("omsUserHasPropertyDistrictBase.select_omsUserHasPropertyDistrict_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(用户和片区关联表)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectOmsUserHasPropertyDistrictCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("omsUserHasPropertyDistrictBase.select_omsUserHasPropertyDistrict_count", paramMap);
	}
	/**
	 * 往(用户和片区关联表)新增一条记录
	 * @param omsUserHasPropertyDistrict
	 * @return
	 */
	@Override
	public int insertOmsUserHasPropertyDistrict(OmsUserHasPropertyDistrict omsUserHasPropertyDistrict){
		return sqlSession.insert("omsUserHasPropertyDistrictBase.insert_omsUserHasPropertyDistrict",omsUserHasPropertyDistrict);
	}
	/**
	 * 批量新增(用户和片区关联表)信息
	 * @param omsUserHasPropertyDistrictList
	 * @return
	 */
	@Override
	public int insertOmsUserHasPropertyDistrictBatch(List<OmsUserHasPropertyDistrict> omsUserHasPropertyDistrictList) {
		if (omsUserHasPropertyDistrictList == null || omsUserHasPropertyDistrictList.isEmpty()) {
			return 0;
		}
		int total = 0;
		int size = omsUserHasPropertyDistrictList.size();
		int batch = size / batchSize + (size % batchSize == 0 ? 0 : 1);
		for (int i = 0; i < batch; i++) {
			List<OmsUserHasPropertyDistrict> batchList = omsUserHasPropertyDistrictList.subList(i * batchSize, (i == batch - 1) ? size : i * batchSize + batchSize);
			total += sqlSession.insert("omsUserHasPropertyDistrictBase.insert_omsUserHasPropertyDistrict_Batch", batchList);
		}
		return total;
	}
	
	/**
	 * 更新(用户和片区关联表)信息
	 * @param omsUserHasPropertyDistrict
	 * @return
	 */
	@Override
	public int updateOmsUserHasPropertyDistrict(OmsUserHasPropertyDistrict omsUserHasPropertyDistrict){
		return sqlSession.update("omsUserHasPropertyDistrictBase.update_omsUserHasPropertyDistrict", omsUserHasPropertyDistrict);
	}
	/**
	 * 批量更新(用户和片区关联表)信息
	 * @param omsUserHasPropertyDistrictList
	 * @return
	 */
	@Override
	public int updateOmsUserHasPropertyDistrictBatch(List<OmsUserHasPropertyDistrict> omsUserHasPropertyDistrictList) {
		return sqlSession.update("omsUserHasPropertyDistrictBase.update_omsUserHasPropertyDistrict_Batch", omsUserHasPropertyDistrictList);
	}
	
	/**
	 * 根据序列号删除(用户和片区关联表)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deleteOmsUserHasPropertyDistrictLogic(java.math.BigInteger id){
		OmsUserHasPropertyDistrict omsUserHasPropertyDistrict = new OmsUserHasPropertyDistrict();
		omsUserHasPropertyDistrict.setId(id);
		omsUserHasPropertyDistrict.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("omsUserHasPropertyDistrictBase.delete_omsUserHasPropertyDistrict_Logic",omsUserHasPropertyDistrict);
	}
	
	/**
	 * 根据Id 批量删除(用户和片区关联表)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deleteOmsUserHasPropertyDistrictLogicBatch(List<java.math.BigInteger> idList) {
		List<OmsUserHasPropertyDistrict> delList = new java.util.ArrayList<OmsUserHasPropertyDistrict>();
		for(java.math.BigInteger id:idList){
			OmsUserHasPropertyDistrict omsUserHasPropertyDistrict = new OmsUserHasPropertyDistrict();
			omsUserHasPropertyDistrict.setId(id);
			omsUserHasPropertyDistrict.setSys0DelState(RecordState_DELETED);
			delList.add(omsUserHasPropertyDistrict);
		}
		return sqlSession.update("omsUserHasPropertyDistrictBase.delete_omsUserHasPropertyDistrict_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(用户和片区关联表)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deleteOmsUserHasPropertyDistrict(java.math.BigInteger id){
//		return sqlSession.delete("omsUserHasPropertyDistrictBase.delete_omsUserHasPropertyDistrict", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(用户和片区关联表)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deleteOmsUserHasPropertyDistrictBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("omsUserHasPropertyDistrictBase.delete_omsUserHasPropertyDistrict_Batch", idList);
//	}
	
	
}
