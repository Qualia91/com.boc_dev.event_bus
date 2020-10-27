package com.nick.wood.game_engine.event_bus.subscribables;

import com.nick.wood.game_engine.event_bus.event_types.ManagementEventType;
import com.nick.wood.game_engine.event_bus.events.ManagementEvent;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.Subscribable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class DebugSubscribable implements Subscribable, Runnable {

	private final Set<Class<?>> supports = new HashSet<>();
	private final ArrayBlockingQueue<Event<?>> eventQueue = new ArrayBlockingQueue<>(10);
	private final ArrayList<Event<?>> drainToList = new ArrayList<>();

	private boolean shutdown = false;

	@Override
	public void handle(Event<?> event) {
		eventQueue.offer(event);
	}

	@Override
	public boolean supports(Class<? extends Event> aClass) {
		return true;
	}

	@Override
	public void run() {
		while (!shutdown) {

			eventQueue.drainTo(drainToList);

			for (Event<?> event : drainToList) {
				actionEvent(event);
			}

			drainToList.clear();

		}
	}

	private void actionEvent(Event<?> event) {
		if (event instanceof ManagementEvent) {

			ManagementEvent managementEvent = (ManagementEvent) event;

			if (managementEvent.getType().equals(ManagementEventType.SHUTDOWN)) {
				shutdown = true;
			}

		} else {
			System.out.println(event.getType());
			System.out.println(event.getData());
		}
	}
}
