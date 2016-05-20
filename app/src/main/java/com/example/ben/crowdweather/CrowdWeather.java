package com.example.ben.crowdweather;

import com.firebase.client.Firebase;

/**
 * Created by ben on 2016/5/20.
 */
public class CrowdWeather extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
