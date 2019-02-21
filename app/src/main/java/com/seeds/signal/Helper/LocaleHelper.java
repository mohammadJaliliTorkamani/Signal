package com.seeds.signal.Helper;

public class LocaleHelper {
    private static LocaleHelper instance;


    private LocaleHelper() {
    }

    public static LocaleHelper getInstance() {
        if (instance == null)
            instance = new LocaleHelper();
        return instance;
    }
}
