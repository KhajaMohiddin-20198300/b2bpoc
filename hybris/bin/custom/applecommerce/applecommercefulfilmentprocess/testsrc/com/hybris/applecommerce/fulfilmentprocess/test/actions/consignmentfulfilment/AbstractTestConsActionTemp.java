/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.applecommerce.fulfilmentprocess.test.actions.consignmentfulfilment;

import de.hybris.platform.processengine.model.BusinessProcessModel;
import com.hybris.applecommerce.fulfilmentprocess.constants.ApplecommerceFulfilmentProcessConstants;
import com.hybris.applecommerce.fulfilmentprocess.test.actions.TestActionTemp;

import org.apache.log4j.Logger;


/**
 *
 */
public abstract class AbstractTestConsActionTemp extends TestActionTemp
{
	private static final Logger LOG = Logger.getLogger(AbstractTestConsActionTemp.class);

	@Override
	public String execute(final BusinessProcessModel process) throws Exception
	{
		//getQueueService().actionExecuted(getParentProcess(process), this);
		LOG.info(getResult());
		return getResult();
	}


	public BusinessProcessModel getParentProcess(final BusinessProcessModel process)
	{
		final String parentCode = (String) getProcessParameterValue(process, ApplecommerceFulfilmentProcessConstants.PARENT_PROCESS);
		return getBusinessProcessService().getProcess(parentCode);
	}
}
