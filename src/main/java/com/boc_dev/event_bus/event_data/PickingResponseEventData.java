package com.boc_dev.event_bus.event_data;

import java.util.UUID;

public class PickingResponseEventData implements PickingEventData {

	private final UUID uuid;
	private final String sceneLayerName;

	public PickingResponseEventData(UUID uuid, String sceneLayerName) {
		this.uuid = uuid;
		this.sceneLayerName = sceneLayerName;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getSceneLayerName() {
		return sceneLayerName;
	}


}
