package com.kpidashboardspring.kpi.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.kpidashboardspring.kpi.model.Inflation;
import com.kpidashboardspring.kpi.service.InflationService;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/kpi")
public class InflationController {

	private InflationService inflationService;

	@GetMapping("/getInflationKPIData")
	List<Inflation> getInflationKPIData() {
		return inflationService.getInflationKPIData();
	}


	@RequestMapping(value = "/listAll", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String listAll(Model model) {

		Gson gson = new Gson();

		List<Inflation> allInflations = inflationService.listAll();

		return gson.toJson(allInflations);
	}


}
