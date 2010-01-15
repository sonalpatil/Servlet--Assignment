package com.wissen.server;
/*
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Sonal Patil 
 * on 09-Jan-2010 11:53:21 AM
 *
 */

/**
 * @author Sonal Patil
 * 09-Jan-2010
 */

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet {
	String username = "root";
	String password = "wissen";
	Connection con = null;
	PreparedStatement stmt = null;
	String url = "jdbc:mysql://localhost:3306/Employee";
	PrintWriter out = null;

	public void init() throws ServletException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				System.out.println("Connection Established");
			}
		} catch (Exception e) {
			System.out.println("Err" + e);
		}
	}

	/**
	 * In this method all user information is updated.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");
		String lname = req.getParameter("lastname");
		String fname = req.getParameter("firstname");
		String email = req.getParameter("email");
		String rpwd = req.getParameter("repassword");
		String location = req.getParameter("location");
		String question = req.getParameter("question");
		String answer = req.getParameter("answer");
		String secemail = req.getParameter("secemail");

		try {
			// TO update one record from db
			String query = "update Account set First_name='" + fname
					+ "',Last_name='" + lname + "',Password='" + pwd
					+ "',Re_password='" + rpwd + "',Sec_email='" + secemail
					+ "',Location='" + location + "',Answer='" + answer
					+ "',Question='" + question + "',Email_id='" + email
					+ "' where User_name='" + uname + "'";
			stmt = con.prepareStatement(query);
			System.out.println(query);
			int j = stmt.executeUpdate();
			if (j > 0) {
				req.setAttribute("uname", uname);
				RequestDispatcher rd = req
						.getRequestDispatcher("/UpdateMsg.jsp");
				rd.forward(req, resp);

			} else {
				RequestDispatcher rd = req
						.getRequestDispatcher("/UpdateErrMsg.jsp");
				rd.forward(req, resp);

			}

		} catch (Exception e) {
			System.out.println("Err : " + e);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try {
			con.close();

			stmt.close();
		} catch (Exception e) {
			System.out.println("Err : " + e);
		}
	}

}
