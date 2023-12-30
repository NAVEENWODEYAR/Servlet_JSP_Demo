package com.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class LoginForm extends HttpServlet{

	/**
	 * @author Naveen Wodeyar
	 * @Date 30-12-2023
	 */
	private static final long serialVersionUID = 1L;

	// supports both get & post,
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		String mail = req.getParameter("mail");
//		String password = req.getParameter("password");
//		
//		PrintWriter pw = resp.getWriter();
//					pw.write("\nName "+name);
//					pw.write("\nE-Mail "+mail);
//					pw.write("\nPassword "+password);
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String password = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
					pw.write("\nName "+name);
					pw.write("\nE-Mail "+mail);
					pw.write("\nPassword "+password);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);

		String name = req.getParameter("name");
		String password = req.getParameter("password");
			
		if(name.equalsIgnoreCase("Test") || password.equalsIgnoreCase("tesT"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
		}
	}
}
