/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.astra.training.core.constants.AstraCoreConstants;
import org.astra.training.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class AstraCoreManager extends GeneratedAstraCoreManager
{
	public static final AstraCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AstraCoreManager) em.getExtension(AstraCoreConstants.EXTENSIONNAME);
	}
}
