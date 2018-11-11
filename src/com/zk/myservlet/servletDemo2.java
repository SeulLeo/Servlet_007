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
		//告知客户端不缓存
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
		//在内存中创建一个图像对象
		BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		//创建画笔
		Graphics g=img.getGraphics();
		//给画笔添加颜色
		g.setColor(Color.pink);//设置一个颜色，填充颜色
		//给图片添加背景色
		g.fillRect(1, 1, width-2, height-2);
		
		//给边框一个颜色
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);//设置边框的显示坐标
		
		//设置文本样式
		g.setColor(Color.BLACK);
		g.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,15));
		
		//给图片添加文本
		Random random=new Random();
		int positionx=20;
		for(int count=0;count<4;count++)
		{
			g.drawString(random.nextInt(10)+"", positionx, 20);//给图片填充文本 
			positionx+=20;
		}
		//添加 9条干扰线
		for(int count=0;count<9;count++)
		{
			g.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
		}
		//将图片对象以流的方式输出客户端
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
