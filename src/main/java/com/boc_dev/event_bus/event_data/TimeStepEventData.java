package com.boc_dev.event_bus.event_data;

import com.boc_dev.event_bus.interfaces.EventData;

public class TimeStepEventData implements EventData {

	private final long timeSinceStart;

	public TimeStepEventData(long timeSinceStart) {
		this.timeSinceStart = timeSinceStart;
	}

	public long getTimeSinceStart() {
		return timeSinceStart;
	}
}
