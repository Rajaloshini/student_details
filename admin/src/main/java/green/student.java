package green;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String reg=request.getParameter("regno");
		String name=request.getParameter("name");
	 try {
		 PrintWriter pw=response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
		PreparedStatement ps=con.prepareStatement("select * from mass1.student;");
		 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
					if(rs.getString("regno").equals(reg)&&rs.getString("name").equals(name)){
						RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
						rd.include(request, response)		;
				pw.write("mobile="+'\n'+rs.getString("mobile"));
				pw.write("name:"+'\n'+rs.getString("name"));
				pw.write("class= "+'\n'+rs.getString("class"));
				pw.write("fatherName= "+'\n'+rs.getString("fatherName"));
				pw.write("motherName= "+'\n'+rs.getString("motherName"));
				pw.write(" email="+'\n'+rs.getString("email"));
				pw.write("address="+'\n'+rs.getString("address"));
				pw.write("dob="+'\n'+rs.getString("dob"));
				pw.write("gender="+'\n'+rs.getString("gender"));
					break;
					}
			 
				
				}}
					catch (Exception e) {
		            e.printStackTrace();
		}
	
	}

}
