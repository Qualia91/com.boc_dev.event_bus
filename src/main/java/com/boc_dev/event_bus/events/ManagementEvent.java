package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.event_data.ManagementEventData;
import com.boc_dev.event_bus.event_types.ManagementEventType;
import com.boc_dev.event_bus.interfaces.Event;
import com.boc_dev.event_bus.interfaces.EventData;

public class ManagementEvent implements Event<EventData> {

	private final ManagementEventData managementEventData;
	private final ManagementEventType managementEventType;

	public ManagementEvent(ManagementEventData managementEventData, ManagementEventType managementEventType) {
		this.managementEventData = managementEventData;
		this.managementEventType = managementEventType;
	}

	@Override
	public ManagementEventData getData() {
		return managementEventData;
	}

	@Override
	public ManagementEventType getType() {
		return managementEventType;
	}
}
