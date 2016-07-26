package com.feicuiedu.gitdroid.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feicuiedu.gitdroid.R;

import me.relex.circleindicator.CircleIndicator;

/**
 * 作者：yuanchao on 2016/7/26 0026 10:45
 * 邮箱：yuanchao@feicuiedu.com
 */
public class SplashPagerFragment extends Fragment {

    private ViewPager viewPager;
    private SplashPagerAdapter adapter;
    private CircleIndicator indicator; // 指示器

    @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash_pager, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        adapter = new SplashPagerAdapter(getContext());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        // 添加ViewPager监听(为了动画)
        viewPager.addOnPageChangeListener(pageColorListener);
        viewPager.addOnPageChangeListener(phoneViewListener);
    }

    // 主要为了做背景颜色渐变处理
    private ViewPager.OnPageChangeListener pageColorListener = new ViewPager.OnPageChangeListener() {
        @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override public void onPageSelected(int position) {

        }

        @Override public void onPageScrollStateChanged(int state) {

        }
    };

    // 主要为了做"手机"的动画效果处理(平移、缩放、透明度变化)
    private ViewPager.OnPageChangeListener phoneViewListener = new ViewPager.OnPageChangeListener() {
        @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override public void onPageSelected(int position) {

        }

        @Override public void onPageScrollStateChanged(int state) {

        }
    };
}
