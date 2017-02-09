package com.shsid.bktronze.cac;

/**
 * Created by BKTronze on 2016-01-24.
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class WelcomeActivity extends Activity {

    @Override
    // Override the default font with a custom-defined font. This is a per-activity setting
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        findViewById(R.id.welcome_btnClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
