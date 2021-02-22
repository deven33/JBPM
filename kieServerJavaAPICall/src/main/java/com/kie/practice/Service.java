package com.kie.practice;

import java.util.HashMap;
import java.util.Map;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;

public class Service {
	public static void main(String[] args) {
		startProcess();
	}

	public static void startProcess() {
		kieUtil kieUtil = new kieUtil();
		KieServicesClient kClient = kieUtil.getkKieServicesClient();
		ProcessServicesClient processServicesClient = kClient.getServicesClient(ProcessServicesClient.class);
		// ProcessServicesClient.class provides methods related to process
		Map param = new HashMap<String, Object>();
		param.put("input", "deven");
		processServicesClient.startProcess("Custom_WIH_1.0.0-SNAPSHOT", "Custom_WIH.custom_WIH", param);
		// container id-- deplyment id
		// process id -- defination ID
	}
}
