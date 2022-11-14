/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.webservices.service;

public interface AstrawebservicesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
