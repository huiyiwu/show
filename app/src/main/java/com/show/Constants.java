package com.show;

/**
 * Created by Administrator on 2018/12/25 0025.
 */

public class Constants {

    public static final int OK = 0;
    public static final String BASE_URL = "https://ws01.library.sh.cn/mservices/";
    public static final String LH_LOG_PATH = "/Log/";
    public static final int TOKEN_EXPIRED = 0;
    public static final String ORGNAME = "shlib";

    //上海图书馆地址location ： sl
    public static final String COLLECTION_LOCATION_SL = "sl";
    //忘记密码页面
    public static final String URL_FORGET_PWD = "https://passport.library.sh.cn:4430/rs/register/getpass_index";
    //咨询
    public static final String URL_CONSULT = "http://shlibrary.faqrobot.cn/robot/h5chat.html?sysNum=148997688742318882&tdsourcetag=s_pctim_aiomsg";
    //帮助中心
    public static final String URL_HELP_CENTER = "file:///android_asset/web/help.html";
    //APP更新地址
    public static final String UPDATE_URL = "https://ws01.library.sh.cn/epubfile/apps/shlib.app.android.xml";
    //    public static final String UPDATE_URL = "http://www.we-win.com.cn/shlibrary/shlib.app.android.xml";
    //馆藏信息图书状态
    public static final String COLLECTION_BOOK_STATUS_I = "i";//归还
    public static final String COLLECTION_BOOK_STATUS_DMG = "dmg";//破损
    public static final String COLLECTION_BOOK_STATUS_O = "o";//借出
    public static final String COLLECTION_BOOK_STATUS_T = "t";//编目中
    public static final String COLLECTION_BOOK_STATUS_M = "m";//馆藏丢失
    //馆藏信息资料类型
    public static final String COLLECTION_TYPE_PJ = "pj";//普通外借资料
    public static final String COLLECTION_TYPE_BS = "bs";//保存资料
    public static final String COLLECTION_TYPE_EW = "ew";//少儿外借资料
    public static final String COLLECTION_TYPE_YL = "yl";//仅供阅览资料
    public static final String COLLECTION_TYPE_CJ = "cj";//参考外借资料

    public static String app_key = "shlib.app.android.shl.v1";
    public static String app_value = "41D3A45EB355B2EAFA8F9D2F00BBF0B2FC5FD488";
    //重用的参数
    public static String appid = "shlib.app.android.shl.v1";
    public static String TYPE_AAT = "aat";
    public static String TYPE_UAT = "uat";
    public static String TYPE_UAT_1 = "uat_1";
    public static String TYPE_UAT_7 = "uat_7";
    public static String APP_NAME = "shlib";
    //接口APIId
    public static final String SEARCH_APIID = "shlib.solr.search";
    public static final String DETAIL_APIID = "shlib.books.infobyids";
    public static final String COLLECTION_APIID = "shlib.bookcollection";
    public static final String BANNER_APIID = "shlib.serverinfo.carouselfigure";
    public static final Object LOSSANDFIND_APPID = "shlib.auth.lossandfind";
    public static final Object NEAR_LIBARAY_APPID = "shlib.libs.info";
    public static final Object LIBARAY_DETAIL_APPID = "shlib.libs.libidinfo";
    public static final Object MESSAGE_LIST_APPID = "shlib.app.message.getlist";
    public static final Object MESSAGE_UNREAD_COUNT_APPID = "shlib.app.message.getunread";
    public static final  Object MESSAGE_DETAIL_APPID = "shlib.app.message.info";
    public static final  Object MESSAGE_DELETE_APPID = "shlib.app.message.delete";
    public static final  Object MESSAGE_READ_ALL_APPID = "shlib.app.message.markread";
    public static final  Object DEVICE_REGISTER_APPID = "shlib.app.push.reg";
    public static final  Object UN_BIND_DEVICE_APPID = "shlib.app.push.regcancel";

    //消息状态 0 已读 1 未读 3 已删除
    public static final String MSG_READ = "0";
    public static final String MSG_UN_READ = "1";
    public static final String MSG_DEL = "2";
    //消息类型 0 公告 1个人
    public static final String MSG_TYPE_1 = "0";
    public static final String MSG_TYPE_2 = "1";


    //从哪个页面跳转到登录页面
    // 0，fragment1 1、读书证 2、我的 3 续借图书 4 收件箱
    public static final int GO_LOGIN_FROME_0 = 0;
    public static final int GO_LOGIN_FROME_1 = 1;
    public static final int GO_LOGIN_FROME_2 = 2;
    public static final int GO_LOGIN_FROME_3 = 3;
    public static final int GO_LOGIN_FROME_4 = 4;

    //intent code
    //首页消息
    public static final int REQUEST_CODE_FRAGMENT_MSG = 10000;
    public static final int RESULT_CODE_FRAGMENT_MSG = 10001;
    //首页续借图书
    public static final int REQUEST_CODE_BORROWED_BOOK = 10002;
    public static final int RESULT_CODE_BORROWED_BOOK = 10003;
    //读者证
    public static final int REQUEST_CODE_READER_CARD = 10004;
    public static final int RESULT_CODE_READER_CARD = 10005;
    //我的
    public static final int REQUEST_CODE_MINE = 10006;
    public static final int RESULT_CODE_MINE = 10007;
    //设置页面
    public static final int REQUEST_CODE_SETTING = 10008;
    public static final int RESULT_CODE_SETTING = 10009;

    //Method
    public static String METHON_NORMAL = "token_acquire";
    public static String METHON_REFRESH = "token_refresh";

    public static int UAT_ERR = 10012;

    //图书封面前缀
    public static final String BOOK_IMG_PREFIX = "http://218.1.116.99/Image/servlet/ImageServlet?bib=";

    //HTML前缀
    public static final String webview_pre = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\n" +
            "    <title>Document</title>\n" +
            "</head>\n" +
            "<body>";

    //HTML后缀
    public static final String webview_und = "</body>\n" +
            "</html>";

}
