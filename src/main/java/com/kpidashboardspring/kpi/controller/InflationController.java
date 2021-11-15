package com.kpidashboardspring.kpi.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.kpidashboardspring.kpi.model.Inflation;
import com.kpidashboardspring.kpi.service.InflationService;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class InflationController {

	private InflationService inflationService;

	@GetMapping("/getInflationBRA")

	List<BigDecimal> getInflationBRA() {
		return inflationService.getInflationBRA();
	}

	@GetMapping("/getInflationARG")
	List<BigDecimal> getInflationARG() {
		return inflationService.getInflationARG();
	}

	@GetMapping("/aaaaaaaaa")
	String aaaaaaaaa() {
		return "aaaaaaaaa";
	}

	@GetMapping("/getInflationYear")
	List<Integer> getInflationYear() {
		return inflationService.getInflationYear();
	}

	@RequestMapping(value = "/listAll", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String listAll(Model model) {

		Gson gson = new Gson();

		List<Inflation> allInflations = inflationService.listAll();

		return gson.toJson(allInflations);
	}

	@RequestMapping(value = "/chart", produces = "application/json; charset=utf-8")
	@ResponseBody

	public String chart(Model model) {
		BarDataset dataset = new BarDataset().setLabel("Inflação Brasil")
				// .setData(20000, 14000, 12000, 15000, 18000, 19000, 22000)
				.addBackgroundColors(Color.GREEN).setBorderWidth(2);

//		for (Inflation inflation : inflationService.getInflationBRA()) {
//			dataset.addData(inflation.getInflation());
//		}

		BarData data = new BarData().addDataset(dataset);
//		for (Inflation inflation : inflationService.getInflationBRA()) {
//			data.addLabels(inflation.getYear().toString());
//		}

		return new BarChart(data).toJson();
	}

}
