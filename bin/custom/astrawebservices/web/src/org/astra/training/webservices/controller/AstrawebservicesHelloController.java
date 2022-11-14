/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.webservices.controller;

import static org.astra.training.webservices.constants.AstrawebservicesConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.astra.training.webservices.service.AstrawebservicesService;


@Controller
public class AstrawebservicesHelloController
{
	@Autowired
	private AstrawebservicesService astrawebservicesService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", astrawebservicesService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
