package com.bihe0832.android.app

import android.provider.Settings
import android.view.View
import com.bihe0832.android.common.debug.device.DebugDeviceFragment
import com.bihe0832.android.common.debug.item.getDebugItem
import com.bihe0832.android.common.debug.item.getTipsItem
import com.bihe0832.android.common.debug.module.DebugCommonFragment
import com.bihe0832.android.lib.adapter.CardBaseModule
import com.bihe0832.android.lib.utils.intent.IntentUtils

open class MainFragment : DebugCommonFragment() {

    override fun getDataList(): ArrayList<CardBaseModule> {
        return ArrayList<CardBaseModule>().apply {
            add(getTipsItem("APPFactory的通用组件和工具"))
            add(getDebugItem("查看应用版本及环境", View.OnClickListener { showAPPInfo() }))
            add(getDebugItem("查看使用情况", View.OnClickListener { showUsedInfo() }))
            add(getDebugFragmentItemData("查看设备详细信息", DebugDeviceFragment::class.java))
            add(
                getDebugItem("打开开发者模式") {
                    IntentUtils.startSettings(
                        context,
                        Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
                    )
                },
            )
            add(
                getDebugItem("打开应用设置") {
                    IntentUtils.startAppDetailSettings(context)
                },
            )
            add(getDebugItem("简单测试函数", View.OnClickListener { testFunc() }))
            add(getDebugItem("通用测试预处理", View.OnClickListener { preTest(it) }))
        }
    }

    private fun preTest(itemView: View) {
    }

    private fun testFunc() {
    }
}
