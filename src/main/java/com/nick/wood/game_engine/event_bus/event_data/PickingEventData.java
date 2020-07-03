package com.nick.wood.game_engine.event_bus.event_data;

import com.nick.wood.game_engine.event_bus.interfaces.EventData;

import java.util.UUID;

public class PickingEventData implements EventData {

	private final UUID uuid;

	public PickingEventData(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUuid() {
		return uuid;
	}
}
