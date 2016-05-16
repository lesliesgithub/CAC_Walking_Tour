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
        String buildingTag = descriptionIntent.getStringExtra("building");

        if(buildingTag.equals("cac_btn_gate")) {
            customHtml = "file:///android_asset/cac_desc_gate.html";
            titleTV.setText(R.string.gate_title);
        }
        else if(buildingTag.equals("art")) {
            customHtml = "file:///android_asset/cac_desc_art.html";
                titleTV.setText(R.string.art_title);
            }

            else if(buildingTag.equals("cafeteria")) {
            customHtml = "file:///android_asset/cac_desc_cafe.html";
                titleTV.setText(R.string.cafeteria_title);
            }

            else if(buildingTag.equals("barracks")) {
            customHtml = "file:///android_asset/cac_desc_barracks.html";
                titleTV.setText(R.string.barracks_title);
            }

            else if(buildingTag.equals("assembly")) {
            customHtml = "file:///android_asset/cac_desc_assembly.html";
                titleTV.setText(R.string.assembly_title);
            }

            else if(buildingTag.equals("pool")) {
            customHtml = "file:///android_asset/cac_desc_pool.html";
                titleTV.setText(R.string.pool_title);
            }

            else if(buildingTag.equals("longmian")) {
            customHtml = "file:///android_asset/cac_desc_longmian.html";
                titleTV.setText(R.string.longMian_title);
            }

            else if(buildingTag.equals("xianmian")) {
            customHtml = "file:///android_asset/cac_desc_xianmian.html";
                titleTV.setText(R.string.xianMian_title);
            }

        else if(buildingTag.equals("finance")) {
            customHtml = "file:///android_asset/cac_desc_finance.html";
            titleTV.setText(R.string.finance_title);
        }

        else if(buildingTag.equals("jg")) {
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
