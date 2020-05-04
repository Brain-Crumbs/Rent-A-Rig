package rar.view;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import rar.business.Cart;
import rar.business.LineItem;

public class CartServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
    	System.out.println("CART SERVLET HIT");
    	
		HttpSession session = request.getSession();
		
		String action = request.getParameter("action");
		Cart cart = (Cart) session.getAttribute("cart");
		
		//default action
		if (action == null) {
			action = "viewCart";
		}

		// Click on Add to Cart button
		if (action.equals("addToCart")) {
			String prodName = (String) request.getParameter("prodName");
			System.out.println(prodName);
			String category = (String) request.getParameter("category");
			System.out.println(category);
			int quantity = Integer.parseInt( (String) request.getParameter("quantity"));
			double price = Double.parseDouble( (String) request.getParameter("price"));
			System.out.println(quantity);
			System.out.println(price);
			LineItem lineItem = new LineItem(prodName, category, quantity, price);
			
			// if cart is empty make new cart otherwise just add to cart
			if (cart != null) {
				cart.addItem(lineItem);
			}
			else {
				cart = new Cart();
				cart.addItem(lineItem);
			}
			session.setAttribute("cart", cart);
			String url = "/cart.jsp";
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher(url).forward(request, response);
		}
		
		// click on Update Cart button
		else if (action.equals("updateCart")) {

			
		}
		
		// Visit the Cart page
		else if (action.equals("viewCart")) {
			System.out.println("VIEW CART HIT");
			ServletContext sc = getServletContext();
			String url = "/cart.jsp";
			if (cart == null) {
				url = "/emptyCart.jsp";
			}
			sc.getRequestDispatcher(url).forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}