package fr.meritis.secondtrade.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	//private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/403", method=RequestMethod.GET)
	public String error403(ModelMap model) {
		return "403";
	}
}
