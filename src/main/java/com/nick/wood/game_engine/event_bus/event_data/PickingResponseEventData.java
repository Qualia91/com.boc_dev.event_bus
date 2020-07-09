package com.nick.wood.game_engine.event_bus.event_data;

import com.nick.wood.game_engine.event_bus.events.PickingEvent;
import com.nick.wood.game_engine.event_bus.interfaces.EventData;

import java.util.UUID;

public class PickingResponseEventData implements PickingEventData {

	private final UUID uuid;

	public PickingResponseEventData(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUuid() {
		return uuid;
	}
}
