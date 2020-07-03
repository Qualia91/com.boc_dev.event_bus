package com.nick.wood.game_engine.event_bus.events;

import com.nick.wood.game_engine.event_bus.event_data.TimeStepEventData;
import com.nick.wood.game_engine.event_bus.event_types.TimeStepEventType;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventType;

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
