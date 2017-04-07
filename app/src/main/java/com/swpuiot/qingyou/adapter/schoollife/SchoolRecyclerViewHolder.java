package com.swpuiot.qingyou.adapter.schoollife;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/4/7.
 * RecyclerViewHolder for School life RecyclerView
 */
public class SchoolRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView nameTextView;
    public TextView pressionTextView;
    public TextView starTextView;
    public TextView loveTextView;
    public TextView mottoTextView;
    public ImageView logoImageView;
    public MyItemClickListener mListener;
    public MyItemLongClickListener mLongClickListener;

    public SchoolRecyclerViewHolder(View itemView, MyItemClickListener mListener, MyItemLongClickListener mLongClickListener) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.tt_nameofds);
        pressionTextView = (TextView) itemView.findViewById(R.id.tt_schoollife_pression);
        starTextView = (TextView) itemView.findViewById(R.id.tt_star);
        loveTextView= (TextView) itemView.findViewById(R.id.tt_love);
        mottoTextView= (TextView) itemView.findViewById(R.id.tt_motto);
        logoImageView= (ImageView) itemView.findViewById(R.id.image_dslogo);
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
