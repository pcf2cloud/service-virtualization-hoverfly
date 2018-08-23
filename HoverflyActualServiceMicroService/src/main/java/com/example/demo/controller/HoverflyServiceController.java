package com.example.demo.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.HoverflyServiceResponse;

@RestController
public class HoverflyServiceController {
	
	@RequestMapping(value = "/service/hoverfly")
	public HoverflyServiceResponse getSampleResponse() {
		System.out.println("Inside HoverflyActualServiceMicroServiceApplication::getSampleResponse()");
		return new HoverflyServiceResponse("returned value from HoverflyActualServiceMicroServiceApplication",
				new Date().toString(), UUID.randomUUID().toString());
	}
}
