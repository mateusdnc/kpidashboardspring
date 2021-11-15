package com.kpidashboardspring.shared.architecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KPIDashboardSpringController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
