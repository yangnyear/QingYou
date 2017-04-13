package com.swpuiot.qingyou.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.swpuiot.qingyou.R;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 */
public class NewsHolder extends RecyclerView.ViewHolder {
    public TextView newsContent;
    public TextView newsinfor;
    public ImageView newsLogo;
    public TextView newstime;
    public NewsHolder(View itemView) {
        super(itemView);
        newsContent= (TextView) itemView.findViewById(R.id.tt_item_name_news);
        newsinfor= (TextView) itemView.findViewById(R.id.tt_item_news_information);
        newsLogo= (ImageView) itemView.findViewById(R.id.image_news_logo);
        newstime= (TextView) itemView.findViewById(R.id.tt_item_news_time);
    }
}
