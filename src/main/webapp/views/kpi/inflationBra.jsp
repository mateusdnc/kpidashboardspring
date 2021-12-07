<html>

<head>

 <meta charset="ISO-8859-1"> 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="/views/kpi/js/inflationBra.js"></script>

</head>

<style>
.myChartdiv {
	background-color: #3c4c66;
	border-width: 50;
	padding: 20;
	border-radius: 10px;
	border-color: darkblue;
}
</style>

<div id="myChartdiv33">
	<canvas class="m-3" id="myChart"></canvas> 
</div>

<script>
$(window).on('load', function () {	
	buildChart();		
});


</script>

</html>