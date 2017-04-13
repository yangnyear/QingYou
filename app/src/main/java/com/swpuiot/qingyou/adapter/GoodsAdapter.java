package com.swpuiot.qingyou.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.entities.GoodsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * Adapter of HomePage RecyclerView
 */
public class GoodsAdapter extends RecyclerView.Adapter<GoodsHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<GoodsEntity> mGoodsEntities;

    public GoodsAdapter(Context context, List<GoodsEntity> goodsEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mGoodsEntities = goodsEntities;
    }

    @Override
    public GoodsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_goods, parent, false);
        GoodsHolder holder = new GoodsHolder(itemView, mClickListener, mLongClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(GoodsHolder holder, int position) {
        holder.goodsImage.setImageResource(mGoodsEntities.get(position).getGoodsImageId());
        holder.goodsName.setText(mGoodsEntities.get(position).getGoodsName());
        holder.goodsWprth.setText(mGoodsEntities.get(position).getGoodsWorth());
        holder.goodsInformation.setText(mGoodsEntities.get(position).getGoodsInformation());
    }

    @Override
    public int getItemCount() {
        return mGoodsEntities.size();
    }

    public void setClickListener(MyItemClickListener clickListener) {
        this.mClickListener = clickListener;

    }

    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        this.mLongClickListener = longClickListener;
    }
}