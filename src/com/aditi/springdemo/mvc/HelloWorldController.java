package com.aditi.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller to read form data and add it to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from HTML Form
		String theName = request.getParameter("studentName");
		
		//Convert data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName , Model model) {
		
		
		//Convert data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey My Friend from v3! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
