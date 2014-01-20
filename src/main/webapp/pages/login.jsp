<html>
<head><title>Customer Login Page</title></head>
<body onload='document.f.j_username.focus();'>
<h3>Custom Login page</h3>

<form name='login-form' action='/j_spring_security_check' method='POST'>
    <input type='text' placeholder="username" name='j_username' value=''>
    <input type='password' placeholder="password" name='j_password'/>
    <input name="login" type="submit" value="Log in"/>
</form>

</body>
</html>