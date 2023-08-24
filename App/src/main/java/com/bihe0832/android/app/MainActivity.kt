package com.bihe0832.android.app

import com.bihe0832.android.framework.ui.main.CommonRootActivity
import com.bihe0832.android.lib.router.annotation.APPMain

@APPMain
class MainActivity : CommonRootActivity() {

    override fun getRootFragmentClassName(): String {
        return MainFragment::class.java.name
    }

    override fun getTitleName(): String {
        return resources.getString(R.string.app_name)
    }
}
