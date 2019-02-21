package com.seeds.signal.Interface.App_Interface;

public interface ServerOperation {
    void getNumberOfUsers(SmartRunnable<Integer> runnable);

    void getLatestAppVersion(SmartRunnable<Integer> runnable);
}
