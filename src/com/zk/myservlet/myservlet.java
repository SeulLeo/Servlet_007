package com.zk.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		//服务器中默认的编码为ISO-8859-1，不支持中文，告知服务器应该使用的编码utf-8
		response.setCharacterEncoding("UTF-8");
		//告诉客户端要使用什么编码 
		//response.setHeader("Content-type", "UTF-8");
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		*/
		//
		response.setContentType("text/html;charset=UTF-8");
		
		//得到一个字符输出流
		PrintWriter pw=response.getWriter();
		pw.write("你好");
		//pw.write("<html><head><meta charset='utf-8'></head><body>你好</bode></html>");
		//pw.write("你好");//向客户端相应文本内容 
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
