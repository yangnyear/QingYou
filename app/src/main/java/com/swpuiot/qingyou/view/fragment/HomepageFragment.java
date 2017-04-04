package com.swpuiot.qingyou.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.adapter.HPRecyclerViewAdapter;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.data.BannerLoader;
import com.swpuiot.qingyou.data.EntityList;
import com.swpuiot.qingyou.entities.GoodsEntity;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * the first page in this app
 */
public class HomepageFragment extends Fragment implements MyItemClickListener,MyItemLongClickListener{
    private View mView;
    private RecyclerView mRecyclerView;
    private List<GoodsEntity> mGoodsEntities;
    private List<Integer> imageList;
    private HPRecyclerViewAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    private Banner banner;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView= inflater.inflate(R.layout.fragment_homepage,container,false);
        }
        init();
        mAdapter.setClickListener(this);
        mAdapter.setLongClickListener(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        //图片轮播
        if (banner != null)
            banner.setImageLoader(BannerLoader.getBannerLoader())
                    .setImages(imageList)
                    .isAutoPlay(false)
                    .start();
        return mView;
    }
    private void init(){
        banner = (Banner) mView.findViewById(R.id.banner);
        mRecyclerView= (RecyclerView) mView.findViewById(R.id.rcl_homepage_goods);
        mGoodsEntities=new ArrayList<>();
        EntityList.getGoodsEntityList(mGoodsEntities);
        imageList=new ArrayList<>();
        EntityList.getImages(imageList);
        mAdapter=new HPRecyclerViewAdapter(getContext(),mGoodsEntities);
        mLayoutManager=new LinearLayoutManager(getContext());
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getContext(),"点击了第"+(position+1)+"个商品",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemLongClick(View view, int position) {
        Toast.makeText(getContext(),"长按了第"+(position+1)+"个商品",Toast.LENGTH_SHORT).show();
    }
}
