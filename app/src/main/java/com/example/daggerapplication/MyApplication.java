package com.example.daggerapplication;

import android.app.Application;

public class MyApplication extends Application {

    private MyFreshComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .userModule(new UserModule())
                .build();
    }

    public MyComponent getMyComponent(){
        return myComponent;
    }
}
