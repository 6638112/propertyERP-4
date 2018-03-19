package com.cnfantasia.server.domainbase.payRecord.dao;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cnfantasia.server.domain.pub.dao.AbstractBaseDao;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.payRecord.entity.PayRecord;

/**
 * 描述:(物业缴费记录) DAO层
 * 
 * @version 1.00
 * @author null
 * 
 */
@Repository
public class PayRecordBaseDao extends AbstractBaseDao implements IPayRecordBaseDao{
	/**
	 * 根据条件查询(物业缴费记录)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<PayRecord> selectPayRecordByCondition(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectList("payRecordBase.select_payRecord",paramMap);
	}
	/**
	 * 按条件分页查询(物业缴费记录)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public List<PayRecord> selectPayRecordByCondition(Map<String,Object> paramMap,PageModel pageModel,boolean isDim) {
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		else{paramMap = new java.util.HashMap<String,Object>();}
		Integer totalCount=null;
		if(null==pageModel.isCount||pageModel.isCount){totalCount=selectPayRecordCount(paramMap,isDim);}//为null,默认统计分页信息
		pageModel.validate(totalCount);
		
		int old=paramMap.size();
		Map<String,Object> pageMap=pageModel.toMap();
		paramMap.putAll(pageMap);//此句代码需要确保传入的paramMap不包含分页信息的key，否则传入的paramMap的相应信息会被覆盖。
		if(old+pageMap.size()!=paramMap.size()){throw new RuntimeException("The merge of params cause some lose ,the paramMap is:"+paramMap);}
		
		List<PayRecord> resMap= sqlSession.selectList("payRecordBase.select_payRecord_withPage",paramMap);
		
		pageModel.freshPageModel(resMap.size(),totalCount);//pageModel信息的更新通过引用实现
		return resMap;
	}
	/**
	 * 根据序列号查询(物业缴费记录)信息
	 * @param id
	 * @return
	 */
	@Override
	public PayRecord selectPayRecordBySeqId(java.math.BigInteger id){
		return sqlSession.selectOne("payRecordBase.select_payRecord_bySeqId",id);
	}
	/**
	 * 根据条件查询满足条件的(物业缴费记录)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	@Override
	public int selectPayRecordCount(Map<String,Object> paramMap,boolean isDim){
		//if(paramMap!=null){paramMap = new HashMap<String, Object>();}
		if(paramMap!=null){paramMap.put(QUERY_TYPE_IF_DIM, isDim);}
		return sqlSession.selectOne("payRecordBase.select_payRecord_count", paramMap);
	}
	/**
	 * 往(物业缴费记录)新增一条记录
	 * @param payRecord
	 * @return
	 */
	@Override
	public int insertPayRecord(PayRecord payRecord){
		return sqlSession.insert("payRecordBase.insert_payRecord",payRecord);
	}
	/**
	 * 批量新增(物业缴费记录)信息
	 * @param payRecordList
	 * @return
	 */
	@Override
	public int insertPayRecordBatch(List<PayRecord> payRecordList) {
		return sqlSession.insert("payRecordBase.insert_payRecord_Batch",payRecordList);
	}
	
	/**
	 * 更新(物业缴费记录)信息
	 * @param payRecord
	 * @return
	 */
	@Override
	public int updatePayRecord(PayRecord payRecord){
		return sqlSession.update("payRecordBase.update_payRecord", payRecord);
	}
	/**
	 * 批量更新(物业缴费记录)信息
	 * @param payRecordList
	 * @return
	 */
	@Override
	public int updatePayRecordBatch(List<PayRecord> payRecordList) {
		return sqlSession.update("payRecordBase.update_payRecord_Batch", payRecordList);
	}
	
	/**
	 * 根据序列号删除(物业缴费记录)信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	@Override
	public int deletePayRecordLogic(java.math.BigInteger id){
		PayRecord payRecord = new PayRecord();
		payRecord.setId(id);
		payRecord.setSys0DelState(RecordState_DELETED);
		return sqlSession.update("payRecordBase.delete_payRecord_Logic",payRecord);
	}
	
	/**
	 * 根据Id 批量删除(物业缴费记录)信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	@Override
	public int deletePayRecordLogicBatch(List<java.math.BigInteger> idList) {
		List<PayRecord> delList = new java.util.ArrayList<PayRecord>();
		for(java.math.BigInteger id:idList){
			PayRecord payRecord = new PayRecord();
			payRecord.setId(id);
			payRecord.setSys0DelState(RecordState_DELETED);
			delList.add(payRecord);
		}
		return sqlSession.update("payRecordBase.delete_payRecord_Logic_Batch",delList);
	}
	
//	/**
//	 * 根据序列号删除(物业缴费记录)信息
//	 * @param id
//	 * @return
//	 */
//	@Override
//	public int deletePayRecord(java.math.BigInteger id){
//		return sqlSession.delete("payRecordBase.delete_payRecord", id);
//	}
//	
//	/**
//	 * 根据序列号批量删除(物业缴费记录)信息
//	 * @param idList
//	 * @return
//	 */
//	@Override
//	public int deletePayRecordBatch(List<java.math.BigInteger> idList) {
//		return sqlSession.delete("payRecordBase.delete_payRecord_Batch", idList);
//	}
	
	
}
