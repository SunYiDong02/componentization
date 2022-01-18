package com.linda.componentization

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @description
 * @author Created by SunYiDong on 2022/1/14 10:43.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
        ARouter.openDebug()
        ARouter.openLog()
    }
}