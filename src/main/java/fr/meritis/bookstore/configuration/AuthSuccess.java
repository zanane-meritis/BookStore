package fr.meritis.bookstore.configuration;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class AuthSuccess implements AuthenticationSuccessHandler{

	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println("{\"authenticated\":\"true\"}");
		out.flush();
		response.setStatus(HttpServletResponse.SC_OK);
    }

}
