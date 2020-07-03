package com.nick.wood.game_engine.event_bus.interfaces;

public interface Event<T> {
	T getData();
	EventType getType();
}
