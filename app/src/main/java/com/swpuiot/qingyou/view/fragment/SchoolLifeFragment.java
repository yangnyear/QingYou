package com.swpuiot.qingyou.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.view.activity.SomeBodyActivity;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * the last page of this app and it is used to show school life of students
 */
public class SchoolLifeFragment extends Fragment implements View.OnClickListener {
    private LinearLayout someBody;
    private View mView;

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
        someBody.setOnClickListener(this);
        return mView;
    }

    private void inite() {
        someBody = (LinearLayout) mView.findViewById(R.id.ll_school_life_buty);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.ll_school_life_buty:
                intent=new Intent(getContext(), SomeBodyActivity.class);
                startActivity(intent);
        }
    }
}
