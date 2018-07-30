package com.easy.imageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.easyzoom.EasyZoomImageViewer;


public class MainActivity extends AppCompatActivity {

    EasyZoomImageViewer image;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imgFullScreen);

        image.with(R.drawable.demo);
    }
}