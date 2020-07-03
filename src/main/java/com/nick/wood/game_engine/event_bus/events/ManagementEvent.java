package com.nick.wood.game_engine.event_bus.events;

import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventData;
import com.nick.wood.game_engine.event_bus.event_data.ManagementEventData;
import com.nick.wood.game_engine.event_bus.event_types.ManagementEventType;

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
