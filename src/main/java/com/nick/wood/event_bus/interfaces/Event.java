package com.nick.wood.event_bus.interfaces;

public interface Event<T> {
	T getData();
	EventType getType();
}
