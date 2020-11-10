package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.interfaces.Event;
import com.boc_dev.event_bus.interfaces.EventType;

public class ErrorEvent implements Event<Exception> {

	private final Exception error;
	private final EventType eventType;

	public ErrorEvent(Exception error, EventType eventType) {
		this.error = error;
		this.eventType = eventType;
	}

	@Override
	public Exception getData() {
		return error;
	}

	@Override
	public EventType getType() {
		return eventType;
	}
}
