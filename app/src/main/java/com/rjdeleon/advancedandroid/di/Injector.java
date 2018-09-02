package com.rjdeleon.advancedandroid.di;

import android.app.Activity;

import com.rjdeleon.advancedandroid.base.BaseActivity;

public class Injector {

    private Injector() {

    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
