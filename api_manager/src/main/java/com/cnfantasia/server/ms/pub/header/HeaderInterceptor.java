/**   
* Filename:    HeaderInterceptor.java   
* @version:    1.0  
* Create at:   2014年5月6日 上午12:54:08   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2014年5月6日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.ms.pub.header;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Filename:    HeaderInterceptor.java
 * @version:    1.0.0
 * Create at:   2014年5月6日 上午12:54:08
 * Description:请求头header拦截处理
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 * 2014年5月6日       shiyl             1.0             1.0 Version
 */
public class HeaderInterceptor extends HandlerInterceptorAdapter{
//	private static final String HEADER_PARAM_NAME_CHANNEL = "channelId";
	private static final String HEADER_PARAM_NAME_SUB_CHANNEL = "subChannelId";
	private static final String HEADER_PARAM_NAME_DEVICE_ID = "deviceId";
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		//将主渠道信息存入request的attribute
//		String channelId = request.getHeader(HEADER_PARAM_NAME_CHANNEL);
//		request.setAttribute(HeaderManager.HEADER_ATTR_NAME_CHANNEL, channelId);
		//将sub渠道信息存入request的attribute
		String subChannel = request.getHeader(HEADER_PARAM_NAME_SUB_CHANNEL);
		String deviceId = request.getHeader(HEADER_PARAM_NAME_DEVICE_ID);
		request.setAttribute(HeaderManager.HEADER_ATTR_NAME_SUB_CHANNEL,subChannel);
		request.setAttribute(HeaderManager.HEADER_ATTR_NAME_DEVICE_ID,deviceId);
		
		return super.preHandle(request, response, handler);
	}
	
}
