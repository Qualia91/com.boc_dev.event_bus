package com.nick.wood.game_engine.event_bus.events;

import com.nick.wood.game_engine.event_bus.event_data.GameObjectEventData;
import com.nick.wood.game_engine.event_bus.event_types.GameObjectEventType;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.EventType;

import java.util.UUID;

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
