<!DOCTYPE html>

<head>

<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
</head>

<style>
body {
	background-color: #2b313d;
}

.background {
	background-color: #2b313d;
}
</style>
<body>

	<div class="container-fluid background py-5">
		<div class="container py-3">
			<h2 class="text-white text-center py-3">Indice de Inflação</h2>

			<div class="col-sm">
				<div class="row justify-content-center">
					<a class="text-white mx-3">Paises</a> 
					<select></select>
				</div>

			</div>
		</div>
		<div class="container">
			<div class="myChartdiv">
				<%@include file="kpi/inflationBra.html"%>
			</div>
		</div>
	</div>

</body>