package com.shsid.bktronze.cac;

/**
 * Created by BKTronze on 2016-01-24.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DescriptionActivity extends Activity {

    @Override
    // Override the default font with a custom-defined font. This is a per-activity setting
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.building_description_web_layout);
        TextView titleTV = (TextView)findViewById(R.id.descriptionTitle);

        WebView webView = (WebView) findViewById(R.id.buildingDescriptionWebView);
        String customHtml = "";

        Intent descriptionIntent = new Intent(this.getIntent());
        String buildingTag = descriptionIntent.getStringExtra(CACConstants.DESC_INTENT_EXTRA_KEY);

        if(buildingTag.equals(CACConstants.TAG_GATE)) {
            customHtml = "file:///android_asset/cac_desc_gate.html";
            titleTV.setText(R.string.gate_title);
        }
        else if(buildingTag.equals(CACConstants.TAG_ART)) {
            customHtml = "file:///android_asset/cac_desc_art.html";
                titleTV.setText(R.string.art_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_CAFE)) {
            customHtml = "file:///android_asset/cac_desc_cafe.html";
                titleTV.setText(R.string.cafeteria_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_BARRACKS)) {
            customHtml = "file:///android_asset/cac_desc_barracks.html";
                titleTV.setText(R.string.barracks_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_ASSEMBLY)) {
            customHtml = "file:///android_asset/cac_desc_assembly.html";
                titleTV.setText(R.string.assembly_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_POOL)) {
            customHtml = "file:///android_asset/cac_desc_pool.html";
                titleTV.setText(R.string.pool_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_LONGMIAN)) {
            customHtml = "file:///android_asset/cac_desc_longmian.html";
                titleTV.setText(R.string.longMian_title);
            }

            else if(buildingTag.equals(CACConstants.TAG_XIANMIAN)) {
            customHtml = "file:///android_asset/cac_desc_xianmian.html";
                titleTV.setText(R.string.xianMian_title);
            }

        else if(buildingTag.equals(CACConstants.TAG_FINANCE)) {
            customHtml = "file:///android_asset/cac_desc_finance.html";
            titleTV.setText(R.string.finance_title);
        }

        else if(buildingTag.equals(CACConstants.TAG_CREDITS)) {
            customHtml = "file:///android_asset/cac_credits.html";
            titleTV.setText(R.string.credits_title);
        }

        else if(buildingTag.equals(CACConstants.TAG_JG)) {
            customHtml = "file:///android_asset/cac_desc_jg.html";
            titleTV.setText(R.string.jg_title);
        }

        //webView.loadDataWithBaseURL("file:///android_asset/", customHtml, "text/html", "UTF-8", null);
        webView.loadUrl(customHtml);

            findViewById(R.id.descriptionBtnClose).setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    finish();
            }
        });
    }
}
