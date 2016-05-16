package com.shsid.bktronze.cac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BKTronze on 2016-01-24.
 */
public class BuildingListAdapter extends BaseAdapter {

    Context _Context;

    int [] buildingPictures = {
            R.drawable.cac_btn_gate, R.drawable.cac_btn_art, R.drawable.cac_btn_cafeteria, R.drawable.cac_btn_barraks, R.drawable.cac_btn_assembly, R.drawable.cac_btn_pool, R.drawable.cac_btn_longmen, R.drawable.cac_btn_xianmian, R.drawable.cac_btn_finance
    };

    String [] buildingNames;

    LayoutInflater mInflater;

    public BuildingListAdapter(Context _Context) {
        this._Context = _Context;
        String [] _buildingNames = {_Context.getString(R.string.gate_title),
                _Context.getString(R.string.art_title),
                _Context.getString(R.string.cafeteria_title),
                _Context.getString(R.string.barracks_title),
                _Context.getString(R.string.assembly_title),
                _Context.getString(R.string.pool_title),
                _Context.getString(R.string.longMian_title),
                _Context.getString(R.string.xianMian_title),
                _Context.getString(R.string.finance_title)
        };
        buildingNames = _buildingNames;
        mInflater = (LayoutInflater)_Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return buildingNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.building_list_cell, parent, false);
        ImageView buildingListCellImg = (ImageView)convertView.findViewById(R.id.buildingListCellImg);
        TextView buildingListCellName = (TextView)convertView.findViewById(R.id.buildingListCellName);
        buildingListCellImg.setImageResource(buildingPictures[position]);
        buildingListCellName.setText(buildingNames[position]);
        return convertView;
    }
}
