package com.bihe0832.android.app

import android.provider.Settings
import android.view.View
import com.bihe0832.android.common.debug.item.DebugItemData
import com.bihe0832.android.common.debug.item.DebugTipsData
import com.bihe0832.android.common.debug.module.DebugCommonFragment
import com.bihe0832.android.common.debug.module.DebugDeviceFragment
import com.bihe0832.android.lib.adapter.CardBaseModule
import com.bihe0832.android.lib.utils.intent.IntentUtils

open class MainFragment : DebugCommonFragment() {

    override fun getDataList(): ArrayList<CardBaseModule> {
        return ArrayList<CardBaseModule>().apply {
            add(DebugTipsData("APPFactory的通用组件和工具"))
            add(DebugItemData("查看应用版本及环境", View.OnClickListener { showAPPInfo() }))
            add(DebugItemData("查看使用情况", View.OnClickListener { showUsedInfo() }))
            add(getDebugFragmentItemData("查看设备详细信息", DebugDeviceFragment::class.java))
            add(
                DebugItemData("打开开发者模式") {
                    IntentUtils.startSettings(context, Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
                },
            )
            add(
                DebugItemData("打开应用设置") {
                    IntentUtils.startAppDetailSettings(context)
                },
            )
            add(DebugItemData("简单测试函数", View.OnClickListener { testFunc() }))
            add(DebugItemData("通用测试预处理", View.OnClickListener { preTest(it) }))
        }
    }

    private fun preTest(itemView: View) {
    }

    private fun testFunc() {
    }
}
