package fr.meritis.secondtrade.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;


@Component
public class AuthFailure extends SimpleUrlAuthenticationFailureHandler{

	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException arg2)
			throws IOException, ServletException {
		response.addHeader("name", "aaa");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		
	}

}
