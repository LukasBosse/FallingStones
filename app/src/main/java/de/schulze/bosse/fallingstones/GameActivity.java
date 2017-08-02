package de.schulze.bosse.fallingstones;

import android.app.Activity;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import com.twicecircled.spritebatcher.Drawer;
import com.twicecircled.spritebatcher.SpriteBatcher;
import de.schulze.bosse.entites.Background;

import javax.microedition.khronos.opengles.GL10;

public class GameActivity extends Activity implements Drawer {

	//Resource-Ids
	private int[] resourceIds = { R.drawable.gameBackground };
	//Background
	private Background background;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GLSurfaceView glSurface = new GLSurfaceView(this);
		setContentView(glSurface);
		glSurface.setRenderer(new SpriteBatcher(this, resourceIds, this));
		setupEntities();
	}

	private void setupEntities() {
		this.background = new Background(this,0,0, resourceIds[0]);
	}

	@Override
	public void onDrawFrame(GL10 gl, SpriteBatcher sb) {
		sb.draw(background.getResourceId(), background.getSource(), background.getDestination());
	}

}
