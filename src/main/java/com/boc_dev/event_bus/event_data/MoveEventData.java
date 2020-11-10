package com.boc_dev.event_bus.event_data;

import com.boc_dev.event_bus.interfaces.EventData;

public class MoveEventData implements EventData {

	private final double xAxis;
	private final double yAxis;

	public MoveEventData(double xAxis, double yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public double getXAxis() {
		return xAxis;
	}

	public double getYAxis() {
		return yAxis;
	}
}
