package com.wissen.server;

/*
 * Copyrights 2009 Wissen Labs. All rights reserved. Author: Sonal Patil 
 * on 09-Jan-2010 11:55:48 AM
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
public class DeleteServlet extends HttpServlet {

    String            username = "root";

    String            password = "wissen";

    Connection        con      = null;

    String            url      = "jdbc:mysql://localhost:3306/Employee";

    PrintWriter       out      = null;

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
     * In this method  particular user account is deleted.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("username1");

        try {
            //TO get one record from db
            String query = "delete from Account where User_name='" + uname + "'";
            System.out.println(query);
            Statement stmt = con.createStatement();
            int j = stmt.executeUpdate(query);
            if (j>0) {
            	req.setAttribute("uname",uname);
            	RequestDispatcher rd=req.getRequestDispatcher("/DeleteInfo.jsp");
				rd.forward(req, resp);
            }
            else
            {
            	RequestDispatcher rd=req.getRequestDispatcher("/DeleteErr.jsp");
				rd.forward(req, resp);
            }
        } catch (Exception e) {
            System.out.println("Err : " + e);
        }
    }
}
