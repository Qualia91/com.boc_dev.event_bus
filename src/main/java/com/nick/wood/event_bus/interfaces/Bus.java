package com.nick.wood.event_bus.interfaces;

import java.util.List;

public interface Bus {

	// register new subscribers
	void register(Subscribable subscribable);

	// unregister new subscribers
	void unregister(Subscribable subscribable);

	// Send the event to interested subscibers
	void dispatch(Event<?> event);

	// get list of all subscribers
	List<Subscribable> getSubscribers();

}
