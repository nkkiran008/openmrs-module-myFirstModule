package org.openmrs.module.myFirstModule.web.controller;


@Controller
@RequestMapping("/rest/" + RestConstants.VERSION_1 + "/myFirstModule")
public class MyFirstRestService extends MainResourceController {
	/**
	 * * @see org.openmrs.module.webservices.rest.web.v1_0.controller.
	 * BaseRestController#getNamespace()
	 */
	@Override
	public String getNamespace() {
		return "v1/yourmoduleid";
	}
}