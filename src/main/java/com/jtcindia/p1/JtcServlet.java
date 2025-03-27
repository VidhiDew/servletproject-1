package com.jtcindia.p1;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JtcServlet  extends HttpServlet{
	String phone;
	String email;
	String state;
	String country;
	String pincode;
	
	public void init(ServletConfig sc) {
		System.out.println("TestServlet-init()");
		
		//1. Config parameter
		phone = sc.getInitParameter("Phone");
		email = sc.getInitParameter("Email");
		
		//2. Context parameter
		ServletContext ctx = sc.getServletContext();
		state = ctx.getInitParameter("State");
		country = ctx.getInitParameter("Country");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(("TestServlet-service()"));
		
		//3.Request Parameter
		String un = request.getParameter("uname");
		
		//4. Display Parameters
		PrintWriter out = response.getWriter();
		out.println("<h1>Username : "+un+"</h1>");
		out.println("<h1>Phone : "+phone+"</h1>");
		out.println("<h1>Email : "+email+"</h1>");
		out.println("<h1>state : "+state+"</h1>");
		out.println("<h1>Country : "+country+"</h1>");
		
	}
	
	public void destroy() {
		System.out.println("TestServlet-destroy()");
	}
}


