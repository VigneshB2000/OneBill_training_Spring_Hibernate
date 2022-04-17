package com.ty.servlet.firstServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class Login extends GenericServlet {
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		PrintWriter out = res.getWriter();
//		out.println("<h1>Login Page</h1>");
//		out.println("<form action = './home'>" + "<input type = text name = 'username' placeholder = 'username'><br>"
//				+ "<input type = password name = 'password'><br>" + "<input type = submit value = 'Submit'>"
//				+ "</form>");
//
//	}
//
//}


public class Login extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1>Login Page</h1>");
		out.println("<form action = './home' method = 'post'>" + "<input type = text name = 'username' placeholder = 'username'><br>"
				+ "<input type = password name = 'password'><br>" + "<input type = submit value = 'Submit'>"
				+ "</form>");

	}

}