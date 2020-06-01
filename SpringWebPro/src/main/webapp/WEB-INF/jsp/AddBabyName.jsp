<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Baby Name Added</title>
<meta name="description" content="Baby tips, products, food,baby names">
	<meta name="keywords" content="babycare,baby food,baby tips,baby product,baby names">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- <meta http-equiv="refresh" content="5"> -->
	<!-- Favicon -->   
	<link href="images/favicon.png" rel="shortcut icon"/>
	<link rel="stylesheet" type="text/css" href="css/adminlogin.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container-fluid">
<div class="babyname">
  <h2><em>Add Baby Name</em></h2>
  <h4 style="color:green">
  <em>
  ${sucess }
  </em>
  </h4>
  <h4 style="color:red">
  <em>
  ${error }
  </em>
  </h4>
<hr>
<form style="width:300px" action="addbabyname" method="post">
  <div class="form-group">
    <label for="name1">Name:</label>
    <input type="text" name="name" class="form-control" id="name1" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="meaning1">Meaning:</label>
    <input type="text" name="meaning" class="form-control" id="meaning1" placeholder="Meaning"/>
  </div>
  <div class="form-group">
    <label for="sex1">Sex:</label>
    <input type="radio" name="sex" value="boy" id="sex1"/>Male
    <input type="radio" name="sex" value="girl" id="sex1"/>Female
  </div>
  <div class="form-group">
    <label for="religion1">Religion:</label>
    <select name="religion" class="form-control" id="religion1">
    <option>Hindu</option>
    <option>Muslim</option>
    <option>Christian</option>
    <option>Sikh</option>
    <option>Jews</option>
    <option>Jain</option>
    <option>Buddhist</option>
    </select>
  </div>
  
  <button type="submit" class="btn btn-primary">Add Baby Name</button>
</form>
</div>
</div>




















</body>
</html>