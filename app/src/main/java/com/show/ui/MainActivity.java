package com.show.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.library.weight.bottombar.MyViewPagerAdapter;
import com.library.weight.bottombar.NoTouchViewPager;
import com.library.weight.bottombar.SpecialTab;
import com.library.weight.bottombar.SpecialTabRound;
import com.show.App;
import com.show.Constants;
import com.show.R;
import com.show.base.BaseActivity;
import com.show.ui.fragment.FirstFragment;
import com.show.ui.fragment.FiveFragment;
import com.show.ui.fragment.FourFragment;
import com.show.ui.fragment.SecondFragment;
import com.show.ui.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.listener.SimpleTabItemSelectedListener;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewPager)
    NoTouchViewPager viewPager;
    @BindView(R.id.pageNavigationView)
    PageNavigationView mPageNavigationView;

    NavigationController navigationController;
    private List<Fragment> mFragments;

    @Override
    public int initContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void initUiAndListener() {
        initFragments();
        initBottomBar();
        checkUpdate();
    }

    /**
     * 初始化底部栏
     */
    private void initBottomBar() {
        navigationController = mPageNavigationView.custom()
                .addItem(newItem(R.mipmap.icon_main_bottom_default_1, R.mipmap.icon_main_bottom_select_1, "first", false))
                .addItem(newItem(R.mipmap.icon_main_bottom_default_2, R.mipmap.icon_main_bottom_select_2, "second", false))
                .addItem(newItem(R.mipmap.icon_main_bottom_3_new, R.mipmap.icon_main_bottom_3_new, "third", true))
                .addItem(newItem(R.mipmap.icon_main_bottom_default_4, R.mipmap.icon_main_bottom_select_4, "four", false))
                .addItem(newItem(R.mipmap.icon_main_bottom_default_5, R.mipmap.icon_main_bottom_select_5, "five", false))
                .build();
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), mFragments));
        //        navigationController.setupWithViewPager(viewPager);

        navigationController.addSimpleTabItemSelectedListener(new SimpleTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                if (index == 2 ) {
                    openActivity(SecondActivity.class);
                } else {
                    viewPager.setCurrentItem(index);
                }
            }
        });
    }

    /**
     * 正常tab
     */
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text, boolean isRound) {
        if (isRound) {
            SpecialTabRound mainTab = new SpecialTabRound(this);
            mainTab.initialize(drawable, checkedDrawable, text);
            mainTab.setTextDefaultColor(0xFF888888);
            mainTab.setTextCheckedColor(0xFF4068fa);
            return mainTab;
        } else {
            SpecialTab mainTab = new SpecialTab(this);
            mainTab.initialize(drawable, checkedDrawable, text);
            mainTab.setTextDefaultColor(0xFF888888);
            mainTab.setTextCheckedColor(0xFF4068fa);
            return mainTab;
        }
    }

    /**
     * 初始化页面
     */
    private void initFragments() {
        mFragments = new ArrayList<>();
        mFragments.add(new FirstFragment());
        mFragments.add(new SecondFragment());
        mFragments.add(new ThirdFragment());
        mFragments.add(new FourFragment());
        mFragments.add(new FiveFragment());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
