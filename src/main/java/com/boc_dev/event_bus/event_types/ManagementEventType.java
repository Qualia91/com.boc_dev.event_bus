package com.boc_dev.event_bus.event_types;

import com.boc_dev.event_bus.interfaces.EventType;

public enum ManagementEventType implements EventType {
	START,
	SHUTDOWN,
	RESTART,
	PAUSE
}
