package com.shsid.bktronze.cac;

/**
 * Created by BKTronze on 2016-01-24.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BuildingListActivity extends Activity {

    String [] buildingTags = {
            CACConstants.TAG_GATE,
    CACConstants.TAG_ART,
    CACConstants.TAG_CAFE,
    CACConstants.TAG_BARRACKS,
    CACConstants.TAG_ASSEMBLY,
    CACConstants.TAG_POOL,
    CACConstants.TAG_LONGMIAN,
    CACConstants.TAG_XIANMIAN,
    CACConstants.TAG_FINANCE
};

    ListView buildingListContent;

    Intent buildingListIntent;

    @Override
    // Override the default font with a custom-defined font. This is a per-activity setting
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building_list_page);

        findViewById(R.id.buildingListBtnClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buildingListContent = (ListView)findViewById(R.id.buildingListContent);
        buildingListContent.setAdapter(new BuildingListAdapter(this));

        buildingListContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                buildingListIntent = new Intent(BuildingListActivity.this, DescriptionActivity.class);
                buildingListIntent.putExtra(CACConstants.DESC_INTENT_EXTRA_KEY, buildingTags[position]);
                startActivity(buildingListIntent);
            }
        });

    }
}
