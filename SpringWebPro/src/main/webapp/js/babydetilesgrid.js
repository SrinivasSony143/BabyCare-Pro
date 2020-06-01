$(document)
		.ready(
				function() {

					var table = $('#babygrid')
							.DataTable(
									{

										"sScrollX" : "100%",
										"sScrollXInner" : "100%",
										"bScrollCollapse" : true,
										"sPaginationType" : "full_numbers",

										"sAjaxDataProp" : "",

										"ajax" : {

											"type" : "Get",

											"url" : "/babydetails",

											"dataSrc" : function(json) {

												return json;
											},

											"contentType" : "application/json",

											"data" : function(data) {

											}
										},
										"columnDefs" : [ {
											"targets" : 5,

											"render" : function(data, type,
													row, meta) {

												return '<a  id="useredit"  data-toggle="modal" data-target=".bd-example-modal-sm" href="#" style="text-decoration:none;color:red;">Delete</a>';
											}
										} ],

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
					
					$('#babygrid tbody').on( 'click', 'tr ' , function () {
						
						$("#babyid").val(table.row( this ).data().id);
						
						
					} );
					

				});
 

