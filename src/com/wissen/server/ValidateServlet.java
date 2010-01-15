package com.wissen.server;
/*
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Sonal Patil 
 * on 08-Jan-2010 2:16:21 PM
 *
 */

/**
 * @author Sonal Patil
 * 08-Jan-2010
 */
import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ValidateServlet extends HttpServlet {

	String username = "root";

	String password = "wissen";

	Connection con = null;

	ResultSet rs = null;

	Statement stmt = null;

	String url = "jdbc:mysql://localhost:3306/Employee";

	/**
	 * In this method we get information of particular user 
	 * which is exist in db. If user exists then his/her
	 * account is open.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("password");
		System.out.println(uname + "::" + pwd);
		try {
			String query = "select * from Account where User_name='" + uname
					+ "' and Password= '" + pwd + "'";
			System.out.println(query);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) 
			{
				//get values from db
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String email = rs.getString(3);
				String username = rs.getString(4);
				String password = rs.getString(5);
				String repassword = rs.getString(6);
				String question = rs.getString(7);
				String answer = rs.getString(8);
				String secemail = rs.getString(9);
				String location = rs.getString(10);
			
				//to send request to jsp
				req.setAttribute("fname",fname);
				req.setAttribute("lname",lname);
				req.setAttribute("email",email);
				req.setAttribute("username",username);
				req.setAttribute("password",password);
				req.setAttribute("repassword",repassword);
				req.setAttribute("question",question);
				req.setAttribute("answer",answer);
				req.setAttribute("secemail",secemail);
				req.setAttribute("location",location);
				System.out.println(fname + "::" + lname + "::" + email + "::"
						+ username + "::" + password);
				
				//call user details jsp page
				RequestDispatcher rd=req.getRequestDispatcher("/Update.jsp");
				rd.forward(req, resp);
				
			} 
			else {
				RequestDispatcher rd=req.getRequestDispatcher("/Notuser.jsp");
				rd.forward(req, resp);
			}
		} catch (Exception e) {
			System.out.println("SQL Error " + e);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.GenericServlet#destroy()
	 * In this method db connection is closed.
	 */
	@Override
	public void destroy() {
		try {
			con.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println("Err : " + e);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init()
	 * In this method db connection is opened.
	 */
	@Override
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
}
