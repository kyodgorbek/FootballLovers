package com.example.yodgorbekkomilov.footballlovers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yodgorbekkomilov.footballlovers.Pojo.Match;
import com.example.yodgorbekkomilov.footballlovers.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MatchAdapter extends ArrayAdapter<Match> {

    List<Match> matchList;
    public Context context;
    private LayoutInflater mInflater;

    // Constructors
    public MatchAdapter(Context context, List<Match> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        matchList = objects;
    }

    @Override
    public Match getItem(int position) {
        return matchList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Match item = getItem(position);

        vh.textId.setText(item.getId());
        vh.textHomeName.setText(item.getHomeName());

        return vh.rootView;
    }

    private static class ViewHolder {
        public final RelativeLayout rootView;

        public final TextView textId;
        public final TextView textHomeName;

        private ViewHolder(RelativeLayout rootView,  TextView textViewName, TextView textViewEmail) {
            this.rootView = rootView;

            this.textId = textViewName;
            this.textHomeName = textViewEmail;
        }

        public static ViewHolder create(RelativeLayout rootView) {

            TextView textViewName = (TextView) rootView.findViewById(R.id.textViewName);
            TextView textViewEmail = (TextView) rootView.findViewById(R.id.textViewEmail);
            return new ViewHolder(rootView, textViewName, textViewEmail);
        }
    }
}


