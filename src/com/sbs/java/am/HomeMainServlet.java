package com.sbs.java.am;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home/main")
public class HomeMainServlet extends HttpServlet {

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			
			throws ServletException, IOException {
		//http://localhost:8080/AticleManager/home/main?lang=영어
		
	response.setContentType("text/html; char=UTF-8");
		request.setCharacterEncoding("UTF-8");
	
	
	String lang = request.getParameter("lang");
	response.getWriter().append("임렵된 언어:"+lang);
	//response.getWriter().append("<br>");
	if(lang.contentEquals("한국어")) {
		response.getWriter().append("안녕하세요");
		
	}
	else {
		response.getWriter().append("hello");
		
	}
	
	}

	

}
