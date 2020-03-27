package co.lucjay.second;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Third() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.getCharacterEncoding();
		Writer out = response.getWriter();
		out.write("<head><meta charset='utf-8'></head>");
		out.write("<h1> DO TEST222 </h1>");
		out.write("<h1> 두번째두번째테스트 </h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
