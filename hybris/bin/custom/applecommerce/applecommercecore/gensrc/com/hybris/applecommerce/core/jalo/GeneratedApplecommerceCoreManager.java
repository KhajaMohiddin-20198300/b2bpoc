/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 15-May-2021, 10:18:34 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.applecommerce.core.jalo;

import com.hybris.applecommerce.core.constants.ApplecommerceCoreConstants;
import com.hybris.applecommerce.core.jalo.ApparelProduct;
import com.hybris.applecommerce.core.jalo.ApparelSizeVariantProduct;
import com.hybris.applecommerce.core.jalo.ApparelStyleVariantProduct;
import com.hybris.applecommerce.core.jalo.CustomOffersComponent;
import com.hybris.applecommerce.core.jalo.ElectronicProduct;
import com.hybris.applecommerce.core.jalo.ElectronicsColorVariantProduct;
import com.hybris.applecommerce.core.jalo.ThirdPartyCredential;
import com.hybris.applecommerce.core.jalo.VideoComponent;
import com.hybris.applecommerce.core.jalo.YoutubeVideoComponent;
import com.hybris.applecommerce.jalo.Student;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ApplecommerceCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedApplecommerceCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("PermanentAddress", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomOffersComponent createCustomOffersComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.CUSTOMOFFERSCOMPONENT );
			return (CustomOffersComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomOffersComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomOffersComponent createCustomOffersComponent(final Map attributeValues)
	{
		return createCustomOffersComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicProduct createElectronicProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.ELECTRONICPRODUCT );
			return (ElectronicProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicProduct createElectronicProduct(final Map attributeValues)
	{
		return createElectronicProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Student createStudent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.STUDENT );
			return (Student)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Student : "+e.getMessage(), 0 );
		}
	}
	
	public Student createStudent(final Map attributeValues)
	{
		return createStudent( getSession().getSessionContext(), attributeValues );
	}
	
	public ThirdPartyCredential createThirdPartyCredential(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.THIRDPARTYCREDENTIAL );
			return (ThirdPartyCredential)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ThirdPartyCredential : "+e.getMessage(), 0 );
		}
	}
	
	public ThirdPartyCredential createThirdPartyCredential(final Map attributeValues)
	{
		return createThirdPartyCredential( getSession().getSessionContext(), attributeValues );
	}
	
	public VideoComponent createVideoComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.VIDEOCOMPONENT );
			return (VideoComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating VideoComponent : "+e.getMessage(), 0 );
		}
	}
	
	public VideoComponent createVideoComponent(final Map attributeValues)
	{
		return createVideoComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public YoutubeVideoComponent createYoutubeVideoComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ApplecommerceCoreConstants.TC.YOUTUBEVIDEOCOMPONENT );
			return (YoutubeVideoComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating YoutubeVideoComponent : "+e.getMessage(), 0 );
		}
	}
	
	public YoutubeVideoComponent createYoutubeVideoComponent(final Map attributeValues)
	{
		return createYoutubeVideoComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ApplecommerceCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.PermanentAddress</code> attribute.
	 * @return the PermanentAddress - PermanentAddress
	 */
	public Boolean isPermanentAddress(final SessionContext ctx, final Address item)
	{
		return (Boolean)item.getProperty( ctx, ApplecommerceCoreConstants.Attributes.Address.PERMANENTADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.PermanentAddress</code> attribute.
	 * @return the PermanentAddress - PermanentAddress
	 */
	public Boolean isPermanentAddress(final Address item)
	{
		return isPermanentAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.PermanentAddress</code> attribute. 
	 * @return the PermanentAddress - PermanentAddress
	 */
	public boolean isPermanentAddressAsPrimitive(final SessionContext ctx, final Address item)
	{
		Boolean value = isPermanentAddress( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.PermanentAddress</code> attribute. 
	 * @return the PermanentAddress - PermanentAddress
	 */
	public boolean isPermanentAddressAsPrimitive(final Address item)
	{
		return isPermanentAddressAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.PermanentAddress</code> attribute. 
	 * @param value the PermanentAddress - PermanentAddress
	 */
	public void setPermanentAddress(final SessionContext ctx, final Address item, final Boolean value)
	{
		item.setProperty(ctx, ApplecommerceCoreConstants.Attributes.Address.PERMANENTADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.PermanentAddress</code> attribute. 
	 * @param value the PermanentAddress - PermanentAddress
	 */
	public void setPermanentAddress(final Address item, final Boolean value)
	{
		setPermanentAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.PermanentAddress</code> attribute. 
	 * @param value the PermanentAddress - PermanentAddress
	 */
	public void setPermanentAddress(final SessionContext ctx, final Address item, final boolean value)
	{
		setPermanentAddress( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.PermanentAddress</code> attribute. 
	 * @param value the PermanentAddress - PermanentAddress
	 */
	public void setPermanentAddress(final Address item, final boolean value)
	{
		setPermanentAddress( getSession().getSessionContext(), item, value );
	}
	
}
