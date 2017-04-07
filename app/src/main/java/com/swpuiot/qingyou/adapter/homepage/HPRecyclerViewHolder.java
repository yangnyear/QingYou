package com.swpuiot.qingyou.adapter.homepage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * ViewHolder of HomePage RecyclerView
 */
public class HPRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
   public ImageView goodsImage;
   public TextView goodsName;
   public TextView goodsWprth;
   public TextView goodsInformation;
   public MyItemClickListener mListener;
   public MyItemLongClickListener mLongClickListener;

    public HPRecyclerViewHolder(View itemView, MyItemClickListener mListener, MyItemLongClickListener mLongClickListener) {
        super(itemView);
        goodsImage = (ImageView) itemView.findViewById(R.id.image_item_goods);
        goodsName = (TextView) itemView.findViewById(R.id.tt_item_name_goodsname);
        goodsWprth = (TextView) itemView.findViewById(R.id.tt_item_goods_worth);
        goodsInformation = (TextView) itemView.findViewById(R.id.tt_item_goods_information);
        this.mLongClickListener = mLongClickListener;
        this.mListener = mListener;
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (mListener != null) {
            mListener.onItemClick(v, getPosition());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (mLongClickListener != null) {
            mLongClickListener.onItemLongClick(v, getPosition());
        }
        return true;
    }
}
