package com.boc_dev.event_bus.interfaces;

public interface Event<T> {
	T getData();
	EventType getType();
}
