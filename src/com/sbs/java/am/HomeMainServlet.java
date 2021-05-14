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
		// �Էµ� �������� ���ڼ��� UTF-8�̴�.
		request.setCharacterEncoding("UTF-8");
		// ��µ� ������ html(UTF-8)
		response.setContentType("text/html; charset=UTF-8");

		String lang = request.getParameter("lang");

		if (lang == null) {
			lang = "����";
		}

		response.getWriter().append("�Էµ� ��� : " + lang);
		response.getWriter().append("<br>");

		if (lang.equals("�ѱ���")) {
			response.getWriter().append("�ȳ��ϼ���");
		} else if (lang.equals("�Ϻ���")) {
			response.getWriter().append("����˪���");
		} else {
			response.getWriter().append("Hello");
		}

	}

}
