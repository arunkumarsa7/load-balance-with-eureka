package com.rate;

import java.math.BigDecimal;

public class TicketRate {

	private int stationId;

	private BigDecimal currentRate;

	private String timestamp;

	public TicketRate() {
	}

	public TicketRate(final int stationId, final BigDecimal currentRate, final String timestamp) {
		this.stationId = stationId;
		this.currentRate = currentRate;
		this.timestamp = timestamp;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(final int stationId) {
		this.stationId = stationId;
	}

	public BigDecimal getCurrentRate() {
		return currentRate;
	}

	public void setCurrentRate(final BigDecimal currentRate) {
		this.currentRate = currentRate;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(final String timestamp) {
		this.timestamp = timestamp;
	}

}