<!DOCTYPE html>
<html>
<body>
<div align="center">
<h1>JLC BookStore</h1>
<h2>Login Form</h2>
<font color="red" size="4">${RegMsg}</font>
<font color="red" size="4">${LoginMsg}</font>
<font color="red" size="4">${LogoutMsg}</font>
<form action="login.jlc" method="post">
<table>
<tr>
<td>Username</td>
<td><input type="text" name="username" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td colspan="1" align="center">
<td><input type="submit" value="Login Now" /></td>
</tr>
</table>
</form>
<h2>
<a href="register.jsp"> New User Signup </a> ||
<a href="forgotpw.jsp"> Forgot My Password </a>
</h2>
</div>
</body>
</html>