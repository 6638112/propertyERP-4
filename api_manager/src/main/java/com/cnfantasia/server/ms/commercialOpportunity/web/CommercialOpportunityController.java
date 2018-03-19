package com.cnfantasia.server.ms.commercialOpportunity.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cnfantasia.server.api.pub.utils.CnfantasiaCommbusiUtil;
import com.cnfantasia.server.common.exception.ValidateRuntimeException;
import com.cnfantasia.server.common.json.JsonResponse;
import com.cnfantasia.server.common.utils.ParamUtils;
import com.cnfantasia.server.domain.pub.constant.SEQConstants;
import com.cnfantasia.server.domainbase.commercialOpportunity.entity.CommercialOpportunity;
import com.cnfantasia.server.domainbase.commercialOpportunity.service.CommercialOpportunityBaseService;
import com.cnfantasia.server.ms.payBill.web.AbstractPayBillController;

@Controller
@RequestMapping("/commercialOpportunity")
public class CommercialOpportunityController extends AbstractPayBillController {

	@Resource
	CommercialOpportunityBaseService commercialOpportunityBaseService;

	@RequestMapping("/joinUs.html")
	public ModelAndView toJoinUs(HttpServletRequest request) {
		return new ModelAndView("/commercialOpportunity/joinUs");
	}

	/**
	 * 保存商机
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/saveCOinfo.html")
	@ResponseBody
	public JsonResponse getSelectUnitNameList(HttpServletRequest request) throws Exception {
		String linkName = ParamUtils.getString(request, "linkName");
		String linkTel = ParamUtils.getString(request, "linkTel");
		String companyName = ParamUtils.getString(request, "companyName");

		/* 后面又增加了另一个物业商机，不需要填联系人的，所以姓名允许为空 Added by Wenfq 2016-07-05
		 * if (StringUtils.isEmpty(linkName)) {
			throw new ValidateRuntimeException("姓名不能为空！");
		}*/
		if (StringUtils.isEmpty(linkTel)) {
			throw new ValidateRuntimeException("电话号码不能为空！");
		}
		if (StringUtils.isEmpty(companyName)) {
			throw new ValidateRuntimeException("公司名称不能为空！");
		}

		JsonResponse jsonResponse = new JsonResponse();

		CommercialOpportunity co = new CommercialOpportunity();
		co.setId(CnfantasiaCommbusiUtil.getUuid(SEQConstants.t_commercial_opportunity));
		co.setLinkname(linkName);
		co.setLinktel(linkTel);
		co.setCompanyName(companyName);
		commercialOpportunityBaseService.insertCommercialOpportunity(co);

		return jsonResponse;
	}

}
