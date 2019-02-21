package com.seeds.signal.Server;

import android.content.Context;

import com.seeds.signal.Interface.App_Interface.ServerOperation;
import com.seeds.signal.Interface.App_Interface.SmartRunnable;

public class Server implements ServerOperation {
    private static Server instance;
    private Context context;

    private Server(Context context) {
        this.context = context;
    }

    public static Server getInstance(Context context) {
        if (instance == null)
            instance = new Server(context);
        return instance;
    }

    @Override
    public void getNumberOfUsers(SmartRunnable<Integer> runnable) {

    }

    @Override
    public void getLatestAppVersion(SmartRunnable<Integer> runnable) {

    }
}
