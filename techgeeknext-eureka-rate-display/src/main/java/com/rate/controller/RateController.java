package com.rate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.rate.model.TicketRate;

@Controller
public class RateController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dashboard")
	public String getTicketRate(@RequestParam(defaultValue = "5") final int stationId, final Model m) {
		final TicketRate tr = restTemplate.getForObject("http://eureka-rate-service/rate/" + stationId,
				TicketRate.class);
		m.addAttribute("rate", tr != null ? tr.getCurrentRate() : "");
		return "dashboard";
	}

}
