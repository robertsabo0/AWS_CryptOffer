package io.robii.cryptoads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HBController {
	@Autowired
	Environment environment;

	@GetMapping(value={"","adhi"})
	public String getAllUsers(){
		String randomServerPort =environment.getProperty("local.server.port"); 
		String map =  "<h1>["+randomServerPort+"] Hello from CryptAds </h1>";
		return map;
	}
		
}
