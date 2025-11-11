package poly.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bai3")
public class bai3controller extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String url = req.getRequestURL().toString();
    String uri = req.getRequestURI();
    String query = req.getQueryString();
    String servletPath = req.getServletPath();
    String contextPath = req.getContextPath();
    String pathInfo = req.getPathInfo();
    String method = req.getMethod();
    
    // Xuất thông tin ra trình duyệt
 // Xuất thông tin ra trình duyệt
    resp.getWriter().println("<html><body>");
    resp.getWriter().println("<h2>Thông tin URL hien tai:</h2>");
    resp.getWriter().println("<ul>");
    resp.getWriter().println("<li><b>URL:</b> " + req.getRequestURL() + "</li>");
    resp.getWriter().println("<li><b>URI:</b> " + req.getRequestURI() + "</li>");
    resp.getWriter().println("<li><b>Query String:</b> " + req.getQueryString() + "</li>");
    resp.getWriter().println("<li><b>Servlet Path:</b> " + req.getServletPath() + "</li>");
    resp.getWriter().println("<li><b>Context Path:</b> " + req.getContextPath() + "</li>");
    resp.getWriter().println("<li><b>Path Info:</b> " + req.getPathInfo() + "</li>");
    resp.getWriter().println("<li><b>Method:</b> " + req.getMethod() + "</li>");
    resp.getWriter().println("</ul>");
    resp.getWriter().println("</body></html>");
}
}

