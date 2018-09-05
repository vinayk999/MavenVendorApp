package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public ModelAndView showHomePage(){
		
		
		ModelAndView m=new ModelAndView();
		Employee e1=new Employee();
		e1.setEmpId(100);
		e1.setEmpName("Vinay");
		e1.setEmpSal(45000);
		Employee e2=new Employee();
		e2.setEmpId(101);
		e2.setEmpName("ajay");
		e2.setEmpSal(45000);
		Employee e3=new Employee();
		e3.setEmpId(100);
		e3.setEmpName("Vinay");
		e3.setEmpSal(45000);
		
		List<Employee> l=Arrays.asList(e1,e2,e3);
		m.setViewName("Home");
		m.addObject("data",l);
		m.addObject("emp1",e3);
		return m;
	}
	
	/*@RequestMapping("/show")
	public String showPage(){
		return "Home";
	}*/
	@RequestMapping("/reg")
	public String showPage(){
		return "Register";
	}
}
