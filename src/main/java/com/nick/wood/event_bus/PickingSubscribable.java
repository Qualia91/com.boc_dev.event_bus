package com.nick.wood.event_bus;

import com.nick.wood.event_bus.event_types.ManagementEventType;
import com.nick.wood.event_bus.events.ManagementEvent;
import com.nick.wood.event_bus.events.PickingEvent;
import com.nick.wood.event_bus.interfaces.Event;
import com.nick.wood.event_bus.interfaces.Subscribable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;
import java.util.function.Function;

public class PickingSubscribable implements Subscribable, Runnable {

	private final Set<Class<?>> supports = new HashSet<>();
	private final ArrayBlockingQueue<Event<?>> eventQueue = new ArrayBlockingQueue<>(100);
	private final ArrayList<Event<?>> drainToList = new ArrayList<>();
	private final Function<UUID, String> objectFinder;

	private boolean shutdown = false;

	public PickingSubscribable(Function<UUID, String> objectFinder) {
		supports.add(PickingEvent.class);
		supports.add(ManagementEvent.class);

		this.objectFinder = objectFinder;
	}

	@Override
	public void handle(Event<?> event) {
		eventQueue.add(event);
	}

	@Override
	public boolean supports(Class<? extends Event> aClass) {
		return supports.contains(aClass);
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

		} else if (event instanceof PickingEvent) {
			PickingEvent pickingEvent = (PickingEvent) event;
			System.out.println( objectFinder.apply(pickingEvent.getData().getUuid()) );
		}
	}
}
