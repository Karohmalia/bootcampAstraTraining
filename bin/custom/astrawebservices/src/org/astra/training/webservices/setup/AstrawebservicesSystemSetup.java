/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.webservices.setup;

import static org.astra.training.webservices.constants.AstrawebservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.astra.training.webservices.constants.AstrawebservicesConstants;
import org.astra.training.webservices.service.AstrawebservicesService;


@SystemSetup(extension = AstrawebservicesConstants.EXTENSIONNAME)
public class AstrawebservicesSystemSetup
{
	private final AstrawebservicesService astrawebservicesService;

	public AstrawebservicesSystemSetup(final AstrawebservicesService astrawebservicesService)
	{
		this.astrawebservicesService = astrawebservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		astrawebservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return AstrawebservicesSystemSetup.class.getResourceAsStream("/astrawebservices/sap-hybris-platform.png");
	}
}
