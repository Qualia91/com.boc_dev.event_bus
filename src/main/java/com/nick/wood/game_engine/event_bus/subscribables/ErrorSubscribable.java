package com.nick.wood.game_engine.event_bus.subscribables;

import com.nick.wood.game_engine.event_bus.event_types.ManagementEventType;
import com.nick.wood.game_engine.event_bus.events.ErrorEvent;
import com.nick.wood.game_engine.event_bus.events.ManagementEvent;
import com.nick.wood.game_engine.event_bus.interfaces.Event;
import com.nick.wood.game_engine.event_bus.interfaces.Subscribable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

public class ErrorSubscribable implements Subscribable, Runnable {

	private final Set<Class<?>> supports = new HashSet<>();
	private final ArrayBlockingQueue<Event<?>> eventQueue = new ArrayBlockingQueue<>(100);
	private final ArrayList<Event<?>> drainToList = new ArrayList<>();
	private final Consumer<String> errorPrinter;

	private boolean shutdown = false;

	public ErrorSubscribable(Consumer<String> errorPrinter) {
		this.supports.add(ErrorEvent.class);
		this.errorPrinter = errorPrinter;
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

		} else {
			errorPrinter.accept(event.getType().toString());
			errorPrinter.accept(event.getData().toString());
		}
	}
}
