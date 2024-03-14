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
@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");	
		//int Id=Integer.parseInt(id);
		Connection con=null;
		PreparedStatement pst=null;
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pst=con.prepareStatement("delete from empinfo.employee where id=?");
			pst.setString(1,id);
			pst.executeUpdate();
			PrintWriter pw=resp.getWriter();
			pw.print("<h1>Details deleted successfully</h1>");
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
