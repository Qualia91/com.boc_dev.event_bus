package com.boc_dev.event_bus.event_data;

import java.util.UUID;

public class GameObjectEventData {
	private final UUID uuid;

	public GameObjectEventData(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUuid() {
		return uuid;
	}
}
