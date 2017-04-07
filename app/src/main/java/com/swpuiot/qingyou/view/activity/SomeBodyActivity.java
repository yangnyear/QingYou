package com.swpuiot.qingyou.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.adapter.schoollife.SchoolRecyclerViewAdapter;
import com.swpuiot.qingyou.clicklistener.MyItemClickListener;
import com.swpuiot.qingyou.clicklistener.MyItemLongClickListener;
import com.swpuiot.qingyou.data.EntityList;
import com.swpuiot.qingyou.entities.SchoolLifeEntity;

import java.util.ArrayList;
import java.util.List;

public class SomeBodyActivity extends AppCompatActivity implements MyItemClickListener, MyItemLongClickListener {
    private RecyclerView schoolRecyclerView;
    private List<SchoolLifeEntity> mSchoolLifeEntities;
    private EntityList mEntityList;
    private LinearLayoutManager mLayoutManager;
    private SchoolRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_some_body);
        inite();
        mEntityList.getSchoolEntityList(mSchoolLifeEntities);
        schoolRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new SchoolRecyclerViewAdapter(this, mSchoolLifeEntities);
        schoolRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
        mAdapter.setLongClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    private void inite() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_somebody));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        schoolRecyclerView = (RecyclerView) findViewById(R.id.rcl_school_life);
        mSchoolLifeEntities = new ArrayList<>();
        mEntityList = EntityList.getEntityList();
        mLayoutManager = new LinearLayoutManager(this);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(SomeBodyActivity.this, "点击了第" + (position + 1) + "个商品", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemLongClick(View view, int position) {
        Toast.makeText(SomeBodyActivity.this, "长按了第" + (position + 1) + "个商品", Toast.LENGTH_SHORT).show();

    }
}
