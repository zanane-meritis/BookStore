package fr.meritis.secondtrade.configuration;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

public class AuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint{
	


	public AuthenticationEntryPoint(String loginFormUrl) {
		super(loginFormUrl);
		// TODO Auto-generated constructor stub
	}

}