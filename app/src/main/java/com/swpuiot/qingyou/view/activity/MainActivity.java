package com.swpuiot.qingyou.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.swpuiot.qingyou.R;
import com.swpuiot.qingyou.data.EntityList;
import com.swpuiot.qingyou.view.fragment.CourseTableFragment;
import com.swpuiot.qingyou.view.fragment.HomepageFragment;
import com.swpuiot.qingyou.view.fragment.ReportFragment;
import com.swpuiot.qingyou.view.fragment.SchoolLifeFragment;
import com.swpuiot.qingyou.view.fragment.ShorpFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private HomepageFragment mHomepageFragment;
    private CourseTableFragment mCourseTableFragment;
    private ReportFragment mReportFragment;
    private ShorpFragment mShorpFragment;
    private SchoolLifeFragment mSchoolLifeFragment;
    private FragmentManager mFragmentManager;
    private DrawerLayout MDrawerLayout;
    private RadioGroup mRadioGroup;
    private EntityList mEntityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        Fresco.initialize(MainActivity.this);
        setContentView(R.layout.activity_main);
        inite();
    }

    public void inite() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_main));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.abc_ic_menu_selectall_mtrl_alpha);
        MDrawerLayout = (DrawerLayout) findViewById(R.id.dl_main_drawer);

        mHomepageFragment = new HomepageFragment();
        mCourseTableFragment = new CourseTableFragment();
        mReportFragment = new ReportFragment();
        mShorpFragment = new ShorpFragment();
        mSchoolLifeFragment = new SchoolLifeFragment();

        mRadioGroup = (RadioGroup) findViewById(R.id.rdg_main);
        findViewById(R.id.rdb_homepage).setOnClickListener(this);
        findViewById(R.id.rdb_course_table).setOnClickListener(this);
        findViewById(R.id.rdb_shorp).setOnClickListener(this);
        findViewById(R.id.rdb_report).setOnClickListener(this);
        findViewById(R.id.rdb_school_life).setOnClickListener(this);

        mFragmentManager = getSupportFragmentManager();
        mRadioGroup.check(R.id.rdb_homepage);
        mFragmentManager.beginTransaction()
                .add(R.id.fl_fragmentcontener, mHomepageFragment)
                .add(R.id.fl_fragmentcontener, mCourseTableFragment)
                .add(R.id.fl_fragmentcontener, mReportFragment)
                .add(R.id.fl_fragmentcontener, mShorpFragment)
                .add(R.id.fl_fragmentcontener, mSchoolLifeFragment)
                .hide(mSchoolLifeFragment)
                .hide(mCourseTableFragment)
                .hide(mReportFragment)
                .hide(mShorpFragment)
                .show(mHomepageFragment).commit();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                MDrawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdb_homepage:
                mFragmentManager.beginTransaction()
                        .hide(mSchoolLifeFragment)
                        .hide(mCourseTableFragment)
                        .hide(mReportFragment)
                        .hide(mShorpFragment)
                        .show(mHomepageFragment).commit();
                break;
            case R.id.rdb_course_table:
                mFragmentManager.beginTransaction()
                        .hide(mHomepageFragment)
                        .hide(mSchoolLifeFragment)
                        .hide(mReportFragment)
                        .hide(mShorpFragment)
                        .show(mCourseTableFragment).commit();
                break;
            case R.id.rdb_shorp:
                mFragmentManager.beginTransaction()
                        .hide(mHomepageFragment)
                        .hide(mCourseTableFragment)
                        .hide(mReportFragment)
                        .hide(mSchoolLifeFragment)
                        .show(mShorpFragment).commit();
                break;
            case R.id.rdb_report:
                mFragmentManager.beginTransaction()
                        .hide(mSchoolLifeFragment)
                        .hide(mCourseTableFragment)
                        .hide(mHomepageFragment)
                        .hide(mShorpFragment)
                        .show(mReportFragment).commit();
                break;
            case R.id.rdb_school_life:
                mFragmentManager.beginTransaction()
                        .hide(mHomepageFragment)
                        .hide(mCourseTableFragment)
                        .hide(mReportFragment)
                        .hide(mShorpFragment)
                        .show(mSchoolLifeFragment).commit();
                break;
        }
    }
}