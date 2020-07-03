package com.nick.wood.game_engine.event_bus.events;


import com.nick.wood.game_engine.event_bus.event_types.ControlEventType;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventData;

public class ControlEvent implements Event<EventData> {

	private final ControlEventType controlEventType;
	private final EventData eventData;

	public ControlEvent(ControlEventType controlEventType, EventData eventData) {
		this.controlEventType = controlEventType;
		this.eventData = eventData;
	}

	@Override
	public EventData getData() {
		return eventData;
	}

	@Override
	public ControlEventType getType() {
		return controlEventType;
	}
}
