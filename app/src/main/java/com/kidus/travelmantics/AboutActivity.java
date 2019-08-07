package com.kidus.travelmantics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageView imageDeveloper = findViewById(R.id.image_developer);
        Picasso.get()
                    .load(R.drawable.image_kidus_worku)
                        .transform(new CircularTransform())
                            .into(imageDeveloper);
    }
}