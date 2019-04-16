package com.show;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

/**
 * Created by WE-WIN-027 on 2016/6/20.
 *
 * @des ${TODO}
 */
public class AppError implements Thread.UncaughtExceptionHandler {

    private static final String TAG = "AppError";
    protected boolean isSendEmail = false;

    //系统默认的UncaughtException处理类
    protected Thread.UncaughtExceptionHandler mDefaultHandler;

    /*初始化*/
    public void initUncaught() {
        //获取系统默认的UncaughtException处理器
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        //设置该CrashHandler为程序的默认处理器
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /*当UncaughtException发生时会转入该函数来处理*/
    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        if (!handleException(ex) && mDefaultHandler != null) {
            //如果用户没有处理则让系统默认的异常处理器来处理
            mDefaultHandler.uncaughtException(thread, ex);
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //AppException.exc(e).makeToast(AppContext.getContext());
            }
            //退出程序
            AppManager.getAppManager().appExit(App.getContext());
        }
    }

    /**
     * 自定义错误处理,收集错误信息 发送错误报告等操作均在此完成.
     *
     * @param ex
     * @return true:如果处理了该异常信息;否则返回false.
     */
    private boolean handleException(Throwable ex) {
        if (ex == null) {
            return false;
        }
//        ToastUtil.showToast("很抱歉,程序出现异常,即将退出.");
        if(isSendEmail){
            sendErrorInfoMail(ex);
        }
        //保存日志文件
        saveErrorLog(ex);
        return true;
    }

    public void sendErrorInfoMail(Throwable ex){
        StringBuffer sb = new StringBuffer();
        sb.append("--------------------"+(new Date().toLocaleString())+"---------------------\n");
        Writer writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        ex.printStackTrace(printWriter);
        Throwable cause = ex.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            cause = cause.getCause();
        }
        printWriter.close();
        String result = writer.toString();
        sb.append(result);

    }
    /**
     * 保存异常日志
     */
    public void saveErrorLog(Throwable ex) {

    }
}
