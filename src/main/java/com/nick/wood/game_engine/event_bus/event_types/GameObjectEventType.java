package com.nick.wood.game_engine.event_bus.event_types;

import com.nick.wood.game_engine.event_bus.interfaces.EventType;

public enum GameObjectEventType implements EventType {
	ADD,
	REMOVE,
	HIDE,
	SHOW,
	SHOW_ALL,
	HIDE_ALL;
}
