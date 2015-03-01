package com.teslastem.aquifereducation;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        android.widget.TextView titleButton = (android.widget.TextView) findViewById(R.id.button_title);
        android.widget.TextView playButton = (android.widget.TextView) findViewById(R.id.button);
        TextView aboutUsButton = (TextView) findViewById(R.id.button2);
        TextView infoButton = (TextView) findViewById(R.id.button3);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        com.andexert.library.RippleView playView = (com.andexert.library.RippleView) findViewById
                (R.id.playView);
        com.andexert.library.RippleView aboutView = (com.andexert.library.RippleView)
               findViewById(R.id.aboutView);
        com.andexert.library.RippleView infoView = (com.andexert.library.RippleView)
                findViewById(R.id.infoView);
        titleButton.setTypeface(font);
        playButton.setTypeface(font);
        aboutUsButton.setTypeface(font);
        infoButton.setTypeface(font);
        final android.os.Handler handler = new android.os.Handler();
        playView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, WorldMap.class));
                    }
                }, 260);
            }
        });
        aboutView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, AboutUs.class));
                    }
                }, 260);
            }
        });
        infoView.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, InformationActivity.class));
                    }
                }, 260);
            }
        });
    }
}