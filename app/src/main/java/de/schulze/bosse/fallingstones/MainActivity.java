package de.schulze.bosse.fallingstones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private Button btn_start;
	private Button btn_config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GUIconfig();
    }

    private void GUIconfig() {
    	btn_start = (Button) findViewById(R.id.btn_start);
    	btn_config = (Button) findViewById(R.id.btn_config);
    	btn_start.setOnClickListener(this);
    	btn_config.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.btn_start) {
			Intent intent = new Intent(this, GameActivity.class);
			startActivity(intent);
		} else if(v.getId() == R.id.btn_config) {
			//TODO: Create config activity
		}
	}
}
