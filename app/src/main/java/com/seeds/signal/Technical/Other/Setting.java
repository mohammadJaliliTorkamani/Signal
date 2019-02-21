package com.seeds.signal.Technical.Other;

import android.content.Context;

import com.seeds.signal.Interface.App_Interface.GeneralOperation;

public final class Setting implements GeneralOperation {
    private static Setting instance;
    private Context context;

    private Setting(Context context) {
        this.context = context;
    }

    public static Setting getInstance(Context context) {
        if (instance == null)
            instance = new Setting(context);
        return instance;
    }

    @Override
    public String saveSetting(String key, String value, String table) {
        return null;
    }

    @Override
    public String loadSetting(String key, String defaultValue, String table) {
        return null;
    }

    @Override
    public void vibrate(long millis) {

    }

    @Override
    public void copyToClipBoard(String text) {

    }

    @Override
    public String getDayOfWeek(int dayOfWeek) {
        return null;
    }
}
