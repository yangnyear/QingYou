package com.swpuiot.qingyou.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.entities.GoodsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * Adapter of HomePage RecyclerView
 */
public class HPRecyclerViewAdapter extends RecyclerView.Adapter<HPRecyclerViewHolder>{
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<GoodsEntity> mGoodsEntities;

    public HPRecyclerViewAdapter(Context context, List<GoodsEntity> goodsEntities) {
        mContext = context;
        mInflater=LayoutInflater.from(context);
        mGoodsEntities = goodsEntities;
    }

    @Override
    public HPRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO: 2017/4/3
        return null;
    }

    @Override
    public void onBindViewHolder(HPRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mGoodsEntities.size();
    }
    public void setClickListener(MyItemClickListener clickListener){
        this.mClickListener=clickListener;

    }
    private void setLongClickListener(MyItemLongClickListener longClickListener){
        this.mLongClickListener=longClickListener;
    }
}
