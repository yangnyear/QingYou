package com.swpuiot.qingyou.adapter.schoollife;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.entities.SchoolLifeEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/7.
 */
public class SchoolRecyclerViewAdapter extends RecyclerView.Adapter<SchoolRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<SchoolLifeEntity> mSchoolLifeEntities;

    public SchoolRecyclerViewAdapter(Context context, List<SchoolLifeEntity> schoolLifeEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mSchoolLifeEntities = schoolLifeEntities;
    }

    @Override
    public SchoolRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemvIEW = mInflater.inflate(R.layout.item_school_life, parent, false);
        SchoolRecyclerViewHolder holder = new SchoolRecyclerViewHolder(itemvIEW, mClickListener, mLongClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(SchoolRecyclerViewHolder holder, int position) {
        holder.nameTextView.setText(mSchoolLifeEntities.get(position).getName());
        holder.pressionTextView.setText(mSchoolLifeEntities.get(position).getPression());
        holder.starTextView.setText(mSchoolLifeEntities.get(position).getStar());
        holder.loveTextView.setText(mSchoolLifeEntities.get(position).getLove());
        holder.mottoTextView.setText(mSchoolLifeEntities.get(position).getMotto());
        holder.logoImageView.setImageResource(mSchoolLifeEntities.get(position).getLogoId());
    }

    @Override
    public int getItemCount() {
        return mSchoolLifeEntities.size();
    }

    public void setClickListener(MyItemClickListener clickListener) {
        this.mClickListener = clickListener;

    }

    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        this.mLongClickListener = longClickListener;
    }
}
