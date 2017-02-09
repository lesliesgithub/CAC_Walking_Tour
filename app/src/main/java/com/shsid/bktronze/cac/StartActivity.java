package com.shsid.bktronze.cac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class StartActivity extends Activity {

    @Override
    // Override the default font with a custom-defined font. This is a per-activity setting
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        findViewById(R.id.callMainActivityButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(startIntent);
                finish();
            }
        });

//        Animation logoAnimation = AnimationUtils.loadAnimation(this, R.anim.start_page_logo_pop_up);
//        RelativeLayout startPage = (RelativeLayout)findViewById(R.id.start_page);
//        startPage.setAnimation(logoAnimation);
//
//        logoAnimation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                Intent startIntent = new Intent(StartActivity.this, MainActivity.class);
//                startActivity(startIntent);
//                finish();
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });

    }

}
