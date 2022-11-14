/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.astra.training.fulfilmentprocess.constants.AstraFulfilmentProcessConstants;

public class AstraFulfilmentProcessManager extends GeneratedAstraFulfilmentProcessManager
{
	public static final AstraFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AstraFulfilmentProcessManager) em.getExtension(AstraFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
