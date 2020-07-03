package com.nick.wood.event_bus.event_types;

import com.nick.wood.event_bus.interfaces.EventType;

public enum ControlEventType implements EventType {
	KEY,
	MOUSE,
	MOUSE_BUTTON,
	SCROLL
}
