package com.linda.module_common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.linda.module_base.constants.RouterPaths

@Route(path = RouterPaths.COMMON_ACTIVITY)
class CommonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
    }
}