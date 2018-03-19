package com.cnfantasia.server.api.ebuy.dao;

import com.cnfantasia.server.api.ebuy.entity.EbuyAdvertise;
import com.cnfantasia.server.api.ebuy.entity.EbuyAdvertiseWithRela;
import com.cnfantasia.server.domainbase.ebuyFightSupplyMerchant.entity.EbuyFightSupplyMerchant;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface IEbuyAdvertiseDao {
	
	public List<EbuyAdvertise> getEbuyAdvertiseList(String code, Integer version);
	
	public List<EbuyAdvertiseWithRela> getEbuyAdvertiseList(Map<String, Object> paramMap);

	public EbuyAdvertise getMainPromoteAdvertise(Map paramMap);
	
	/**
	 * 查询有拼购商品的自提点
	 * 
	 * @return
	 */
	public List<EbuyFightSupplyMerchant> queryFightGroupProductZiti();
	
	/**
	 * 查询有推广商品的banner
	 * 
	 * @return
	 */
	public List<BigInteger> queryPromoteProductAdIds();

}
