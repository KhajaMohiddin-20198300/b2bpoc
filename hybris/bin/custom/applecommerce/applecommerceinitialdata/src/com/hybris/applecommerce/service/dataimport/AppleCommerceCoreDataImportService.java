/**
 *
 */
package com.hybris.applecommerce.service.dataimport;

import de.hybris.platform.commerceservices.dataimport.impl.CoreDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.commerceservices.util.ResponsiveUtils;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.io.InputStream;


/**
 * @author User
 *
 */
public class AppleCommerceCoreDataImportService extends CoreDataImportService
{
	/**
	 * Imports store data related to Powertools. Imports a site-override impex if available.
	 *
	 * @param extensionName
	 *           the extension name used.
	 * @param storeName
	 *           the store to import for.
	 * @param productCatalogName
	 *           the product catalog used.
	 */

	@Override
	protected void importCommonData(final String extensionName)
	{
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/essential-data.impex", extensionName),
				true);
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/countries.impex", extensionName), false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/themes.impex", extensionName), false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/delivery-modes.impex", extensionName),
				false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/common/regions.impex", extensionName), false);
	}

	@Override
	protected void importProductCatalog(final String extensionName, final String productCatalogName)
	{
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/coredata/productCatalogs/applecommerceProductCatalog/catalog.impex", extensionName), false);

	}


	@Override
	protected void importContentCatalog(final String extensionName, final String contentCatalogName)
	{
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/contentCatalogs/%sContentCatalog/catalog.impex",
				extensionName, contentCatalogName), false);

		if (isResponsive())
		{
			final String responsiveContentFile = String.format(
					"/%s/import/coredata/contentCatalogs/%sContentCatalog/cms-responsive-content.impex", extensionName,
					contentCatalogName);
			if (getInputStream(responsiveContentFile) != null)
			{
				getSetupImpexService().importImpexFile(responsiveContentFile, false);
			}
			else
			{
				getSetupImpexService()
						.importImpexFile(String.format("/%s/import/coredata/contentCatalogs/%sContentCatalog/cms-content.impex",
								extensionName, contentCatalogName), false);
			}
		}
		else
		{
			getSetupImpexService()
					.importImpexFile(String.format("/%s/import/coredata/contentCatalogs/%sContentCatalog/cms-content.impex",
							extensionName, contentCatalogName), false);

			if (getConfigurationService().getConfiguration().getBoolean(IMPORT_MOBILE_DATA, false))
			{
				getSetupImpexService()
						.importImpexFile(String.format("/%s/import/coredata/contentCatalogs/%sContentCatalog/cms-mobile-content.impex",
								extensionName, contentCatalogName), false);
			}
		}

		getSetupImpexService()
				.importImpexFile(String.format("/%s/import/coredata/contentCatalogs/%sContentCatalog/email-content.impex",
						extensionName, contentCatalogName), false);
	}


	@Override
	protected void importStore(final String extensionName, final String storeName, final String productCatalogName)
	{
		super.importStore(extensionName, storeName, productCatalogName);

		if (getConfigurationService().getConfiguration().getBoolean("setup.siteoverride", false))
		{
			getSetupImpexService().importImpexFile(
					String.format("/%s/import/coredata/stores/%s/site-override.impex", extensionName, storeName), false);

			getSetupImpexService().importImpexFile(
					String.format("/%s/import/coredata/stores/%s/site-responsive.impex", extensionName, storeName), false);

			getSetupImpexService()
					.importImpexFile(String.format("/%s/import/coredata/stores/%s/site.impex", extensionName, storeName), false);

			getSetupImpexService()
					.importImpexFile(String.format("/%s/import/coredata/stores/%s/store.impex", extensionName, storeName), false);

			getSetupImpexService().importImpexFile(
					String.format("/%s/import/coredata/stores/%s/store-responsive.impex", extensionName, storeName), false);
		}
	}

	@Override
	protected void importSolrIndex(final String extensionName, final String storeName)
	{
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/stores/%s/solr.impex", extensionName, storeName),
				false);

		getSetupSolrIndexerService().createSolrIndexerCronJobs(String.format("%sIndex", "apple-in"));

		getSetupImpexService()
				.importImpexFile(String.format("/%s/import/coredata/stores/%s/solrtrigger.impex", extensionName, storeName), false);
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

	@Override
	protected void importJobs(final String extensionName, final String storeName)
	{
		getSetupImpexService().importImpexFile(String.format("/%s/import/coredata/stores/%s/jobs.impex", extensionName, storeName),
				false);
	}

	@Override
	protected InputStream getInputStream(final String fileName)
	{
		return getClass().getResourceAsStream(fileName);
	}

	@Override
	protected boolean isResponsive()
	{
		return ResponsiveUtils.isResponsive();
	}

}
