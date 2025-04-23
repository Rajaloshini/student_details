package green;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	  		 String name=request.getParameter("name");
	  		 String mobile=request.getParameter("mobile");
	  		 String gender=request.getParameter("gender");
	  		 String email =request.getParameter("email");
	  		 String address =request.getParameter("address");
	  		 String classSection=request.getParameter("class");
	  		String dob=request.getParameter("dob");
	  		String fatherName=request.getParameter("fatherName");
	  		String motherName=request.getParameter("motherName");
	  		  try {
	  			 PrintWriter pw=response.getWriter();
	  			Class.forName("com.mysql.cj.jdbc.Driver");
	  			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
				PreparedStatement ps=con.prepareStatement("insert into mass1.student values(?,?,?,?,?,?,?,?,?) ");
	  		    ps.setString(1,name);
	  		    ps.setString(2,mobile);
	  		    ps.setString(3,gender);
	  		    ps.setString(4,email);
	  		    ps.setString(5,address);
	  		    ps.setString(6,classSection);
	  		    ps.setString(7, dob);
	  		  ps.setString(8, fatherName);
	  		 ps.setString(9, motherName);
	  		
	  		     if(true) {
	  		    ps.executeUpdate();
	  		    response.setContentType("text/html");
	  		  pw.write("Successful inserted");
	  		  RequestDispatcher rq=request.getRequestDispatcher("insert.jsp");
	 		    rq.include(request, response);
	 		      
	  		     }
	 		    
	  		       
	  		     
	  		    
	  		    
	  		  } catch (Exception e) {
	  			
	  			e.printStackTrace();
	  		}
	  		
	}

}
