<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<body> 
	<jsp:useBean id="gcdBean" class="model1.mvc.model.GCDBean" /> 
	<jsp:setProperty name="gcdBean" property="*" /> 	
	
	<h3>By getProperty</h3>
	num1=<jsp:getProperty name="gcdBean" property="num1" /><br/>
	num2=<jsp:getProperty name="gcdBean" property="num2" /><br/>
	GCD=<jsp:getProperty name="gcdBean" property="GCD" /><br/>

	<h3>By request.getParameter</h3>
	num1=<%=request.getParameter("num1") %><br/>
	num2=<%=request.getParameter("num2") %><br/>
	
</body> 
</html> 