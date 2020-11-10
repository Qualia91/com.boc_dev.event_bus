package com.boc_dev.event_bus.events;

import com.boc_dev.event_bus.event_data.GameObjectEventData;
import com.boc_dev.event_bus.interfaces.Event;
import com.boc_dev.event_bus.event_types.GameObjectEventType;

public class GameObjectEvent implements Event<GameObjectEventData> {

	private final GameObjectEventData gameObjectEventData;
	private final GameObjectEventType gameObjectEventType;

	public GameObjectEvent(GameObjectEventData gameObjectEventData, GameObjectEventType gameObjectEventType) {
		this.gameObjectEventData = gameObjectEventData;
		this.gameObjectEventType = gameObjectEventType;
	}

	@Override
	public GameObjectEventData getData() {
		return gameObjectEventData;
	}

	@Override
	public GameObjectEventType getType() {
		return gameObjectEventType;
	}
}
