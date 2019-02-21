package com.seeds.signal.Interface.App_Interface;

public interface GeneralOperation {
    String saveSetting(String key, String value, String table);

    String loadSetting(String key, String defaultValue, String table);

    void vibrate(long millis);

    void copyToClipBoard(String text);

    String getDayOfWeek(int dayOfWeek);
}
