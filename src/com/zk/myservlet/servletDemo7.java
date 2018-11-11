package com.zk.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletDemo7 extends HttpServlet {

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
		//getMethod()获取请求方式
		//***getRequestURL();返回客户端发出请求时的完整URL
		//***getRequestURI();返回请求行中的资源名部分
		//***getContextPath();当前请求的虚拟目录/Servlet_007
		//getQueryString();返回请求行中的参数部分
		System.out.println(request.getMethod());    //GET
		System.out.println(response.getClass().getName());//org.apache.catalina.connector.ResponseFacade
		System.out.println(request.getClass().getName());//org.apache.catalina.connector.RequestFacade
		System.out.println(request.getRequestURI());//  /Servlet_007/demo7
		System.out.println(request.getRequestURL());//http://ms-20170731tkkc:8080/Servlet_007/demo7
		System.out.println(request.getContextPath());// /Servlet_007
		System.out.println(request.getQueryString());//http://ms-20170731tkkc:8080/Servlet_007/demo7?username=Tom,输出Tom
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
