package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller to show processform data
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//controller to add data into model
	
	@RequestMapping("/processFromVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from html form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	@RequestMapping("/processFromVersionThree")
	public String letsShoutAgain(@RequestParam("studentName") String theName, Model model) {
		
		//read the request parameter from html form
		//String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hei! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
}
