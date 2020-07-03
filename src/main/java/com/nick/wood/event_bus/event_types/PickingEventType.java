package com.nick.wood.event_bus.event_types;

import com.nick.wood.event_bus.interfaces.EventType;

public enum PickingEventType implements EventType {
	FOUND,
	NOT_FOUND
}
