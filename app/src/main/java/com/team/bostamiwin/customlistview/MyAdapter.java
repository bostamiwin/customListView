package com.team.bostamiwin.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    String[]text;
    int[]picture;
    Context context;
    LayoutInflater inflater;
    MyAdapter(Context context,String[]text,int[]picture){
        this.text=text;
        this.context=context;
        this.picture=picture;

    }

    @Override
    public int getCount() {
        return text.length;
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

        if (convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sample_view,parent,false);
        }

        TextView textView=convertView.findViewById(R.id.item_name);
        ImageView imageView=convertView.findViewById(R.id.item_for_image);
        imageView.setImageResource(picture[position]);

        textView.setText(text[position]);

        return convertView;
    }
}
