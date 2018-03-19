package com.cnfantasia.server.api.commSysPara.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cnfantasia.server.api.commSysPara.constant.SysParamKey;
import com.cnfantasia.server.api.commSysPara.entity.QSDJPushParam;

/**
 * 轻松到家 可配置参数
 * @author wenfq 2016-11-10
 */
public class QSDJPushParamParser extends AbstractSysParamParser {
	private Log logger = LogFactory.getLog(getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	protected QSDJPushParam doParse(String sysParamValue) {
		String[] params = sysParamValue.split(";");
		String key = params[0]; 
		String secret = params[1]; 
		String baseURL = params[2]; 
		QSDJPushParam qsdjPushParam = new QSDJPushParam(key, secret, baseURL);
		logger.debug("qsdjPushParam:"+qsdjPushParam);
		return qsdjPushParam;
	}

	@Override
	protected String getSysParamKey() {
		return SysParamKey.QSDJPushParam;
	}

}
