package de.schulze.bosse.fallingstones;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hendy on 03.08.17.
 */

public class ProfileActivity extends AppCompatActivity {

    private TextView name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    protected void configProfile() {
            name = (TextView) findViewById(R.id.name);
    }

    private void saveProfile() {

    }




}
