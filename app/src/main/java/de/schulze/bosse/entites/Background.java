package de.schulze.bosse.entites;

import android.content.Context;

public class Background extends Entity {

	private final float VERTICAL_SPEED = 1f;
	private int DISPLAY_HEIGHT = 0;

	public Background(int displayHeight, Context context, int x, int y, int resourceId) {
		super(context, x, y, resourceId);
		this.DISPLAY_HEIGHT = displayHeight;
	}

	public void update() {
		this.y += VERTICAL_SPEED;
		if(y >= DISPLAY_HEIGHT) y = 0 - height;
		mergeBounding();
	}

}
