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

public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String regno=request.getParameter("name");
		try {
			 PrintWriter pw=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
			PreparedStatement ps=con.prepareStatement("select * from mass1.student;");
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				    pw.write("name="+rs.getString("name"));
					pw.write("gender="+rs.getString("gender"));
					pw.write("fatherName= "+rs.getString("fatherName"));
					pw.write("motherName= "+rs.getString("motherName"));
					pw.write("email= "+rs.getString("email"));
					pw.write("address="+rs.getString("address"));
					pw.write("class="+rs.getString("class"));
					pw.write("mobile="+rs.getString("mobile"));
					pw.write("dob="+rs.getString("dob")+'\n');
					pw.write('\n');
									}
										
			 
				
				PreparedStatement pr=con.prepareStatement("delete  from mass1.student where name=?;");
			
				 
				  pr.setString(1,regno);
				     if(true) {
				 		    pr.executeUpdate();
				 		    response.setContentType("text/html");
				 		  pw.write("Successful Deleted");
				 		  RequestDispatcher rq=request.getRequestDispatcher("delete.jsp");
						    rq.include(request, response);
						      
				 		     }
						}
									catch (Exception e) {
						            e.printStackTrace();
						}
		
	 try {
		
							
					}
								catch (Exception e) {
					            e.printStackTrace();
					}
		 }
	}
