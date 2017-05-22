package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 18-May-17.
 */

public class NewsAdapter extends ArrayAdapter<MainAdapter> {
    public NewsAdapter(Context context, ArrayList<MainAdapter> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_news_list_item, parent, false);
        }

        MainAdapter currentWord = getItem(position);

        ImageView newsImage = (ImageView) listItemView.findViewById(R.id.headline_image);
        newsImage.setImageResource(currentWord.getNewsImage());

        TextView newsHeadline = (TextView) listItemView.findViewById(R.id.headline_text);
        newsHeadline.setText(currentWord.getNewsHeadline());

        TextView newsDetails = (TextView) listItemView.findViewById(R.id.headline_details);
        newsDetails.setText(currentWord.getNewsDetailed());

        return listItemView;
    }

}
