package com.zk.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletDemo9 extends HttpServlet {

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
		//设置编码
		test1(request, response);
		//根据表单中的name值获取它的value值
		//String username=request.getParameter("username");
		//一般情况下获取复选框的时候，使用getParameterValues()方法
		String[] username=request.getParameterValues("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("sex");
		String city=request.getParameter("city");
		String[] hobby=request.getParameterValues("hobby");
		System.out.println(username+" "+password+" "+sex+" "+city);
		for(int count=0;hobby!=null&&count<hobby.length;count++)
		{
			System.out.println(hobby[count]+"\t");
		}
		for(int count=0;username!=null&&count<username.length;count++)
		{
			System.out.println(username[count]+"\t");
		}
	}

	private void test1(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		//获取表单数据值
		//获取表单中的所有的数据值
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String nextElement=(String) e.nextElement();
			//System.out.println(nextElement);
			String[] names=request.getParameterValues("username ");
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
