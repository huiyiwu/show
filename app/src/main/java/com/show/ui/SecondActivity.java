package com.show.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.show.R;
import com.show.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends BaseActivity {
    @BindView(R.id.img_scan)
    ImageView imgScan;
    @BindView(R.id.ly_back)
    RelativeLayout lyBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.img_right)
    ImageView imgRight;
    @BindView(R.id.rl_right)
    RelativeLayout rlRight;

    @Override
    public int initContentView() {
        return R.layout.activity_second;
    }

    @Override
    public void initUiAndListener() {
        tvTitle.setText("Second");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ly_back)
    public void onViewClicked() {
        finish();
    }
}
