$(document)
		.ready(
				function() {

					var table = $('#hindureligion')
							.DataTable(
									{

										"sScrollX" : "100%",
										"sScrollXInner" : "100%",
										"bScrollCollapse" : true,
										
										"sPaginationType" : "full_numbers",

										"sAjaxDataProp" : "",

										"ajax" : {

											"type" : "Get",

											"url" : "/hindureligion/religion='hindu'",

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