package com.practice;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class CustomWIH implements WorkItemHandler {

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		String name = (String) workItem.getParameter("input");
		String output = name + " received successfully!!";
		Map<String, Object> wihParam = new HashMap<String, Object>();
		wihParam.put("output", output);
		manager.completeWorkItem(workItem.getId(), wihParam);
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
	}

}
