package com.teslastem.aquifereducation;

public class MapActivity extends android.app.Activity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        android.widget.TextView one = (android.widget.TextView) findViewById(R.id.textView5);
        android.widget.TextView two = (android.widget.TextView) findViewById(R.id.textView2);
        android.widget.ImageView three = (android.widget.ImageView) findViewById(R.id.imageView);
        android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        one.setTypeface(font);
        two.setTypeface(font);
        switch(getIntent().getExtras().getInt("id")) {
            case 1:
                one.setText(R.string.button_problem1);
                two.setText(R.string.description_contamination);
                three.setImageResource(R.drawable.contamination);
                break;
            case 2:
                one.setText(R.string.button_problem2);
                two.setText(R.string.description_saltwater);
                three.setImageResource(R.drawable.saltwater_intrusion);
                break;
            case 3:
                one.setText(R.string.button_problem3);
                two.setText(R.string.description_slowrecharge);
                three.setImageResource(R.drawable.slow_recharge);
                break;
            case 4:
                one.setText(R.string.button_problem4);
                two.setText(R.string.description_fracking);
                three.setImageResource(R.drawable.fracking);
                break;
        }
    }
}