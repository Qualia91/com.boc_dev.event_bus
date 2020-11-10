package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.event_data.PickingEventData;
import com.boc_dev.event_bus.event_types.PickingEventType;
import com.boc_dev.event_bus.interfaces.Event;

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
