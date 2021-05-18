/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 15-May-2021, 10:18:34 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.applecommerce.core.jalo;

import com.hybris.applecommerce.core.constants.ApplecommerceCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.hybris.applecommerce.core.jalo.VideoComponent VideoComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVideoComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>VideoComponent.videoID</code> attribute **/
	public static final String VIDEOID = "videoID";
	/** Qualifier of the <code>VideoComponent.video</code> attribute **/
	public static final String VIDEO = "video";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VIDEOID, AttributeMode.INITIAL);
		tmp.put(VIDEO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VideoComponent.video</code> attribute.
	 * @return the video
	 */
	public Media getVideo(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, VIDEO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VideoComponent.video</code> attribute.
	 * @return the video
	 */
	public Media getVideo()
	{
		return getVideo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VideoComponent.video</code> attribute. 
	 * @param value the video
	 */
	public void setVideo(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, VIDEO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VideoComponent.video</code> attribute. 
	 * @param value the video
	 */
	public void setVideo(final Media value)
	{
		setVideo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VideoComponent.videoID</code> attribute.
	 * @return the videoID
	 */
	public String getVideoID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VIDEOID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VideoComponent.videoID</code> attribute.
	 * @return the videoID
	 */
	public String getVideoID()
	{
		return getVideoID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VideoComponent.videoID</code> attribute. 
	 * @param value the videoID
	 */
	public void setVideoID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VIDEOID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VideoComponent.videoID</code> attribute. 
	 * @param value the videoID
	 */
	public void setVideoID(final String value)
	{
		setVideoID( getSession().getSessionContext(), value );
	}
	
}
