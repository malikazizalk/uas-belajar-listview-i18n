package com.uts.uts_aboutworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import com.uts.uts_aboutworld.news.HotNew;

public class TopikBeritaAdapter extends ArrayAdapter<HotNew> {
    Context context;

    public TopikBeritaAdapter(Context context, List<HotNew> hotnews) {
        super(context, R.layout.list_berita, hotnews);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textBerita;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HotNew hotnew = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_berita, parent, false);
            viewHolder.textBerita =  convertView.findViewById(R.id.row_text_topik);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_berita);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textBerita.setText(hotnew.getTopic());
        viewHolder.textAsal.setText(hotnew.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(hotnew.getDrawableRes()));
        return convertView;
    }
}
