package com.boc_dev.event_bus.event_types;

import com.boc_dev.event_bus.interfaces.EventType;

public enum GameObjectEventType implements EventType {
	ADD,
	REMOVE,
	HIDE,
	SHOW,
	SHOW_ALL,
	HIDE_ALL;
}
