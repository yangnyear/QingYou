package com.swpuiot.qingyou.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.entities.NewsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<NewsEntity> mNewsEntities;

    public NewsAdapter(Context context, List<NewsEntity> newsEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mNewsEntities = newsEntities;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_news, parent, false);
        NewsHolder holder = new NewsHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        holder.newsContent.setText(mNewsEntities.get(position).getNewsContent());
        holder.newsinfor.setText(mNewsEntities.get(position).getNewsInfo());
        holder.newstime.setText(mNewsEntities.get(position).getNewsTime());
        holder.newsLogo.setImageResource(mNewsEntities.get(position).getNewsImageId());
    }

    @Override
    public int getItemCount() {
        return mNewsEntities.size();
    }
}
