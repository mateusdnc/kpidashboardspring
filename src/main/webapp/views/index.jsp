<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>

<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="/views/kpi/js/inflationBra.js"></script>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css">

<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.js"></script>


</head>

<style>
.myChartdiv {
	background-color: #3c4c66;
	border-width: 50;
	padding: 20;
	border-radius: 10px;
	border-color: #2b113d;
}

.background {
	background-color: #EFF7F6;
}
</style>
<body>

	<div class="container-fluid background py-5">
		<div class="container py-3">
			<h2 class="text-white text-center py-3">Indice de Inflação</h2>

			<div class="col-sm">
				<div class="row justify-content-center">
					<a class="text-white mx-3">Paises</a>
					<div>
						<select>
							<c:forEach var="country" items="${countryList}">
								<option>${country}</option>
							</c:forEach>
						</select>
					</div>

				</div>

			</div>
		</div>
		<div class="container">
			<div id="myChartdiv">
				<canvas class="m-3" id="myChart"></canvas>
			</div>

			<div>
				<table id="table_id" class="table table-striped">
					<thead>
						<tr>
							<th>inflationIDE</th>
							<th>country</th>
							<th>countryCode</th>
							<th>year</th>
							<th>inflation</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>

			</div>
		</div>
	</div>

</body>

<script>

	$(document).ready(function() {
		$('#table_id').DataTable({
			ajax : {
				url : 'http://localhost:8082/kpi/getInflationKPIData',
				dataSrc : ''
			},
			columns : [ {
				data : 'inflationIDE'
			}, {
				data : 'country'
			}, {
				data : 'countryCode'
			}, {
				data : 'year'
			}, {
				data : 'inflation'
			}, ]
		});
	});

	$(window).on('load', function() {
		buildChart();
	});
</script>