<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
    function alphabeticOnly(event) {
     
      var keyCode = event.keyCode || event.which;
     
      if ((keyCode >= 65 && keyCode <= 90) || (keyCode >= 97 && keyCode <= 122)) {
        return true; 
      }
     
      event.preventDefault();
      return false;
    }
    function isNumeric(event) {
        const charCode = (event.which) ? event.which : event.keyCode;
        // Allow only numbers (0-9)
        if (charCode >= 48 && charCode <= 57) {
          return true;
        }
        // Prevent input if it's not a numeric character
        event.preventDefault();
        return false;
      }
  </script>
</head>
<body>
<center>
<h2>update the student data</h2>
<form action="update" method="get">
  <table>
    <tr><td>Name : <input type="text" name="name" id ="name" onkeypress="alphapeticOnly(event)"placeholder="Name"></td></tr>
    <tr><td>Mobile :<input type="text" name="mobile" id ="mobile"onkeypress="isNumeric(event)" ></td></tr>
     <tr><td>Gender :<input type="radio" id="male" name="gender" value="Male">
   			 <label for="male">Male</label><br>

		    <input type="radio" id="female" name="gender" value="Female">
		    <label for="female">Female</label><br></td></tr>
    <tr><td>Email : <input type="text" name="email" id ="email" placeholder="Email Address"></td></tr>
    <tr><td>Address :<textarea name="address" id="address"></textarea></td></tr>
    <tr><td>Dob :<input type="date" name="dob" id="dob"></td></tr>
    <tr><td>class:<input type="text" name="class" id="class"></td></tr>
    <tr><td>Father Name<input type="text" name="fatherName" onkeypress="alphapeticOnly(event)" id="fatherName"></td></tr>
     <tr><td>Mother Name: <input type="text" name="motherName" onkeypress="alphapeticOnly(event)" id="motherName"></td></tr>
     <tr><td><input type="submit"  ></td></tr>
     </table>


</form>

</center>
</body>
</html>