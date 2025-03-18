package com.headers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet12
 */
public class Servlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		File file=new File("D:/Mobile/rrr/baby.jpg");
		FileInputStream fin=new FileInputStream(file);
		BufferedInputStream bin=new BufferedInputStream(fin);
		byte all[]=new byte[(int)file.length()];
		bin.read(all);
		ServletOutputStream out=response.getOutputStream();
		out.write(all);
		out.flush();
		out.close();
	}
}
