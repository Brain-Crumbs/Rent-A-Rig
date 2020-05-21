package rar.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import rar.business.User;

@WebServlet("/form")
public class IndexServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "registration.jsp";
		System.out.println("111111111");

		String action = request.getParameter("action");
		if (action.equals("add")) {
			// get parameters from the request
			registerUser(request, response);
			System.out.println("3333333333");
		}
	}

	private void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		
		session.setAttribute("user", user);
		
		
		Cookie firstNameCookie = new Cookie("firstNameCookie", firstName);
		firstNameCookie.getValue();
		System.out.println(firstName);
		firstNameCookie.setPath("/");
		
		Cookie lastNameCookie = new Cookie("lastNameCookie", lastName);
		lastNameCookie.getValue();
		System.out.println(lastName);
		lastNameCookie.setPath("/");
		
		Cookie emailCookie = new Cookie("emailCookie", email);
		emailCookie.getValue();
		System.out.println(email);
		emailCookie.setPath("/");
		
		response.addCookie(firstNameCookie);
		response.addCookie(lastNameCookie);
		response.addCookie(emailCookie);
		response.sendRedirect("index.jsp");
		
		//branch 'userLogin' of https://github.com/Brain-Crumbs/Rent-A-Rig.git
	}
	private void deleteCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			cookie.setMaxAge(0); //delete the cookie
			cookie.setPath("/");
			response.addCookie(cookie);
		}
	}
}
