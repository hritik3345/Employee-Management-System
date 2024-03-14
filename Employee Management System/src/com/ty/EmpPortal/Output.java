package com.ty.EmpPortal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Output")
public class Output extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String fqcn = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
		String qry = "select * from empinfo.employee";
		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		PrintWriter pw = resp.getWriter();

		resp.setContentType("text/html");
		pw.println("<html><body style='display: flex;align-items: center;justify-content: center; height:60vh;flex-direction:column'>");

		
		try {
			Class.forName(fqcn);
			con= DriverManager.getConnection(url);
			pstmt = con.prepareStatement(qry);

			rs = pstmt.executeQuery();
			
			pw.print("<h1 style=text-align:center >Employee Table</h1>");
			pw.println("<table border=1 width=50% height=50% cellspacing=0 cellpadding=10  >");
			pw.println(
					"<tr style=background-color:burlywood><th>ID</th><th>EName</th><th>ESal</th><th>EPlace</th><th colspan=2>Actions</th></tr>");
			 
			while(rs.next()) {
				
				String id1 = rs.getString(1);
				String name = rs.getString(2);
				String esal = rs.getString(3);
				String place = rs.getString(4);

				pw.println("<tr><td>" + id1 + "</td><td>" + name + "</td><td>" + esal + "</td><td>" + place + "</td><td>"
						+ "<button style=background-color:green ><a href=edit.jsp style=color:white;text-decoration:none>Edit details</a></button>" + "</td><td>" + "<button style=background-color:red>"
								+ "<a href=Delete.jsp style=color:white;text-decoration:none   >Delete details</a></button>"
					 + "</td></tr>");

			}
			
		
			
			pw.println("</table>");
			pw.println("</html></body>");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
		
}
