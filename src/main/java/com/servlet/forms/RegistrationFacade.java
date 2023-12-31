package com.servlet.forms;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RegistrationFacade extends HttpServlet{

	/**
	 * @author Naveen Wodeyar
	 * @Date 31-12-2023
	 */
	private static final long serialVersionUID = 4198713911431714549L;
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		
		HttpSession  session = arg0.getSession();
						session.invalidate();
		RequestDispatcher rd = arg0.getRequestDispatcher("");
							rd.forward(arg0, arg1);
	}
}
