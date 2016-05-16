package com.shsid.bktronze.cac;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by leslie on 4/16/2016.
 *
 * This solution will change the fonts across the entire activity.
 * But I've read on stackoverflow that is does not work on version 5.0 and above
 *
 */
public class CustomFontApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/Bohemian_typewriter.ttf") // URANIA_CZECH
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}