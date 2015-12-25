package com.example.mobileandroid;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class About extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    
	
	final RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingbar);
    ratingbar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            Toast.makeText(About.this, "Your Rating: " + rating+"\n      Thank You", Toast.LENGTH_SHORT).show();
        }
    });
    
    TextView tv=(TextView)findViewById(R.id.custom);
	Typeface face=Typeface.createFromAsset(getAssets(),"fonts/mistral.ttf");
	
	tv.setTypeface(face);
	
	TextView tv1=(TextView)findViewById(R.id.custom1);
	Typeface faces=Typeface.createFromAsset(getAssets(),"fonts/mistral.ttf");
	
	tv1.setTypeface(faces);
}
}
