$(document)
		.ready(
				function() {

					var table1 = $('#muslimreligion')
							.DataTable(
									{

										

										
										"bScrollCollapse" : true,
									
										"sPaginationType" : "full_numbers",

										"sAjaxDataProp" : "",

										"ajax" : {

											"type" : "Get",

											"url" : "/muslimreligion/religion='muslim'",

											"dataSrc" : function(json) {

												return json;
											},

											"contentType" : "application/json",

											"data" : function(data) {

											}
										},
										

										columns : [ {

											title : "Baby id",
											className : "center",
											"sType" : "numeric",
											data : "id"
										},

										{

											title : "Baby Name",
											className : "center",
											"sType" : "string",
											data : "name"
										}, {

											title : "Meaning",
											className : "center",
											"sType" : "string",
											data : "meaning"
										}, {

											title : "Sex",
											className : "center",
											"sType" : "string",
											data : "sex"
										}, {

											title : "Religion ",
											className : "center",
											"sType" : "string",
											data : "religion"
										}

										]

									});

				});