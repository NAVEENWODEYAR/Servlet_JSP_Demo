package com.servlet.forms;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/logOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	  *@author Naveen Wodeyar
	  *@Date 30-12-2023
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
			// to delete session,
			session.invalidate();			
					
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
							rd.forward(request, response);
	}

}
