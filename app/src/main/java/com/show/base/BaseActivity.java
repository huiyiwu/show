package com.show.base;

import android.content.Intent;
import android.net.ParseException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.gson.JsonParseException;
import com.gyf.barlibrary.ImmersionBar;
import com.show.AppManager;
import com.show.Constants;
import com.show.R;
import com.vector.update_app.UpdateAppBean;
import com.vector.update_app.UpdateAppManager;
import com.vector.update_app.UpdateCallback;

import org.json.JSONException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;
import retrofit2.HttpException;


/**
 * Created by WE-WIN-027 on 2016/9/27.
 *
 * @des ${TODO}
 */
public abstract class BaseActivity extends SupportActivity {

    public ImmersionBar mImmersionBar;

//    SPUtil mSPUtil;
//    UserStorage mUserStorage;
    protected int page = 1;
    protected int pageSize = 20;
//    LoadingDialog mLoadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initTheme();
        super.onCreate(savedInstanceState);
        setContentView(initContentView());
        setStatusBar();
        ButterKnife.bind(this);
        initUiAndListener();
        AppManager.getAppManager().addActivity(this);
    }

    public void setStatusBar() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.transparentStatusBar()  //透明状态栏，不写默认透明色
                .statusBarDarkFont(false)   //状态栏字体是深色，不写默认为亮色
                .statusBarDarkFont(false, 0f)
                .flymeOSStatusBarFontColorInt(getResources().getColor(R.color.white))
                .init();
    }

    private void initTheme() {

    }

    public void showLoading() {
//        mLoadingDialog = LoadingDialog.show(this, "");
    }

    public void hideLoading() {
//        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
//            mLoadingDialog.dismiss();
//        }
    }


    /**
     * 设置view
     */
    public abstract int initContentView();

    /**
     * init UI && Listener
     */
    public abstract void initUiAndListener();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
        if (mImmersionBar != null) {
            mImmersionBar.destroy();
        }
    }

    /**
     * 打开新的Activity
     *
     * @param cls
     */
    public void openActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    /**
     * 设置返回键
     *
     * @param imageView
     */
    public void setImgBack(ImageView imageView) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void loadError(Throwable throwable) {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    /**
     * 检查版本更新
     */
    public void checkUpdate() {

    }
}
