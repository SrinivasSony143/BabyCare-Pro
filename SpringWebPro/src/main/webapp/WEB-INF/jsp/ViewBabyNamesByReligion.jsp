<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Baby Names By Religion</title>
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

		<input type="button" class='btn btn-primary' role='button' id="hindu" value="hindu"></a>
		<input type="button" class='btn btn-primary' role='button' id="muslim" value="muslim"></a>
		<input type="button" class='btn btn-primary' role='button' id="sikh" value="sikh"></a>
		<input type="button" class='btn btn-primary' role='button' id="christian" value="chritian"></a>
		</div>
		
		<hr>
		<br>
		<br>
		<!-- view baby names by hindu religion -->
	
	<div class="container-fluid" id="HinduReligion" >
	
	
	<em><h1> View baby names by <strong style="color:gray;">hindu religion</strong></h1></em>
	<br>
	<div class="container" id="babaydetails">
		<table id="hindureligion" class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Baby Id</th>
					<th>Baby Name</th>
					<th>Meaning</th>
					<th>Sex</th>
					<th>Religion</th>
					

				</tr>
			</thead>
			</table>
	
	</div>
	</div>
	
	<div class="container-fluid" id="MuslimReligion" >
	
	
	<em><h1> View baby names by <strong style="color:gray;">muslim religion</strong></h1></em>
	<br>
	<div class="container" id="babaydetails">
		<table id="muslimreligion" class="table table-striped table-bordered" style="width:100%;">
			<thead>
				<tr>
					<th>Baby Id</th>
					<th>Baby Name</th>
					<th>Meaning</th>
					<th>Sex</th>
					<th>Religion</th>
					

				</tr>
			</thead>
			</table>
	
	</div>

	</div>


	
	<div class="container-fluid" id="SikhReligion" >
	
	
	<h1><em> View baby names by <strong style="color:gray;">sikh religion</strong></em></h1>
	<br>
<div class="container" id="babaydetails">
	<table id="sikhreligion" class="table table-striped table-bordered" style="width:100%;">
			<thead>
				<tr>
					<th>Baby Id</th>
					<th>Baby Name</th>
					<th>Meaning</th>
					<th>Sex</th>
					<th>Religion</th>
					

				</tr>
			</thead>
			</table>
	
	</div>
	</div>

	
	<div class="container-fluid" id="christianReligion" >
	
	
	<h1> <em>View baby names by <strong style="color:gray;"> christian religion</strong></em></h1>
	<br>
<div class="container" id="babaydetails">
	<table id="christianreligion" class="table table-striped table-bordered" style="width:100%;">
			<thead>
				<tr>
					<th>Baby Id</th>
					<th>Baby Name</th>
					<th>Meaning</th>
					<th>Sex</th>
					<th>Religion</th>
					

				</tr>
			</thead>
			</table>
	
	</div>
	
	</div>
	
	


</body>
<script type="text/javascript">

$("#hindu").click(function(){

	$("#HinduReligion").toggle('slow');
	$("#MuslimReligion").hide();
	$("#SikhReligion").hide();
	$("#christianReligion").hide();
});

$("#muslim").click(function(){
	$("#MuslimReligion").toggle('slow');
	$("#HinduReligion").hide();
	
	$("#SikhReligion").hide();
	$("#christianReligion").hide();
});

$("#sikh").click(function(){

	$("#HinduReligion").hide();
	$("#MuslimReligion").hide();
	$("#SikhReligion").toggle('slow');
	$("#christianReligion").hide();
});

$("#christian").click(function(){

	$("#HinduReligion").hide();
	$("#MuslimReligion").hide();
	$("#SikhReligion").hide();
	$("#christianReligion").toggle('slow');
});

</script>
	<script src="js/hindureligion.js"></script>
<script src="js/muslimreligion.js"></script>
<script src="js/sikhreligion.js"></script>
<script src="js/christianreligion.js"></script>
</html>