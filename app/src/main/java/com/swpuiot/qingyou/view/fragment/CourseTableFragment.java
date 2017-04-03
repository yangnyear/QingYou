package com.swpuiot.qingyou.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.qingyou.R;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * the second page of this app and it is used to show course table
 */
public class CourseTableFragment extends Fragment {
    private View mView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView==null){
            mView=inflater.inflate(R.layout.fragment_coursetable,container,false);
        }
        return mView;
    }
}
