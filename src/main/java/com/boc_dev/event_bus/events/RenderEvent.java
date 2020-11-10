package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.interfaces.Event;
import com.boc_dev.event_bus.interfaces.EventData;
import com.boc_dev.event_bus.event_types.RenderEventType;

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
