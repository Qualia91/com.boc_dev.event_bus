package com.nick.wood.game_engine.event_bus.events;

import com.nick.wood.game_engine.event_bus.event_types.RenderEventType;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventData;

public class RenderEvent implements Event<EventData> {

	private final EventData renderEventData;
	private final RenderEventType renderEventType;

	public RenderEvent(EventData renderEventData, RenderEventType renderEventType) {
		this.renderEventData = renderEventData;
		this.renderEventType = renderEventType;
	}

	@Override
	public EventData getData() {
		return renderEventData;
	}

	@Override
	public RenderEventType getType() {
		return renderEventType;
	}
}
