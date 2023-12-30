package com.servlet.forms;

import java.io.IOException;
import java.io.PrintWriter;

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

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String password = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
					pw.write("Name "+name);
					pw.write("E-Mail "+mail);
					pw.write("Password "+password);
	}
}
