package poly.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/bai4","/crud/them","/crud/sua","/crud/xoa"})
public class bai4controller extends HttpServlet 
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String uri = req.getRequestURI();
	if (uri.contains("/crud/them"))
		resp.getWriter().println("<h1>Creating a new record...</h1>");
	else if (uri.endsWith("/crud/sua"))
	    resp.getWriter().println("<h1>Updating an existing record....</h1>");
	else if (uri.endsWith("/crud/xoa"))
	    resp.getWriter().println("<h1>Deleting a record...</h1>");
	else
		resp.getWriter().println("<h1> not know</h1>");
	    
	
}
}
