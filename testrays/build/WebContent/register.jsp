<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.Shiv{
     width:50%;
     border:1px solid black;
     margin:auto;
     padding:30px;
     background-color:grey; 
}
</style>
</head>

<body>
<div class="Shiv">
<form method="GET" action="registrationView.jsp">
<table align="center">
 
   <tr>
   <td>First Name:</td>
  <td> <input type="text" name="fname" size="15">  </td>
   </tr>
   <tr>
    <td>Last Name:</td>
    <td> <input type="text" name="lname" size="15">   </td>
   </tr>
   <tr>
    <td>Date of Birth:</td>
    <td> <input type="date" name="dob">   </td>
   </tr>
      <td>Gender:</td>
    <td> <input type="radio" name="gender" value="male">Male <input type="radio" name="gender" value="female">Female </td>
   </tr>
   
   <tr>
    <td>login:</td>
    <td> <input type="text" name="login">   </td>
   </tr>
   <tr>
    <td>Password:</td>
    <td> <input type="password" name="pwd" >   </td>
   </tr>
   
   <td> <input type="submit" name="submit" value="Register" >   </td>
   <td> <input type="reset" name="cancel" value="Reset" >   </td>
   
   


</table>
</form>
</div>
</body>
</html>