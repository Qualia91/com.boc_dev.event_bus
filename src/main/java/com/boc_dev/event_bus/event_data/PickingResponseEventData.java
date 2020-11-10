package com.boc_dev.event_bus.event_data;

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
