package com.seeds.signal.Interface.App_Interface;

import com.seeds.signal.Entity.ApplicationKey;
import com.seeds.signal.Entity.ServerSimpleResponse;
import com.seeds.signal.Entity.Token;
import com.seeds.signal.Entity.User;

public interface AuthenticationOperation {
    void login(SmartRunnable<ApplicationKey> runnable, User user);

    void tokenExchange(SmartRunnable<Token> runnable, ApplicationKey applicationKey);

    void register(SmartRunnable<ServerSimpleResponse> runnable, User user);

    void getUsers(SmartRunnable<User> runnable, Token... tokens);  //from server

}
