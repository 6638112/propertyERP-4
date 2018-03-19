/**   
* Filename:    GroupBuildingIconParamParser.java   
* @version:    1.0  
* Create at:   2014年7月24日 上午1:31:53   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2014年7月24日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.api.commSysPara.parser;

import com.cnfantasia.server.api.commSysPara.constant.SysParamKey;

/**
 * Filename:    GroupBuildingIconParamParser.java
 * @version:    1.0.0
 * Create at:   2014年7月24日 上午1:31:53
 * Description:
 *
 * Modification History:
 * Date           Author           Version           Description
 * ------------------------------------------------------------------
 * 2014年7月24日       shiyl             1.0             1.0 Version
 */
public class GroupBuildingIconParamParser extends AbstractSysParamParser{

	@SuppressWarnings("unchecked")
	@Override
	protected String doParse(String sysParamValue) {
		return sysParamValue;
	}

	@Override
	protected String getSysParamKey() {
		return SysParamKey.GROUP_BUILDING_ICON_BASEPATH;
	}
	
}
