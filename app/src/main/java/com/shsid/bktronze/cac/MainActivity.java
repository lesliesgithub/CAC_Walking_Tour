package com.shsid.bktronze.cac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by BKTronze on 2016-01-24.
 */
public class MainActivity extends Activity {

    ZoomLayout mainMap;
    Intent mainIntent;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        mainMap = (ZoomLayout)findViewById(R.id.mainMap);

        MainClick mainClick = new MainClick();

        findViewById(R.id.btnArt).setOnClickListener(mainClick);
        findViewById(R.id.btnAuditorium).setOnClickListener(mainClick);
        findViewById(R.id.btnFinance).setOnClickListener(mainClick);
        findViewById(R.id.btnLongmian).setOnClickListener(mainClick);
        findViewById(R.id.btnXianmian).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnAbout).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnList).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnBettyBarr).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnJG).setOnClickListener(mainClick);

    }

    public class MainClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btnArt:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "art");
                    startActivity(mainIntent);
                    break;

                case R.id.btnAuditorium:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "auditorium");
                    startActivity(mainIntent);
                    break;

                case R.id.btnFinance:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "finance");
                    startActivity(mainIntent);
                    break;

                case R.id.btnLongmian:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "longmian");
                    startActivity(mainIntent);
                    break;

                case R.id.btnXianmian:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "xianmian");
                    startActivity(mainIntent);
                    break;

                case R.id.mainBtnAbout:
                    mainIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(mainIntent);
                    break;

                case R.id.mainBtnList:
                    mainIntent = new Intent(MainActivity.this, BuildingListActivity.class);
                    startActivity(mainIntent);
                    break;

                case R.id.mainBtnBettyBarr:
                    mainIntent = new Intent(MainActivity.this, BettyBarrSoundBitesListActivity.class);
                    startActivity(mainIntent);
                    break;

                case R.id.mainBtnJG:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra("building", "jg");
                    startActivity(mainIntent);
                    break;

            }
        }
    }

}
