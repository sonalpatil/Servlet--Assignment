package com.wissen.server;
/*
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Sonal Patil 
 * on 08-Jan-2010 1:23:32 PM
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
public class SignUpServlet extends HttpServlet {

    String            username = "root";

    String            password = "wissen";

    Connection        con      = null;

    ResultSet         rs       = null;

    PreparedStatement stmt     = null;

    String            url      = "jdbc:mysql://localhost:3306/Employee";

    PrintWriter       out      = null;

    /***
     * In this method all user information which is valid 
     * stored in database & user account is created.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("firstname");
        String lname = req.getParameter("lastname");
        String uname = req.getParameter("username");
        String email = req.getParameter("username") + "@gmail.com";
        String pwd = req.getParameter("password");
        String rpwd = req.getParameter("repassword");
        String question = req.getParameter("question");
        String answer = req.getParameter("answer");
        String secemail = req.getParameter("secemail");
        String location = req.getParameter("location");
        try {
            out = resp.getWriter();
            stmt = con
                    .prepareStatement("insert into Account(First_name,Last_name,User_name,Email_id,Password,Re_password,Question,Answer,Sec_email,Location) values (?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, fname);
            stmt.setString(2, lname);
            stmt.setString(3, uname);
            stmt.setString(4, email);
            stmt.setString(5, pwd);
            stmt.setString(6, rpwd);
            stmt.setString(7, question);
            stmt.setString(8, answer);
            stmt.setString(9, secemail);
            stmt.setString(10, location);
            int n = stmt.executeUpdate();
            if (n > 0) {
               
            	//call record inserted jsp page
				RequestDispatcher rd=req.getRequestDispatcher("/Insert.jsp");
				rd.forward(req, resp);
                System.out.println("Inserted sucessfully");
                System.out.println("Firstname : " + fname);
                System.out.println("Lastname : " + lname);
                System.out.println("Username : " + uname);
                System.out.println("EmailID: " + email);
                System.out.println("Password : " + pwd);
                System.out.println("Re-password : " + rpwd);
                System.out.println("Question : " + question);
                System.out.println("Answer : " + answer);
                System.out.println("Secondary email : " + secemail);
                System.out.println("Location : " + location);
            }
        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }
/*
 * In this method database connection is closed.
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
    
    /**
     * In init() method db connection is opened.
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
