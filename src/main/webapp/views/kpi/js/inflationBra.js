	var inflationLabels = [];
	var inflationBRAData = [];

	$.ajax({
		type : 'GET',
		url : 'http://localhost:8082/kpi/getInflationKPIData',
		dataType : 'json',
		processData : false,
		success : function(resp) {

			Object.keys(resp).forEach(function(a, index) {
				console.log(resp[a].year);
				inflationLabels.push(resp[a].year);
				inflationBRAData.push(resp[a].inflation)
			});

			buildChart();
		},
	})

	function buildChart() {

		const data1 = {
			labels : inflationLabels,
			datasets : [ {
				type : 'bar',
				label : 'Inflação Brasil',
				backgroundColor : 'yellow',
				data : inflationBRAData,
			},

			]
		};

		const config = {
			data : data1,
			options : {
				plugins : {
					legend : {
						labels : {
							color : "white",
							font : {
								size : 18,
							},
						},
					},
				},

				scales : {
					y : {
						ticks : {
							color : "white",
						},
					},
					x : {
						ticks : {
							color : "white",
						},
					},
				},
			},
		}

		var myChart = new Chart(document.getElementById('myChart'), config);

	}