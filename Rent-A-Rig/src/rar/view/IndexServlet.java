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
		HttpSession session = request.getSession();
		
		
		User user = new User();
		user.setFirstName(firstName);
		
		session.setAttribute("user", user);
		
		
		Cookie unc = new Cookie("userNameCookie", firstName);
		unc.getValue();
		System.out.println(firstName);
		unc.setPath("/");
		
		
		response.addCookie(unc);
		response.sendRedirect("/index.jsp");
		/* request.getRequestDispatcher("/index.jsp").forward(request, response); */
	}

}
