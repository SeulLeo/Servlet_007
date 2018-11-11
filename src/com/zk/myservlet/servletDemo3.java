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
		//ͨ��·���õ�һ��������
		String path=this.getServletContext().getRealPath("/WEB-INF/classes/��Ů.jpg");
		FileInputStream fis=new FileInputStream(path);
		//����һ�������
		ServletOutputStream sos=response.getOutputStream();
		
		
		String filename=path.substring(path.lastIndexOf("\\")+1);
		//�����ļ�������
		filename=URLEncoder.encode("iso-8859-1","UTF-8");//������ȫ�ļ�����Ϊutf-8����Ϊ��ȫ��
		//��֪�ͻ��������ļ�
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		//ִ���������
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
