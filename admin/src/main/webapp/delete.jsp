<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script>

function alphabeticOnly(event) {
    
    var keyCode = event.keyCode || event.which;
   
    if ((keyCode >= 65 && keyCode <= 90) || (keyCode >= 97 && keyCode <= 122)) {
      return true; 
    }
   
    event.preventDefault();
    return false;
  }
</script>
</head>
<body>
<center>
<h2>insert the new student detail</h2>
<form action="delete" method="get">
   <table>
    <tr><td><input type="text" name="name" id="name" onkeypress="alphapeticOnly(event)"placeholder="Name"></td></tr>
     <tr><td><input type="submit"  ></td></tr>
     </table>


</form>

</center>


</body>
</html>