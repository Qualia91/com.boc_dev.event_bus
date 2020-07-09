package com.nick.wood.game_engine.event_bus.event_types;

import com.nick.wood.game_engine.event_bus.interfaces.EventType;

public enum ErrorEventType implements EventType {
	CRITICAL,
	WARNING
}
