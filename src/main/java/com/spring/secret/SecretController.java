package com.spring.secret;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {
	
	
//	@Value(value = "${application.id}")
//	private String applicationId;
//
//	@Value(value = "${environment}")
//	private String environment;
//
//	@Value(value = "${categories.types:#{null}}")
//	private String[] categoryTypes;
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public Map<String, Object> getProperties(HttpServletRequest request) {
//
//		final Map<String, Object> map = new HashMap<>();
//		map.put("applicationId", applicationId);
//		map.put("environment", environment);
//		map.put("types", categoryTypes);
//		return map;
//	}
}
