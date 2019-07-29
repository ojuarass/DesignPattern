package com.pattern.businessdelegate;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		return serviceType.equalsIgnoreCase("EJB") ? new EJBService() : new JMSService();

	}
}
