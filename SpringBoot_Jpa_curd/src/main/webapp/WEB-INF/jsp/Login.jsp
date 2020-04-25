<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Add Student</title>
</head>
<h1>
	<pre>                                  Add New Student </pre>
</h1>
<body>
	<div style="margin-left: 300px">
		<form action="/welcome/add" method="Post">
			<table>
				<tr>
					<td><br />Name: <span style="padding-left: 25px"> <input
							type="text" name="name" /></span></td>

				</tr>
				<tr>
					<td><br />Age: <span style="padding-left: 36px"><input
							type="text" name="age" /></span></td>

				</tr>
				<tr>
					<td><br />Address : <span style="padding-left: 6px"><input
							type="text" name="address" /></span></td>
				</tr>

				<tr>
					<td></td>

					<td><br />
					<input type="submit" value="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>