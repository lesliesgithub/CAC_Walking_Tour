package com.shsid.bktronze.cac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        if (hasFocus) {
//            setContentView(R.layout.main_page);
//            scaleContents((RelativeLayout) findViewById(R.id.ContentView),
//                    (FrameLayout) findViewById(R.id.ContainerView));
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        mainMap = (ZoomLayout)findViewById(R.id.mainMapZoomView);

        MainClick mainClick = new MainClick();

        findViewById(R.id.btn1Gate).setOnClickListener(mainClick);
        findViewById(R.id.btn2Art).setOnClickListener(mainClick);
        findViewById(R.id.btn3Cafe).setOnClickListener(mainClick);
        findViewById(R.id.btn6Assembly).setOnClickListener(mainClick);
        findViewById(R.id.btn5Pool).setOnClickListener(mainClick);
        findViewById(R.id.btn4Barracks).setOnClickListener(mainClick);
        findViewById(R.id.btn9Finance).setOnClickListener(mainClick);
        findViewById(R.id.btn7Longmian).setOnClickListener(mainClick);
        findViewById(R.id.btn8Xianmian).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnAbout).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnList).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnBettyBarr).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnJG).setOnClickListener(mainClick);
        findViewById(R.id.mainBtnCredits).setOnClickListener(mainClick);

    }

    public class MainClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btn1Gate:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_GATE);
                    startActivity(mainIntent);
                    break;

                case R.id.btn2Art:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_ART);
                    startActivity(mainIntent);
                    break;

                case R.id.btn3Cafe:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_CAFE);
                    startActivity(mainIntent);
                    break;

                case R.id.btn4Barracks:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_BARRACKS);
                    startActivity(mainIntent);
                    break;

                case R.id.btn6Assembly:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_ASSEMBLY);
                    startActivity(mainIntent);
                    break;

                case R.id.btn5Pool:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_POOL);
                    startActivity(mainIntent);
                    break;

                case R.id.btn7Longmian:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_LONGMIAN);
                    startActivity(mainIntent);
                    break;

                case R.id.btn8Xianmian:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_XIANMIAN);
                    startActivity(mainIntent);
                    break;

                case R.id.btn9Finance:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_FINANCE);
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

                case R.id.mainBtnCredits:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_CREDITS);
                    startActivity(mainIntent);
                    break;

                case R.id.mainBtnJG:
                    mainIntent = new Intent(MainActivity.this, DescriptionActivity.class);
                    mainIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, CACConstants.TAG_JG);
                    startActivity(mainIntent);
                    break;

            }
        }
    }


    // Scales the contents of the given view so that it completely fills the given
    // container on one axis (that is, we're scaling isotropically).
    private void scaleContents(View rootView, View container)
    {
        // Compute the scaling ratio
        float xScale = (float)container.getWidth() / rootView.getWidth();
        float yScale = (float)container.getHeight() / rootView.getHeight();
        float scale = Math.min(xScale, yScale);
        // Scale our contents
        scaleViewAndChildren(rootView, scale);
    }
    // Scale the given view, its contents, and all of its children by the given factor.
    public static void scaleViewAndChildren(View root, float scale)
    {
        // Retrieve the view's layout information
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        // Scale the view itself
        if (layoutParams.width != ViewGroup.LayoutParams.FILL_PARENT &&
                layoutParams.width != ViewGroup.LayoutParams.WRAP_CONTENT)
        {
            layoutParams.width *= scale;
        }
        if (layoutParams.height != ViewGroup.LayoutParams.FILL_PARENT &&
                layoutParams.height != ViewGroup.LayoutParams.WRAP_CONTENT)
        {
            layoutParams.height *= scale;
        }
        // If this view has margins, scale those too
        if (layoutParams instanceof ViewGroup.MarginLayoutParams)
        {
            ViewGroup.MarginLayoutParams marginParams =
                    (ViewGroup.MarginLayoutParams)layoutParams;
            marginParams.leftMargin *= scale;
            marginParams.rightMargin *= scale;
            marginParams.topMargin *= scale;
            marginParams.bottomMargin *= scale;
        }
        // Set the layout information back into the view
        root.setLayoutParams(layoutParams);
        // Scale the view's padding
        root.setPadding(
                (int)(root.getPaddingLeft() * scale),
                (int)(root.getPaddingTop() * scale),
                (int)(root.getPaddingRight() * scale),
                (int)(root.getPaddingBottom() * scale));
        // If the root view is a TextView, scale the size of its text
        if (root instanceof TextView)
        {
            TextView textView = (TextView)root;
            textView.setTextSize(textView.getTextSize() * scale);
        }
        // If the root view is a ViewGroup, scale all of its children recursively
        if (root instanceof ViewGroup)
        {
            ViewGroup groupView = (ViewGroup)root;
            for (int cnt = 0; cnt < groupView.getChildCount(); ++cnt)
                scaleViewAndChildren(groupView.getChildAt(cnt), scale);
        }
    }

}
