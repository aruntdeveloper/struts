<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Fill Your Details</h1>
    <form action="employee">
    <label>Enter Your Employee ID</label>
    <input name="employee_id" type="text">
    <br>
    <label>Enter Your Name</label>
    <input name="name" type="text">
    <br>
    <label>Enter Your Role</label>
    <select name="role">
        <option value="Front_end_developer">Front End Developer</option>
        <option value="Back_end_developer">Back End Developer</option>
        <option value="Full_stack_developer">Full Stack Developer</option>
        <option value="Testing">Testing</option>
    </select>
    <br>
    <input type="submit">
    </form>
</body>
</html>
