package com.zk.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletDemo8 extends HttpServlet {

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
		//test1(request);
		//获得所有请求消息头的name
		//test2(request);
		//获得相同name的消息头
		test3(request);
	}

	private void test3(HttpServletRequest request) {
		Enumeration names=request.getHeaders("accept-language");
		while(names.hasMoreElements()){
			String e=(String)names.nextElement();
			System.out.println(e+":"+request.getHeader(e));
		}
	}

	private void test2(HttpServletRequest request) {
		Enumeration names=request.getHeaderNames();
		while(names.hasMoreElements()){
			String e=(String) names.nextElement();
			System.out.println(e);
			System.out.println(e+":"+request.getHeader(e));
		}
	}

	private void test1(HttpServletRequest request) {
		//获取请求消息头信息,获取Http-request头部,获取浏览器信息 
		String header=request.getHeader("User-Agent");
		System.out.println(header);
		
		if(header.toLowerCase().contains("msis")){
			System.out.println("您使用的是IE浏览器");
		}
		else if(header.toLowerCase().contains("firefox")){
			System.out.println("您使用的是firefox浏览器");
		}else if(header.toLowerCase().contains("chrome")){
			System.out.println("您使用的是谷歌浏览器");
		}else if(header.toLowerCase().contains("qqbrowser")){
			System.out.println("您使用的是QQ浏览器");
		}else{
			System.out.println("您使用的是其他 浏览器");
		}
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
