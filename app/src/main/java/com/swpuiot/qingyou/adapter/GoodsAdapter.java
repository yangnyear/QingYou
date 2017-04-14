package com.swpuiot.qingyou.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.entities.GoodsEntity;
import com.swpuiot.qingyou.entities.GoodsHeadEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * Adapter of HomePage RecyclerView
 */
public class GoodsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<GoodsEntity> mGoodsEntities;
    private List<GoodsHeadEntity> mGoodsHeadEntities;

    public enum ITEM_TYPE {
        ITEM1,
        ITEM2
    }

    public GoodsAdapter(Context context, List<GoodsEntity> goodsEntities,List<GoodsHeadEntity> mGoodsHeadEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        this.mGoodsHeadEntities=mGoodsHeadEntities;
        mGoodsEntities = goodsEntities;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        if (viewType ==  ITEM_TYPE.ITEM1.ordinal()) {
            itemView = mInflater.inflate(R.layout.item_goods, parent, false);
            return new GoodsHolder(itemView, mClickListener, mLongClickListener);
        } else {
            itemView =mInflater.inflate(R.layout.item_goods_head,parent,false);
            return new GoodsListHeadHolder(itemView,mClickListener,mLongClickListener);
        }


    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? ITEM_TYPE.ITEM2.ordinal():ITEM_TYPE.ITEM1.ordinal() ;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof GoodsHolder) {
            ((GoodsHolder)holder).goodsImage.setImageResource(mGoodsEntities.get((position/2)).getGoodsImageId());
            ((GoodsHolder)holder).goodsName.setText(mGoodsEntities.get((position/2)).getGoodsName());
            ((GoodsHolder)holder).goodsWprth.setText(mGoodsEntities.get((position/2)).getGoodsWorth());
            ((GoodsHolder)holder).goodsInformation.setText(mGoodsEntities.get((position/2)).getGoodsInformation());
        } else if (holder instanceof GoodsListHeadHolder) {
            ((GoodsListHeadHolder) holder).headImage.setImageResource(mGoodsHeadEntities.get((position)/2).getHeadLogoId());
            ((GoodsListHeadHolder) holder).headTime.setText(mGoodsHeadEntities.get((position)/2).getHeadTime());
            ((GoodsListHeadHolder) holder).headContent.setText(mGoodsHeadEntities.get((position)/2).getHeadContent());
            ((GoodsListHeadHolder) holder).headPeitu.setImageResource(mGoodsHeadEntities.get((position)/2).getHeadImageId());
        }

    }


    @Override
    public int getItemCount() {
        return mGoodsEntities.size()+mGoodsHeadEntities.size();
    }

    public void setClickListener(MyItemClickListener clickListener) {
        this.mClickListener = clickListener;

    }

    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        this.mLongClickListener = longClickListener;
    }
}

class GoodsListHeadHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public SimpleDraweeView headImage;
    public TextView headTime;
    public TextView headContent;
    public SimpleDraweeView headPeitu;
    public MyItemClickListener mListener;
    public MyItemLongClickListener mLongClickListener;

    public GoodsListHeadHolder(View itemView,MyItemClickListener mListener, MyItemLongClickListener mLongClickListener) {
        super(itemView);
        this.mLongClickListener = mLongClickListener;
        this.mListener = mListener;
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
        headImage = (SimpleDraweeView) itemView.findViewById(R.id.image_goods_head_logo);
        headTime = (TextView) itemView.findViewById(R.id.tt_goods_head_time);
        headContent = (TextView) itemView.findViewById(R.id.tt_goods_head_content);
        headPeitu = (SimpleDraweeView) itemView.findViewById(R.id.image_goods_head_peitu);
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