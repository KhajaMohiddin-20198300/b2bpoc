/**
 *
 */
package com.hybris.applecommerce.service.dataimport;

import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;


/**
 * Implementation to handle specific Sample Data Import services to Powertools.
 */
public class AppleCommerceSampleDataImportService extends SampleDataImportService
{

	/**
	 * Imports the data related to Commerce Org.
	 *
	 * @param context
	 *           the context used.
	 */

	private static final Logger LOG = Logger.getLogger(AppleCommerceSampleDataImportService.class);

	@Override
	protected void importCommonData(final String extensionName)
	{
		LOG.info("No commondata available in SampleData folder for Import ");

	}

	@Override
	protected void importProductCatalog(final String extensionName, final String productCatalogName)
	{
		// Load Products
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/applecommerceProductCatalog/products.impex", extensionName),
				false);
		getSetupImpexService().importImpexFile(String.format(
				"/%s/import/sampledata/productCatalogs/applecommerceProductCatalog/products-prices.impex", extensionName), false);
	}

	@Override
	protected void importContentCatalog(final String extensionName, final String contentCatalogName)
	{

		getSetupImpexService()
				.importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/apple-inContentCatalog/cms-content.impex",
						extensionName, contentCatalogName), false);
		getSetupImpexService()
				.importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/apple-inContentCatalog/email-content.impex",
						extensionName, contentCatalogName), false);

	}

	@Override
	public boolean synchronizeProductCatalog(final AbstractSystemSetup systemSetup, final SystemSetupContext context,
			final String catalogName, final boolean syncCatalogs)
	{
		systemSetup.logInfo(context, String.format("Begin synchronizing Product Catalog [%s]", "applecommerce"));

		getSetupSyncJobService().createProductCatalogSyncJob(String.format("%sProductCatalog", "applecommerce"));

		if (syncCatalogs)
		{
			final PerformResult syncCronJobResult = getSetupSyncJobService()
					.executeCatalogSyncJob(String.format("%sProductCatalog", "applecommerce"));
			if (isSyncRerunNeeded(syncCronJobResult))
			{
				systemSetup.logInfo(context, String.format("Product Catalog [%s] sync has issues.", "applecommerce"));
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean synchronizeContentCatalog(final AbstractSystemSetup systemSetup, final SystemSetupContext context,
			final String catalogName, final boolean syncCatalogs)
	{
		systemSetup.logInfo(context, String.format("Begin synchronizing Content Catalog [%s]", catalogName));

		getSetupSyncJobService().createContentCatalogSyncJob(String.format("%sContentCatalog", "apple-in"));

		if (syncCatalogs)
		{
			final PerformResult syncCronJobResult = getSetupSyncJobService()
					.executeCatalogSyncJob(String.format("%sContentCatalog", "apple-in"));
			if (isSyncRerunNeeded(syncCronJobResult))
			{
				systemSetup.logInfo(context, String.format("Content Catalog [%s] sync has issues.", "apple-in"));
				return false;
			}
		}

		return true;
	}

	public void importCommerceOrgData(final SystemSetupContext context)
	{
		final String extensionName = context.getExtensionName();

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/commerceorg/user-groups.impex", extensionName),
				false);
	}

}
