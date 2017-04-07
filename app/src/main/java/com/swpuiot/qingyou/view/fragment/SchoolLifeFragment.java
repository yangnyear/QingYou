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
import com.swpuiot.qingyou.adapter.schoollife.SchoolRecyclerViewAdapter;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.data.EntityList;
import com.swpuiot.qingyou.entities.SchoolLifeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * the last page of this app and it is used to show school life of students
 */
public class SchoolLifeFragment extends Fragment implements MyItemClickListener, MyItemLongClickListener {
    private RecyclerView schoolRecyclerView;
    private List<SchoolLifeEntity> mSchoolLifeEntities;
    private EntityList mEntityList;
    private View mView;
    private LinearLayoutManager mLayoutManager;
    private SchoolRecyclerViewAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_shoollife, container, false);
        }
        inite();
        mEntityList.getSchoolEntityList(mSchoolLifeEntities);
        schoolRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new SchoolRecyclerViewAdapter(getContext(), mSchoolLifeEntities);
        schoolRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
        mAdapter.setLongClickListener(this);
        return mView;
    }

    private void inite() {
        schoolRecyclerView = (RecyclerView) mView.findViewById(R.id.rcl_school_life);
        mSchoolLifeEntities=new ArrayList<>();
        mEntityList = EntityList.getEntityList();
        mLayoutManager = new LinearLayoutManager(getContext());
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getContext(), "点击了第" + (position + 1) + "个商品", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemLongClick(View view, int position) {
        Toast.makeText(getContext(), "长按了第" + (position + 1) + "个商品", Toast.LENGTH_SHORT).show();

    }
}
