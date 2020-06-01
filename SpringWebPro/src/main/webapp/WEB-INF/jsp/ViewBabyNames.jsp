	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Baby Names</title>
<meta name="description" content="Baby tips, products, food,baby names">
<meta name="keywords"
	content="babycare,baby food,baby tips,baby product,baby names">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- <meta http-equiv="refresh" content="5"> -->
<!-- Favicon -->
<link href="images/favicon.png" rel="shortcut icon" />
<link rel="stylesheet" type="text/css" href="css/adminlogin.css">



</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="container-fluid">

		<a href="viewbyreligion"><input type="button" class='btn btn-primary' role='button' id="hindu" value="hindu"></a>
		<a href="viewbyreligion"><input type="button" class='btn btn-primary' role='button' id="muslim" value="muslim"></a>
		<a href="viewbyreligion"><input type="button" class='btn btn-primary' role='button' id="sikh" value="sikh"></a>
		<a href="viewbyreligion"><input type="button" class='btn btn-primary' role='button' id="christian" value="chritian"></a>
		<%
			HttpSession session1 = request.getSession(false);
		if (session == null || session.getAttribute("adminlogin") == null) {

		} else {
		%>


		<a href='babynames' class='btn btn-primary' role='button' id="button">Add
			Baby Name</a> <a href='logout' class='btn btn-primary' role='button'
			id="button">Logout</a>


		<%
			}
		%>
	</div>

	<hr class="hr">
	<br>
	<h4 style="color:red;">${delete }</h4>
	<h4 style="color:red;">${fail }</h4>
	<br>
	<br>
<!-- 
view all baby names tables -->
	<div class="container" id="babaydetails">
		<table id="babygrid" class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Baby Id</th>
					<th>Baby Name</th>
					<th>Meaning</th>
					<th>Sex</th>
					<th>Religion</th>
					<th>Action</th>
	

				</tr>
			</thead>

			<!-- <!-- Edit model form -->
			<div class="modal fade bd-example-modal-sm" tabindex="-1"
				role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
				<div class="modal-dialog modal-sm">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Delete
								BabyName</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<form action="deletebaby" method="post">
							<div class="modal-body">




<div class="form-group">
    <input type="hidden" class="form-control" id="babyid" aria-describedby="emailHelp" name="id" readonly>
   
  </div>

								<div class="form-group">
									<p>You want Delete the Baby Name</p>

								</div>

							</div>
							<div class="modal-footer">
								<input type="Submit" class="btn btn-primary" value="Yes">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">No</button>
							</div>
						</form>
					</div>
				</div>
			</div>

		</table>
	</div>

<!-- end here -->


</body>
<script src="js/babydetilesgrid.js"></script>

</html>