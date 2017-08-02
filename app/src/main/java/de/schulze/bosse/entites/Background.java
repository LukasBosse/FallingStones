package de.schulze.bosse.entites;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class Background {

	private int x;
	private int y;
	private int width;
	private int height;

	private Drawable drawable;
	private Bitmap bit;

	private int resourceId;
	private Rect source;
	private Rect destination;

	public Background(Context context, int x, int y, int resourceId) {
		this.x = x;
		this.y = y;
		this.drawable = context.getResources().getDrawable(resourceId);
		this.bit = ((BitmapDrawable) drawable).getBitmap();
		this.width = bit.getWidth();
		this.height = bit.getHeight();
		this.resourceId = resourceId;
		this.source = new Rect(x, y, width, height);
		this.destination = new Rect(x, y, x + width, y + height);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public Rect getSource() {
		return source;
	}

	public void setSource(Rect source) {
		this.source = source;
	}

	public Rect getDestination() {
		return destination;
	}

	public void setDestination(Rect destination) {
		this.destination = destination;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
