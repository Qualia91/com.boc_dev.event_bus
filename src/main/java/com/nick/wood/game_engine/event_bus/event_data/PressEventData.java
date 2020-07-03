package com.nick.wood.game_engine.event_bus.event_data;

import com.nick.wood.game_engine.event_bus.interfaces.EventData;

public class PressEventData implements EventData {

	private final int key;
	private final int action;

	public PressEventData(int key, int action) {
		this.key = key;
		this.action = action;
	}

	public int getKey() {
		return key;
	}

	public int getAction() {
		return action;
	}
}
