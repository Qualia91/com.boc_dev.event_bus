package com.nick.wood.event_bus.events;

import com.nick.wood.event_bus.event_data.PickingEventData;
import com.nick.wood.event_bus.event_types.PickingEventType;
import com.nick.wood.event_bus.interfaces.Event;

public class PickingEvent implements Event<PickingEventData> {

	private final PickingEventData pickingEventData;
	private final PickingEventType pickingEventType;

	public PickingEvent(PickingEventData pickingEventData, PickingEventType pickingEventType) {
		this.pickingEventData = pickingEventData;
		this.pickingEventType = pickingEventType;
	}

	@Override
	public PickingEventData getData() {
		return pickingEventData;
	}

	@Override
	public PickingEventType getType() {
		return pickingEventType;
	}
}
