package com.rjdeleon.advancedandroid.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/* @Module indicates that this class is a provider of dependencies */
@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    /* @Provides tells Dagger that his method is providing a dependency*/
    @Provides
    Context provideApplicationContext() {
        return application;
    }
}
