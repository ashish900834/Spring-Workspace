<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
  
<h1>Student List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Age</th><th>Address</th></tr>  
 <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.name}</td>  
   <td>${emp.age}</td>  
   <td>${emp.address}</td>  
   
   </tr>  
   </c:forEach>  
   </table> 
   
   
   <h2><center><a href="/welcome" style="text-decoration:none; color:green">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  HOMEPAGE</a></center></h2></td> 
   <br/>  
  