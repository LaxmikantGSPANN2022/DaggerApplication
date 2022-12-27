package com.example.daggerapplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UserModule.class})
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
