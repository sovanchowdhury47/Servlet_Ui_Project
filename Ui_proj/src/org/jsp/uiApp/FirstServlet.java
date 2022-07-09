package org.jsp.uiApp;

import java.io.*;
import javax.servlet.*;

public class FirstServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		//Display Response On new Html File//
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='blue'>"
				+ "<h1>User is "+name+" from "+place+"</h1>"
						+ "</body><html>");//Presentation Logic
		out.close();
	}

}
