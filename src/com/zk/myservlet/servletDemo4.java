package com.zk.myservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servletDemo4 extends HttpServlet {

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
		//����1����ˢ��һ��
		response.setIntHeader("refresh", 1);
		Random r=new Random();
		//תΪ�ַ�����ʽ�������
		response.getWriter:����ַ���
		response.getWriter().write(r.nextInt()+" ");
		*/
		response.setContentType("text/html;charset=UTF-8");
		//����3������ת
		response.getWriter().write("ע��ɹ���3����������ҳ");
		response.setHeader("refresh", "3;url=/Servlet_007/demo2");
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
