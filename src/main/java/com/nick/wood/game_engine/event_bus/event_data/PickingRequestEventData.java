package com.nick.wood.game_engine.event_bus.event_data;

public class PickingRequestEventData implements PickingEventData {

	private final int x;
	private final int y;

	public PickingRequestEventData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
