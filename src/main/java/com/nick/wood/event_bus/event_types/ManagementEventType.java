package com.nick.wood.event_bus.event_types;

import com.nick.wood.event_bus.interfaces.EventType;

public enum ManagementEventType implements EventType {
	START,
	SHUTDOWN,
	RESTART,
	PAUSE
}
