package com.example.daggerapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    @Provides
    @Singleton
    public User providesUserObject(){
        return new User("Lars", "Vogel");
    }
}
