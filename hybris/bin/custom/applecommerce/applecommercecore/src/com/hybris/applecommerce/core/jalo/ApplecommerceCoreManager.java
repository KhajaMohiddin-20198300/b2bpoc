/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.applecommerce.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.applecommerce.core.constants.ApplecommerceCoreConstants;
import com.hybris.applecommerce.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ApplecommerceCoreManager extends GeneratedApplecommerceCoreManager
{
	public static final ApplecommerceCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ApplecommerceCoreManager) em.getExtension(ApplecommerceCoreConstants.EXTENSIONNAME);
	}
}
