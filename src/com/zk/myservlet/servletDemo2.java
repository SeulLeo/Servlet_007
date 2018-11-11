package com.zk.myservlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

public class servletDemo2 extends HttpServlet {

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
		//��֪�ͻ��˲�����
		//response.setHeader("content-Type", "text/html;charset=UTF-8");
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		response.setIntHeader("expires", 0);
		//test1(response);
		ValidateCode vc=new ValidateCode(110,25,4,9);
		vc.write(response.getOutputStream());
		
	}

	private void test1(HttpServletResponse response) throws IOException {
		int width=100;
		int height=25;
		//���ڴ��д���һ��ͼ�����
		BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		//��������
		Graphics g=img.getGraphics();
		//�����������ɫ
		g.setColor(Color.pink);//����һ����ɫ�������ɫ
		//��ͼƬ��ӱ���ɫ
		g.fillRect(1, 1, width-2, height-2);
		
		//���߿�һ����ɫ
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);//���ñ߿����ʾ����
		
		//�����ı���ʽ
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.BOLD|Font.ITALIC,15));
		
		//��ͼƬ����ı�
		Random random=new Random();
		int positionx=20;
		for(int count=0;count<4;count++)
		{
			g.drawString(random.nextInt(10)+"", positionx, 20);//��ͼƬ����ı� 
			positionx+=20;
		}
		//��� 9��������
		for(int count=0;count<9;count++)
		{
			g.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
		}
		//��ͼƬ���������ķ�ʽ����ͻ���
		ImageIO.write(img, "jpg", response.getOutputStream());
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
