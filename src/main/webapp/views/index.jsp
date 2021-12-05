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
</style>
<body>
	<div class="container">
		<div class="row" style="background-color: #374256">
			<div class="col mx-auto">
				<div class="myChartdiv">
					<%@include file="kpi/inflationBra.html"%>
				</div>
			</div>
		</div>
	</div>
</body>