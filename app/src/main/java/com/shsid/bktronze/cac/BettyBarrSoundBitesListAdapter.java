package com.shsid.bktronze.cac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Leslie Ruskin on 2016-05-09.
 */
public class BettyBarrSoundBitesListAdapter extends BaseAdapter {

    Context _Context;

    int playSoundIcon = R.drawable.play_sound_icon;

    String [] soundBiteTitles;

    LayoutInflater mInflater;

    public BettyBarrSoundBitesListAdapter(Context _Context) {
        this._Context = _Context;
        String [] _soundBiteTitles = {
                _Context.getString(R.string.betty_barr_sound_bite_title_1_hello),
                _Context.getString(R.string.betty_barr_sound_bite_title_2_food),
                _Context.getString(R.string.betty_barr_sound_bite_title_3_thanks),
                _Context.getString(R.string.betty_barr_sound_bite_title_4_daily_life),
                _Context.getString(R.string.betty_barr_sound_bite_title_5_1945),
                _Context.getString(R.string.betty_barr_sound_bite_title_6_memories),
                _Context.getString(R.string.betty_barr_sound_bite_title_7_home),
                _Context.getString(R.string.betty_barr_sound_bite_title_8_japanese)
        };
        soundBiteTitles = _soundBiteTitles;
        mInflater = (LayoutInflater)_Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return soundBiteTitles.length;
    }

    @Override
    public Object getItem(int position) {
        return soundBiteTitles[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.building_list_cell, parent, false);
        ImageView soundBiteListCellImgV = (ImageView)convertView.findViewById(R.id.buildingListCellImg);
        TextView soundBiteListCellNameV = (TextView)convertView.findViewById(R.id.buildingListCellName);
        soundBiteListCellImgV.setImageResource(playSoundIcon);
        soundBiteListCellNameV.setText(soundBiteTitles[position]);
        return convertView;
    }
}
