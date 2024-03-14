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

@WebServlet("/insert")
public class insert extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fqcn="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		String inQry="insert into empinfo.employee values(?,?,?,?)";
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String Sal=req.getParameter("sal");
		String place=req.getParameter("place");
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName(fqcn);
			con=DriverManager.getConnection(url);
			 pst=con.prepareStatement(inQry);
			pst.setInt(1, id1);
			pst.setString(2, name);
			pst.setString(3, Sal);
			pst.setString(4,place);
			pst.executeUpdate();
				
			
				
				RequestDispatcher rd=req.getRequestDispatcher("Output");
				rd.forward(req, resp);
			
		
			
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
				pst.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
}
