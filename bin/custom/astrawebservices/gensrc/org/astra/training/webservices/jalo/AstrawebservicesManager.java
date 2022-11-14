/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 15, 2022, 12:22:34 AM                   ---
 * ----------------------------------------------------------------
 */
package org.astra.training.webservices.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import java.util.HashMap;
import java.util.Map;
import org.astra.training.webservices.constants.AstrawebservicesConstants;

/**
 * Generated class for type <code>AstrawebservicesManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class AstrawebservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public static final AstrawebservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AstrawebservicesManager) em.getExtension(AstrawebservicesConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return AstrawebservicesConstants.EXTENSIONNAME;
	}
	
}
