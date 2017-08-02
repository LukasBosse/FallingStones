package de.schulze.bosse.fallingstones;

import android.app.Activity;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Display;
import com.twicecircled.spritebatcher.Drawer;
import com.twicecircled.spritebatcher.SpriteBatcher;
import de.schulze.bosse.entites.Background;

import javax.microedition.khronos.opengles.GL10;

public class GameActivity extends Activity implements Drawer {

	//Controller
	private boolean running = true;
	//Display
	private Display display;
	private Point displaySize;
	//Resource-Ids
	private int[] resourceIds = { R.drawable.gameBackground};
	//Background
	private Background firstBackground;
	private Background secondBackground;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GLSurfaceView glSurface = new GLSurfaceView(this);
		setContentView(glSurface);
		glSurface.setRenderer(new SpriteBatcher(this, resourceIds, this));
		display = getWindowManager().getDefaultDisplay();
		displaySize = new Point();
		display.getSize(displaySize);
		setEntities();
		update();
	}

	private void setEntities() {
		this.firstBackground = new Background(displaySize.y, this,0,0, resourceIds[0]);
		this.secondBackground = new Background(displaySize.y, this, 0, 600, resourceIds[0]);
	}

	private void update() {
		while(running) {
			firstBackground.update();
			secondBackground.update();
			System.out.println("Background-Y: " + firstBackground.getY());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void onDrawFrame(GL10 gl, SpriteBatcher sb) {
		sb.draw(firstBackground.getResourceId(), firstBackground.getSource(), firstBackground.getDestination());
		sb.draw(secondBackground.getResourceId(), secondBackground.getSource(), secondBackground.getDestination());
	}

}
