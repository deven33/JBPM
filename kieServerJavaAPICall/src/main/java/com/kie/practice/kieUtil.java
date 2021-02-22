package com.kie.practice;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;

public class kieUtil {

	String URL = "http://localhost:8080/kie-server/services/rest/server";
	// internally it will call as rest service only
	String username = "wbadmin";
	String password = "wbadmin";

	public KieServicesClient getkKieServicesClient() {
		// 1. get kie services configuration
		KieServicesConfiguration configuration = KieServicesFactory.newRestConfiguration(URL, username, password);
		//set marshalling stretegy
		configuration.setMarshallingFormat(MarshallingFormat.JSON);
		System.out.println("client triggered");
		return KieServicesFactory.newKieServicesClient(configuration);
	}
}
