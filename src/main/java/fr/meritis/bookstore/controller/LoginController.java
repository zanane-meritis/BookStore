package fr.meritis.bookstore.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(ModelMap model) {
		//model.addAttribute("account", new Account());
		return "login";
	}
	
	@RequestMapping(value = "/loginFailed", method=RequestMethod.GET)
	public String loginFailed(ModelMap model) {
		System.out.println("login failed");
		model.addAttribute("error", true);
		return "login";
	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.GET)
	public String logout(ModelMap model) {
		return "/";
	}
	
	@RequestMapping(value = "/403", method=RequestMethod.GET)
	public String error403(ModelMap model) {
		return "403";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcomePageConnected(ModelMap model) {	
		model.addAttribute("name", "aaa");
		return "redirect:";
	}
}
