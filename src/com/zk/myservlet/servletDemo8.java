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
		//�������������Ϣͷ��name
		//test2(request);
		//�����ͬname����Ϣͷ
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
		//��ȡ������Ϣͷ��Ϣ,��ȡHttp-requestͷ��,��ȡ�������Ϣ 
		String header=request.getHeader("User-Agent");
		System.out.println(header);
		
		if(header.toLowerCase().contains("msis")){
			System.out.println("��ʹ�õ���IE�����");
		}
		else if(header.toLowerCase().contains("firefox")){
			System.out.println("��ʹ�õ���firefox�����");
		}else if(header.toLowerCase().contains("chrome")){
			System.out.println("��ʹ�õ��ǹȸ������");
		}else if(header.toLowerCase().contains("qqbrowser")){
			System.out.println("��ʹ�õ���QQ�����");
		}else{
			System.out.println("��ʹ�õ������� �����");
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
