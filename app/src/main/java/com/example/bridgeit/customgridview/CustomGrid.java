package com.example.bridgeit.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bridgeit on 3/11/16.
 */

public class CustomGrid extends BaseAdapter {

    private Context context;
    private final String[] web;
    private final int[] imageId;

    public CustomGrid(Context context, String[] web, int[] imageId) {
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return web.length;
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

        View grid;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.custom_grid,null);
            TextView textView = (TextView)grid.findViewById(R.id.text_view);
            ImageView imageView = (ImageView)grid.findViewById(R.id.image_view);
            textView.setText(web[position]);
            imageView.setImageResource(imageId[position]);

        } else {
            grid = (View) convertView;
        }
        return grid;
    }
}
