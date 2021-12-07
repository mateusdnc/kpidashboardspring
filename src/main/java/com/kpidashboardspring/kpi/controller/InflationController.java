package com.kpidashboardspring.kpi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kpidashboardspring.kpi.model.Inflation;
import com.kpidashboardspring.kpi.service.InflationService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/kpi")
public class InflationController {

	private InflationService inflationService;
	

	@GetMapping("/getInflationKPIData")
	@ResponseBody
	List<Inflation> getInflationKPIData() {
		return inflationService.getInflationKPIData();
	}
	
	@GetMapping("/inflationBra")
	public String getInflationBra() {
		
		return "/kpi/inflationBra";
	}

	@RequestMapping(value = "/listAll", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String listAll(Model model) {

		Gson gson = new Gson();

		List<Inflation> allInflations = inflationService.listAll();

		return gson.toJson(allInflations);
	}


}
