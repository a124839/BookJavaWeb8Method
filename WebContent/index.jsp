<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:a action="login"> execute() method</s:a>
	<s:a action="login!method1"> method1() method</s:a>
	<s:a action="login!method2"> method2() method</s:a>
	<s:a action="login!method3"> method3() method</s:a>
	
</body>
</html>