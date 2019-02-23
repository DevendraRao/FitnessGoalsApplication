<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fitness Challenge Application</title>
</head>
<body>
<form id="newgoalForm" action="createNewGoal" method="post">
<center>
<h2>Create your fitness goals</h2>
<h2>
<br>
<br>
<table>
<tr><label>UserName : </label><input type="text" id="name" name="name" required ></input></br></tr>
<tr><label>Fitness Goal : </label><input type="text" id="fitnessGoal" name="fitnessGoal" required></input></tr>
</table>
<button type="submit">Create</button>
</h2>
</center>
</form>
</body>
</html>