package com.teslastem.aquifereducation;
import android.app.Activity;

public class InformationActivity extends Activity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        final com.daimajia.slider.library.SliderLayout sliderShow = (com.daimajia.slider.library.SliderLayout) findViewById(R.id.slider);
        java.util.HashMap<String,Integer> file_maps = new java.util.HashMap<String, Integer>();
        file_maps.put("Union Hill Water Association Aquifer", R.drawable.poster1);
        file_maps.put("What is a swale?", R.drawable.poster2);
        file_maps.put("Landscaping Features", R.drawable.poster3);
        file_maps.put("Contamination", R.drawable.poster4);
        file_maps.put("EPA Water Standards", R.drawable.poster5);
        file_maps.put("Individual Behavior", R.drawable.poster6);
        file_maps.put("Why this issue matters", R.drawable.poster7);
        sliderShow.setDuration(10000);
        for(String name : file_maps.keySet()){
            com.daimajia.slider.library.SliderTypes.TextSliderView textSliderView = new com.daimajia.slider.library.SliderTypes.TextSliderView(this);
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(com.daimajia.slider.library.SliderTypes.BaseSliderView.ScaleType.Fit);
            sliderShow.addSlider(textSliderView);
        }
        android.widget.Button left = (android.widget.Button) findViewById(R.id.leftClick);
        android.widget.Button right = (android.widget.Button) findViewById(R.id.rightClick);
        left.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                sliderShow.movePrevPosition();
            }
        });
        right.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                sliderShow.moveNextPosition();
            }
        });
    }
}