package com.example.recyclerview;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GaleryActivity extends AppCompatActivity {
    private static final String TAG = "GaleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_layout);
        Log.d(TAG, "onCreate: started");

        getIncomingIntent();


    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking incoming intents");
        if (getIntent().hasExtra("img_url") && getIntent().hasExtra("img_name")){
            Log.d(TAG, "getIncomingIntent: found intent extra");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl,imageName);

        }
    }

    private void setImage(String imageUrl, String imageName){
        Log.d(TAG, "setImage: setting image and name to widgets");

        TextView name = findViewById(R.id.imgDisc);
        name.setText(imageName);


    }



}
