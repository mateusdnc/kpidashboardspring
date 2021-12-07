package com.kpidashboardspring.shared.architecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kpidashboardspring.kpi.service.InflationService;

@Controller
public class KPIDashboardSpringController {

    @Autowired
	private InflationService inflationService;
	
	@GetMapping("/")
	public String index(Model model) {
	System.out.print(inflationService.getCountryList());
		model.addAttribute("countryList", inflationService.getCountryList());
		return "index";
	}
}
