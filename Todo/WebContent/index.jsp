<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %> 
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Keep in Mind</title>
</head>
<body>

	<form action="AddItem" method="POST">
		Add a new Item :  <input type="text" placeholder="enter text" name="item">
		<button type="submit">Add</button>	
	</form>
	
	<% 
	
		ArrayList<Item> list = (ArrayList<Item>) request.getAttribute("items");
	
	
		if(list == null){
			  response.sendRedirect("GetItems");
		}else{
			out.println("<ol>");
			
			
			for(Item i : list){
				out.println("<li>");
			
					out.print(i.getItemName());
					
			 		out.print(String.format("<a href='DeleteItem?index=%d'> Delete</a>", i.getItemId() ));
				 		
		 		out.println("</li>");
			}
			out.println("</ol>");
		}
		
		
	
	%>
	


</body>
</html>