package com.teslastem.aquifereducation;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class AboutUs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView description = (TextView) findViewById(R.id.textView2);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        description.setTypeface(font);

    }

}
