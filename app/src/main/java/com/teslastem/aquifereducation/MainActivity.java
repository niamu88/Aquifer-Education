package com.teslastem.aquifereducation;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static Button button_open;
    private static Button button_aboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
        onClickButtonListener2();
        TextView title = (TextView) findViewById(R.id.textView);
        Button titleButton = (Button) findViewById(R.id.button_title);
        Button playButton = (Button) findViewById(R.id.button);
        Button aboutUsButton = (Button) findViewById(R.id.button2);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        title.setTypeface(font);
        titleButton.setTypeface(font);
        playButton.setTypeface(font);
        aboutUsButton.setTypeface(font);
    }

    public void onClickButtonListener() {
        button_open = (Button) findViewById(R.id.button);
        button_open.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, WorldMap.class);
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickButtonListener2() {
        button_aboutUs = (Button) findViewById(R.id.button2);
        button_aboutUs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(intent);
                    }
                }
        );
    }


}
