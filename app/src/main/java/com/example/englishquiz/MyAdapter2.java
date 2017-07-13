package com.example.englishquiz;


import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter2 extends ArrayAdapter<Item2> {

    ArrayList<Item2> dictionary = new ArrayList<>();

    public MyAdapter2(Context context, int textViewResourceId, ArrayList<Item2> objects) {
        super(context, textViewResourceId, objects);
        dictionary = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items2, null);

        TextView english = (TextView) v.findViewById(R.id.english);
        TextView indonesia = (TextView) v.findViewById(R.id.indonesia);

        english.setText(dictionary.get(position).getEnglish());
        indonesia.setText(dictionary.get(position).getIndonesia());

        return v;
    }
}
