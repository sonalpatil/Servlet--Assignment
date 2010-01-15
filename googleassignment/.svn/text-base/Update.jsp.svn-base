<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>User Details
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>
</head>
<body>
<form id=commentForm method=GET action=http://localhost:8090/Account/update>
<table><tr><td>\nFirst Name :: </td>
<td><input type=text name=firstname id=firstname class=required size=30 value=<%=request.getAttribute("fname")%>></td></tr>
<tr><td>\nLast Name :: </td>
<td><input type=text name=lastname id=lastname class=required size=30 value=<%=request.getAttribute("lname")%>></td></tr>
<tr><td>\nEmail ID :: </td>		
<td><input type=text name=email id=email class=required size=30 value=<%=request.getAttribute("email")%>></td></tr>
<tr><td>\nUser Name :: </td>	
<td><input type=text name=username id=username class=required size=30 value=<%=request.getAttribute("username")%>></td></tr>
<tr><td>\nPassword :: </td>
<td><input type=text name=password id=password class=required size=30 value=<%=request.getAttribute("password")%>></td></tr>
<tr><td>\nConfirm Password ::</td>	
<td><input type=text name=repassword id=repassword class=required size=30 value=<%=request.getAttribute("repassword")%>></td></tr>	
<tr><td>\nSecurity Question ::</td>
<td><input type=text name=question id=question class=required size=30 value=<%=request.getAttribute("question")%>></td></tr>
<tr><td>\nAnswer ::</td>	
<td><input type=text name=answer id=answer class=required size=30 value=<%=request.getAttribute("answer")%>></td></tr>
<tr><td>\nAlternate Email Address ::</td>		
<td><input type=text name=secemail id=secemail class=required size=30 value=<%=request.getAttribute("secemail")%>></td></tr>
<tr><td>\nLocation ::</td>		
<td><input type=text name=location id=location class=required size=30 value=<%=request.getAttribute("location")%>></td></tr>
<br><br><div align=center><input type=submit name=button value=Edit id=submit></div></table></form>																																																								
<form id=Form method=GET action=http://localhost:8090/Account/delete>
<table><tr><td><input type=hidden name=username1 id=username1 class=required size=30 value=<%=request.getAttribute("username")%>>
<br><br><input type=submit name=button value=Delete id=submit></td></tr></table></form>								
</body>
</html>

				
					