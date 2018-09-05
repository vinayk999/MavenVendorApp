package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@RequestMapping("/custReg")
	public String showCustomerReg(){
		return "CustomerReg";
	}
}
