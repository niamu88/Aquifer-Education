package com.teslastem.aquifereducation;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WorldMap extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_map);
        TextView one = (TextView) findViewById(R.id.text4);
        TextView two = (TextView) findViewById(R.id.text5);
        TextView three = (TextView) findViewById(R.id.text6);
        TextView four = (TextView) findViewById(R.id.text7);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        one.setTypeface(font);
        two.setTypeface(font);
        three.setTypeface(font);
        four.setTypeface(font);
        com.andexert.library.RippleView oneView = (com.andexert.library.RippleView) findViewById
                (R.id.button4);
        com.andexert.library.RippleView twoView = (com.andexert.library.RippleView) findViewById
                (R.id.button5);
        com.andexert.library.RippleView threeView = (com.andexert.library.RippleView) findViewById
                (R.id.button6);
        com.andexert.library.RippleView fourView = (com.andexert.library.RippleView) findViewById
                (R.id.button7);
        final Intent startMap = new android.content.Intent(WorldMap.this, MapActivity.class);
        final android.os.Handler handler = new android.os.Handler();
        oneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startMap.putExtra("id", 1);
                        startActivity(startMap);
                    }
                }, 325);
            }
        });
        twoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startMap.putExtra("id", 2);
                        startActivity(startMap);
                    }
                }, 325);
            }
        });
        threeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startMap.putExtra("id", 3);
                        startActivity(startMap);
                    }
                }, 325);
            }
        });
        fourView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startMap.putExtra("id", 4);
                        startActivity(startMap);
                    }
                }, 325);
            }
        });
    }
}