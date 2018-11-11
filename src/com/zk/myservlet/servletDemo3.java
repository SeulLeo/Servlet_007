package com.zk.myservlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletDemo3 extends HttpServlet {

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
		//通过路径得到一个输入流
		String path=this.getServletContext().getRealPath("/WEB-INF/classes/美女.jpg");
		FileInputStream fis=new FileInputStream(path);
		//创建一个输出流
		ServletOutputStream sos=response.getOutputStream();
		
		
		String filename=path.substring(path.lastIndexOf("\\")+1);
		//设置文件名编码
		filename=URLEncoder.encode("iso-8859-1","UTF-8");//讲不安全文件名改为utf-8，变为安全的
		//告知客户端下载文件
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		//执行输出操作
		int len=1;
		byte[] b=new byte[1024];
		while((len=fis.read(b))!=-1)
		{
			sos.write(b,0,len);
		}
		sos.close();
		fis.close();
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
