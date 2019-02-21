package com.seeds.signal.Helper;

import android.content.Context;

import com.seeds.signal.Entity.ApplicationKey;
import com.seeds.signal.Entity.ServerSimpleResponse;
import com.seeds.signal.Entity.Token;
import com.seeds.signal.Entity.User;
import com.seeds.signal.Interface.App_Interface.AuthenticationOperation;
import com.seeds.signal.Interface.App_Interface.SmartRunnable;
import com.seeds.signal.Interface.App_Interface.UserOperation;

import java.util.List;

public class UserHelper implements AuthenticationOperation, UserOperation {
    private static UserHelper instance;
    private Context context;

    private UserHelper(Context context) {
        this.context = context;
    }

    public static UserHelper getInstance(Context context) {
        if (instance == null)
            instance = new UserHelper(context);
        return instance;
    }

    @Override
    public void login(SmartRunnable<ApplicationKey> runnable, User user) {

    }

    @Override
    public void tokenExchange(SmartRunnable<Token> runnable, ApplicationKey applicationKey) {

    }

    @Override
    public void register(SmartRunnable<ServerSimpleResponse> runnable, User user) {

    }

    @Override
    public void getUsers(SmartRunnable<User> runnable, Token... tokens) {

    }

    @Override
    public void getUsers(SmartRunnable<List<User>> runnable, int... id) {

    }

    @Override
    public void deleteUsers(SmartRunnable<List<Integer>> runnable, int... id) {

    }

    @Override
    public void editUser(SmartRunnable<Integer> runnable, int id, User newUser) {

    }
}
