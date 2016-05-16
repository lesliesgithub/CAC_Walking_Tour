package com.shsid.bktronze.cac;

/**
 * Created by Leslie Ruskin on 2016-05-09
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BettyBarrSoundBitesListActivity extends Activity {

    int [] soundBiteFiles = {
            R.raw.betty_barr_sound_bite_1_hello,
            R.raw.betty_barr_sound_bite_2_food,
            R.raw.betty_barr_sound_bite_3_thank_you,
            R.raw.betty_barr_sound_bite_4_daily_life_in_lunghwa,
            R.raw.betty_barr_sound_bite_5_july_august_1945,
            R.raw.betty_barr_sound_bite_6_my_favorite_memories,
            R.raw.betty_barr_sound_bite_7_my_home_in_g_block,
            R.raw.betty_barr_sound_bite_8_the_japanese
    };

    MediaPlayer mp = null;

    @Override
    // Override the default font with a custom-defined font. This is a per-activity setting
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView soundBitesListContent;
        TextView soundBitesListTitle;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.building_list_page);

        findViewById(R.id.buildingListBtnClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp != null) {
                    mp.release();
                }
                finish();
            }
        });

        soundBitesListContent = (ListView)findViewById(R.id.buildingListContent);
        soundBitesListContent.setAdapter(new BettyBarrSoundBitesListAdapter(this));
        soundBitesListContent.setBackgroundResource(R.drawable.cac_betty_barr_face_1);

        soundBitesListTitle = (TextView)findViewById(R.id.buildingListTitle);
        soundBitesListTitle.setText(R.string.betty_barr_title);
        soundBitesListTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);

        soundBitesListContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mp != null) {
                    mp.release();
                }
                mp = MediaPlayer.create(BettyBarrSoundBitesListActivity.this,
                        soundBiteFiles[position]);
                mp.start();
            }
        });

    }
}
