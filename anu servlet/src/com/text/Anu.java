package com.text;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Anu")
public class Anu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Anu() {
     System.out.println("hai");
     
    }

	public void init(ServletConfig config) throws ServletException {
    System.out.println("hello");
	}

	public void destroy() {

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("good morning");
	}

}
