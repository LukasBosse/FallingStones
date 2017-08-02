package de.schulze.bosse.fallingstones;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import com.twicecircled.spritebatcher.Drawer;
import com.twicecircled.spritebatcher.SpriteBatcher;

import javax.microedition.khronos.opengles.GL10;

public class GameActivity extends Activity implements Drawer {

	private int[] resourceIds = { 0 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GLSurfaceView glSurface = new GLSurfaceView(this);
		setContentView(glSurface);
		glSurface.setRenderer(new SpriteBatcher(this, resourceIds, this));
	}

	@Override
	public void onDrawFrame(GL10 gl10, SpriteBatcher spriteBatcher) {

	}

}
