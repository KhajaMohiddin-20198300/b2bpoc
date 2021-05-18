/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 15-May-2021, 10:18:34 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.applecommerce.jalo;

import com.hybris.applecommerce.core.constants.ApplecommerceCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.applecommerce.jalo.Student Student}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedStudent extends GenericItem
{
	/** Qualifier of the <code>Student.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Student.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Student.age</code> attribute **/
	public static final String AGE = "age";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive()
	{
		return getAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Integer value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final int value)
	{
		setAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final int value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
