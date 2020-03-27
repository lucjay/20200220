package co.lucjay.second;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/binoo")
public class binoo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public binoo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.getCharacterEncoding();
		Writer out = response.getWriter();
		out.write("<head><meta charset='utf-8'></head>");
		out.write("<h1> TABLE </h1>");
		out.write("<h1> 테이블 만들어 </h1>");
		out.write("<table border=1><tr><th colspan=2>회원정보</th></tr>");
		out.write("<tr><td>성명</td><td>홍길동</td></tr>");
		out.write("<tr><td>아이디</td><td>Hong1234</td></tr>");
		out.write("<tr><td>패스워드</td><td>hong1234</td></tr></table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
