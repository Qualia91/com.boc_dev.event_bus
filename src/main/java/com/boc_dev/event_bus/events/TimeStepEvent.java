package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.event_data.TimeStepEventData;
import com.boc_dev.event_bus.interfaces.Event;
import com.boc_dev.event_bus.interfaces.EventType;
import com.boc_dev.event_bus.event_types.TimeStepEventType;

public class TimeStepEvent implements Event<TimeStepEventData> {

	private final TimeStepEventData timeStepEventData;
	private final TimeStepEventType timeStepEventType;

	public TimeStepEvent(TimeStepEventData timeStepEventData, TimeStepEventType timeStepEventType) {
		this.timeStepEventData = timeStepEventData;
		this.timeStepEventType = timeStepEventType;
	}

	@Override
	public TimeStepEventData getData() {
		return timeStepEventData;
	}

	@Override
	public EventType getType() {
		return timeStepEventType;
	}
}
