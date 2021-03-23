package com.rate.controller;

import java.math.BigDecimal;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rate.model.TicketRate;

@RestController
public class TicketRateController {

	Logger logger = LoggerFactory.getLogger(TicketRateController.class);

	@RequestMapping("/rate/{stationId}")
	public TicketRate getTicketRate(@PathVariable final int stationId) {

		TicketRate ticketRate;

		logger.info("Station Id : " + stationId);

		switch (stationId) {
		case 1:
			ticketRate = new TicketRate(stationId, new BigDecimal("0.32"), Instant.now().toString());
			break;
		case 2:
			ticketRate = new TicketRate(stationId, new BigDecimal("1.02"), Instant.now().toString());
			break;
		case 3:
			ticketRate = new TicketRate(stationId, new BigDecimal("0.40"), Instant.now().toString());
			break;
		default:
			ticketRate = new TicketRate(stationId, new BigDecimal("1.00"), Instant.now().toString());
			break;
		}

		return ticketRate;
	}

}