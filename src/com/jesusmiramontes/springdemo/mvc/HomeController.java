package com.jesusmiramontes.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; // Return the page name than will look for. This includes the prefix and the sufix previously defined.
		// Resulting in /WEB-INF/view/main-menu.jsp
	}
	
}
