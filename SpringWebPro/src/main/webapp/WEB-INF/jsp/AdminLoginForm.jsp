<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login </title>
<meta name="description" content="Baby tips, products, food,baby names">
	<meta name="keywords" content="babycare,baby food,baby tips,baby product,baby names">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 	<meta http-equiv="refresh" content="5"> -->
	<!-- Favicon -->   
	<link href="images/favicon.png" rel="shortcut icon"/>
<link rel="stylesheet" type="text/css" href="css/adminlogin.css">
<link rel="stylesheet" href="resources/bootstrap.min.css"/>
</head>
<body style="background-color:#e1e1e1">



<div class="container">
<div class="wrap">
<h3><img src="images/favicon.png" class="image"><em>BabyCare Solutions</em></h3>
<hr>
  <h1><i>Admin Login</i>
  </h1>
<h4 style="color:red"><em>${error }</em></h4>


<form style="width:300px" action="adminlogin" method="post">
  <div class="form-group">
    <label for="name1">Name</label>
    <input type="text" name="username" class="form-control" id="name1" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" name="password" class="form-control" id="password1" placeholder="Password"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Login</button>
</form>

</div>

</div>

<div class="para">
<div class="container-fluid">
<p>
<strong>Note:</strong> Admin Can  Add The  Baby names with different religions and He can delete also.
</p>

</div>
</div>



<div class="container" style="margin-top:26px;text-align:center">
<strong>
&copy;Copyright BabyCareSolution 2010-2022.
</strong>
</div>

<!-- sahithreddy.malapati@gmail.com -->
</body>
</html>