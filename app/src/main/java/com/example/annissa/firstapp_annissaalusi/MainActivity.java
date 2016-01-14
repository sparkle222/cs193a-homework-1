package com.example.annissa.firstapp_annissaalusi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectionMade(View view) {
        int imageId = view.getId();
        ImageButton img = (ImageButton) findViewById(R.id.myImage);
        if (imageId == R.id.innocent) {
            img.setImageResource(R.drawable.dove);
        } else if (imageId == R.id.playful) {
            img.setImageResource(R.drawable.monkey);
        } else if (imageId == R.id.sneaky) {
            img.setImageResource(R.drawable.fox);
        } else {
            img.setImageResource(R.drawable.possum);
        }
    }
}

