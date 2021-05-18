/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.applecommerce.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.applecommerce.fulfilmentprocess.constants.ApplecommerceFulfilmentProcessConstants;

public class ApplecommerceFulfilmentProcessManager extends GeneratedApplecommerceFulfilmentProcessManager
{
	public static final ApplecommerceFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ApplecommerceFulfilmentProcessManager) em.getExtension(ApplecommerceFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
