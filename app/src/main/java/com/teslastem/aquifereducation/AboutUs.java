package com.teslastem.aquifereducation;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView description = (TextView) findViewById(R.id.textView2);
        TextView title = (TextView) findViewById(R.id.textView7);
        TextView URL = (TextView) findViewById(R.id.textView3);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        description.setTypeface(font);
        title.setTypeface(font);
        URL.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW,
                        android.net.Uri.parse("http://aquifereducation.wix.com/teslastem")));
            }
        });
    }
}
