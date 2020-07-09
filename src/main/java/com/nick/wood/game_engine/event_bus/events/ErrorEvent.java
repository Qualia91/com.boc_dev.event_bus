package com.nick.wood.game_engine.event_bus.events;

import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventType;

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
