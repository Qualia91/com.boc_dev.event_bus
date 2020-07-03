package com.nick.wood.event_bus.interfaces;

public interface Subscribable {

	// consumes the events dispatched by the bus
	void handle(Event<?> event);

	// Describes the set of classes the subscribable object intends to handle
	boolean supports(Class<? extends Event> aClass);
}
