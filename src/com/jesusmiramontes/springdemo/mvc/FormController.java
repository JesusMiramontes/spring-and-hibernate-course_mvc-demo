package com.jesusmiramontes.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	// controller to display form
	@RequestMapping("/show")
	public String show() {
		return "form";
	}
	
	// method to process data
	@RequestMapping("/processForm")
	public String processForm() {
		return "displayStudent";
	}
}
