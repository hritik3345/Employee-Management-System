package com.ty.EmpPortal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class Edit extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name = req.getParameter("name");
		String sal = req.getParameter("sal");
		String place = req.getParameter("place");

		String fqcn = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		String qry = "update empinfo.employee set name=?,esal=?,eplace=? where id=?";
		
		PrintWriter pw = resp.getWriter();
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName(fqcn);

		con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(qry);
			
	
			pstmt.setString(1, name);
			pstmt.setString(2, sal);
			pstmt.setString(3, place);
			pstmt.setInt(4, id1);
			pstmt.executeUpdate();
			
			
		
				pw.print("<h2>Details updated successfully!</h2>");
				RequestDispatcher rd=req.getRequestDispatcher("Output");
				rd.forward(req, resp);
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		}
}
}
