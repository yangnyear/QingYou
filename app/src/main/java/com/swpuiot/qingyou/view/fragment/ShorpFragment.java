package com.swpuiot.qingyou.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.adapter.GoodsAdapter;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.data.EntityList;
import com.swpuiot.qingyou.entities.GoodsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * the third page and show goods
 */
public class ShorpFragment extends Fragment implements MyItemClickListener,MyItemLongClickListener {
    private LinearLayoutManager mLayoutManager;
    private RecyclerView goodsRecyclerView;
    private View mView;
    private List<GoodsEntity> mGoodsEntities;
    private GoodsAdapter mAdapter;
    private EntityList mEntityList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(R.layout.fragment_shorp,container,false);
        }
        inite();
        goodsRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter=new GoodsAdapter(getContext(),mGoodsEntities);
        goodsRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
        mAdapter.setLongClickListener(this);
        return mView;
    }
    private void inite(){
        goodsRecyclerView= (RecyclerView) mView.findViewById(R.id.rcl_shorp_goods);
        mLayoutManager=new LinearLayoutManager(getContext());
        mGoodsEntities=new ArrayList<>();
        mEntityList=EntityList.getEntityList();
        mEntityList.getGoodsEntityList(mGoodsEntities);
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onItemLongClick(View view, int position) {

    }
}
