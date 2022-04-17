package com.ty.servlet.firstServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Home extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    PrintWriter writer = res.getWriter();
	    String name = req.getParameter("username");
	    writer.println("<h1>Welcome "+ name+ "</h1>");
		
	}

	
}
