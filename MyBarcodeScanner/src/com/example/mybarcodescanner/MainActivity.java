package com.example.mybarcodescanner;
 
import org.apache.cordova.DroidGap;
import android.os.Bundle;
 
public class MainActivity extends DroidGap {
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         //setContentView(R.layout.main_layout);
         super.setIntegerProperty("splashscreen", R.drawable.playback);
         super.loadUrl("file:///android_asset/www/index.html", 3000);
    }
}