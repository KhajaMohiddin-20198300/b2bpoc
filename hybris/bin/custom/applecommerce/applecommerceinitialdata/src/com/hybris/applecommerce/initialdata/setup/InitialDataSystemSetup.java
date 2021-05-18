/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.applecommerce.initialdata.setup;

import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.commerceservices.setup.data.ImportData;
import de.hybris.platform.commerceservices.setup.events.CoreDataImportedEvent;
import de.hybris.platform.commerceservices.setup.events.SampleDataImportedEvent;
import de.hybris.platform.core.initialization.SystemSetup;
import de.hybris.platform.core.initialization.SystemSetup.Process;
import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.core.initialization.SystemSetupParameter;
import de.hybris.platform.core.initialization.SystemSetupParameterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.hybris.applecommerce.initialdata.constants.ApplecommerceInitialDataConstants;
import com.hybris.applecommerce.service.dataimport.AppleCommerceCoreDataImportService;
import com.hybris.applecommerce.service.dataimport.AppleCommerceSampleDataImportService;


/**
 * This class provides hooks into the system's initialization and update processes.
 */
@SystemSetup(extension = ApplecommerceInitialDataConstants.EXTENSIONNAME)
public class InitialDataSystemSetup extends AbstractSystemSetup
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(InitialDataSystemSetup.class);

	public static final String APPLECOMMERCE = "applecommerce";
	public static final String APPLE_IN = "apple-in";

	private static final String IMPORT_CORE_DATA = "importCoreData";
	private static final String IMPORT_SAMPLE_DATA = "importSampleData";
	private static final String ACTIVATE_SOLR_CRON_JOBS = "activateSolrCronJobs";

	private AppleCommerceCoreDataImportService appleCommerceCoreDataImportService;
	private AppleCommerceSampleDataImportService appleCommerceSampleDataImportService;


	/**
	 * Generates the Dropdown and Multi-select boxes for the project data import
	 */
	@Override
	@SystemSetupParameterMethod
	public List<SystemSetupParameter> getInitializationOptions()
	{
		final List<SystemSetupParameter> params = new ArrayList<SystemSetupParameter>();

		params.add(createBooleanSystemSetupParameter(IMPORT_CORE_DATA, "Import Core Data", true));
		params.add(createBooleanSystemSetupParameter(IMPORT_SAMPLE_DATA, "Import Sample Data", true));
		params.add(createBooleanSystemSetupParameter(ACTIVATE_SOLR_CRON_JOBS, "Activate Solr Cron Jobs", true));
		// Add more Parameters here as you require

		return params;
	}

	/**
	 * Implement this method to create initial objects. This method will be called by system creator during
	 * initialization and system update. Be sure that this method can be called repeatedly.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = Type.ESSENTIAL, process = Process.ALL)
	public void createEssentialData(final SystemSetupContext context)
	{
		// Add Essential Data here as you require

	}


	/**
	 * This method will be called during the system initialization.
	 *
	 * @param context
	 *           the context provides the selected parameters and values
	 */
	@SystemSetup(type = SystemSetup.Type.PROJECT, process = SystemSetup.Process.ALL)
	public void createProjectData(final SystemSetupContext context)
	{

		// Add import data for each site you have configured

		LOG.info("Start creating project data");
		final List<ImportData> importData = new ArrayList<ImportData>();

		final ImportData sampleImportData = new ImportData();
		sampleImportData.setProductCatalogName(APPLECOMMERCE);
		sampleImportData.setContentCatalogNames(Arrays.asList(APPLE_IN));
		sampleImportData.setStoreNames(Arrays.asList(APPLE_IN));
		importData.add(sampleImportData);

		getAppleCommerceCoreDataImportService().execute(this, context, importData);
		getEventService().publishEvent(new CoreDataImportedEvent(context, importData));

		getAppleCommerceSampleDataImportService().execute(this, context, importData);
		getAppleCommerceSampleDataImportService().importCommerceOrgData(context);
		getEventService().publishEvent(new SampleDataImportedEvent(context, importData));

		LOG.info("End creating project data");

	}

	/**
	 * @return the appleCommerceCoreDataImportService
	 */
	public AppleCommerceCoreDataImportService getAppleCommerceCoreDataImportService()
	{
		return appleCommerceCoreDataImportService;
	}

	/**
	 * @param appleCommerceCoreDataImportService
	 *           the appleCommerceCoreDataImportService to set
	 */
	public void setAppleCommerceCoreDataImportService(final AppleCommerceCoreDataImportService appleCommerceCoreDataImportService)
	{
		this.appleCommerceCoreDataImportService = appleCommerceCoreDataImportService;
	}

	/**
	 * @return the appleCommerceSampleDataImportService
	 */
	public AppleCommerceSampleDataImportService getAppleCommerceSampleDataImportService()
	{
		return appleCommerceSampleDataImportService;
	}

	/**
	 * @param appleCommerceSampleDataImportService
	 *           the appleCommerceSampleDataImportService to set
	 */
	public void setAppleCommerceSampleDataImportService(
			final AppleCommerceSampleDataImportService appleCommerceSampleDataImportService)
	{
		this.appleCommerceSampleDataImportService = appleCommerceSampleDataImportService;
	}

}
