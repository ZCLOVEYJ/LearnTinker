package com.zhengchen.tinker;

//import android.app.Application;
//import android.content.Context;
//import android.content.Intent;
//
//import com.tencent.tinker.anno.DefaultLifeCycle;
//import com.tencent.tinker.lib.tinker.TinkerInstaller;
//import com.tencent.tinker.loader.app.DefaultApplicationLike;
//import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
// * Created by Administrator on 2017/3/2.
// */
//@SuppressWarnings("unused")
//@DefaultLifeCycle(application = "com.zhengchen.tinker.MyApplication", flags = ShareConstants.TINKER_ENABLE_ALL, loadVerifyFlag = false)
//public class MyApplicationLike extends DefaultApplicationLike {
//
//    private static final String TAG = "MyApplicationLike";
//
//    public MyApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
//        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
//    }
//
//    @Override
//    public void onBaseContextAttached(Context base) {
//        super.onBaseContextAttached(base);
//
//    }
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        TinkerInstaller.install(this);
//    }
//}
