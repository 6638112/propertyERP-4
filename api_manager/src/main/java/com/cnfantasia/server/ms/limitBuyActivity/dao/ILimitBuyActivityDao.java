package com.cnfantasia.server.ms.limitBuyActivity.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.cnfantasia.server.domainbase.ebuyProduct.entity.EbuyProduct;
import com.cnfantasia.server.ms.limitBuyActivity.entity.LimitBuyActivityDetailDto;
import com.cnfantasia.server.ms.limitBuyActivity.entity.LimitBuyActivityListDto;

/**
 * 限时购
 * 
 * @author liyulin
 * @version 1.0 2016年12月29日 下午2:08:48
 */
public interface ILimitBuyActivityDao {

	/**
	 * 限时购列表数据查询
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<LimitBuyActivityListDto> selectLimitBuyActivityForPage(Map<String, Object> paramMap);
	
	/**
	 * 限时购列表数据条数查询
	 * 
	 * @param paramMap
	 * @return
	 */
	public int selectLimitBuyActivityForCount(Map<String, Object> paramMap);
	
	/***
	 * 限时购详情
	 * 
	 * @param ibaId
	 * @return
	 */
	public LimitBuyActivityDetailDto selectLimitBuyActivityForDetail(BigInteger ibaId);
	
	/**
	 * 限时购详情基本信息
	 * 
	 * @param productId
	 * @return
	 */
	public LimitBuyActivityDetailDto selectLimitBuyActivityForBaseDetail(BigInteger productId);

	int downShelf(List<EbuyProduct> ebuyProducts);
}
