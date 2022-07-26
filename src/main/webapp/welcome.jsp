<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello..</h2>
<p>Your EmployeeID: </p>
<s:property value = "employee_id"/>
<br>
<p>Your Name:</p>
<s:property value="name"/>
<br>
<p>Your Salary:</p>
<s:property value = "sal"/>
</body>
</html>