package com.nick.wood.game_engine.event_bus.event_types;

import com.nick.wood.game_engine.event_bus.interfaces.EventType;

public enum ControlEventType implements EventType {
	KEY,
	MOUSE,
	MOUSE_BUTTON,
	SCROLL
}
