package com.linda.module_main

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.linda.module_base.constants.RouterPaths

class MainActivity : AppCompatActivity() {
    private var mTvGoTo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)
        initView()
    }

    private fun initView() {
        ARouter.getInstance().inject(this)
        mTvGoTo = findViewById(R.id.home_tvGoTo)
        mTvGoTo?.setOnClickListener {
            println("跳转测试1")
            Log.d("组件化", "跳转测试1")
            goToCommonModule()
            Log.d("组件化", "跳转测试2")
        }
    }

    private fun goToCommonModule() {
        ARouter.getInstance().build(RouterPaths.COMMON_ACTIVITY)
            .navigation()
    }
}