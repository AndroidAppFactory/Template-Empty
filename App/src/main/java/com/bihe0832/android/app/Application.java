package com.bihe0832.android.app;


import com.bihe0832.android.framework.BaseApplication;

public class Application extends BaseApplication {

    @Override
    protected boolean isDebug() {
        return true;
    }

    @Override
    protected boolean isOfficial() {
        return false;
    }

    @Override
    protected String versionTag() {
        return "Tag_ZIXIE_1.0.0_1";
    }

    @Override
    protected boolean skipPrivacy() {
        return !isOfficial();
    }

}
