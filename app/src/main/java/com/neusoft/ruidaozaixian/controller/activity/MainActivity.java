package com.neusoft.ruidaozaixian.controller.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.neusoft.ruidaozaixian.R;
import com.neusoft.ruidaozaixian.controller.fragment.HotCourseFragment;
import com.neusoft.ruidaozaixian.controller.fragment.PostCourseFragment;
import com.neusoft.ruidaozaixian.controller.fragment.TeamFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private ArrayList<Fragment> fList = new ArrayList<>();
    private ViewPager viewPager;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        Fragment post = new PostCourseFragment();
        Fragment hot = new HotCourseFragment();
        Fragment team = new TeamFragment();
        fList.add(post);
        fList.add(hot);
        fList.add(team);
        //设置适配器，用于在数据源和组件之间搭建桥梁
        viewPager.setAdapter(new MyAdapter(this.getSupportFragmentManager()));
        //监听单选钮选中改变事件
        radioGroup.setOnCheckedChangeListener(this);
        //监听ViewPager组件中view切换选中事件
        viewPager.addOnPageChangeListener(new MyListener());

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int current = 0;   //用于切换保存Fragment的下标
        switch (checkedId) {
            case R.id.radioButton_post:
                current = 0;
                break;
            case R.id.radioButton_hot:
                current = 1;
                break;
            case R.id.radioButton_team:
                current = 2;
                break;
        }
        if (current != viewPager.getCurrentItem())
            viewPager.setCurrentItem(current);//设置ViewPager中显示的项


    }

    class MyAdapter extends FragmentStatePagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fList.get(position);

        }

        @Override
        public int getCount() {
            return fList.size();
        }
    }

    class MyListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            int current = viewPager.getCurrentItem();
            switch (current) {
                case 0:
                    radioGroup.check(R.id.radioButton_post);
                    break;
                case 1:
                    radioGroup.check(R.id.radioButton_hot);
                    break;
                case 2:
                    radioGroup.check(R.id.radioButton_team);
                    break;

            }


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }


    }
}