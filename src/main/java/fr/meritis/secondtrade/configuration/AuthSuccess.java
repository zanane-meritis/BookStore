package fr.meritis.secondtrade.configuration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


@Component
public class AuthSuccess extends SimpleUrlAuthenticationSuccessHandler{

	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println("{\"authenticated\":\"true\"}");
		out.flush();
		System.out.println("authtentication for " + authentication.getName());
		response.setStatus(HttpServletResponse.SC_OK);
    }

}
