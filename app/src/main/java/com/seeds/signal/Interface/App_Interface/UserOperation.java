package com.seeds.signal.Interface.App_Interface;

import com.seeds.signal.Entity.User;

import java.util.List;

public interface UserOperation {
    void getUsers(SmartRunnable<List<User>> runnable, int... id); //from server

    void deleteUsers(SmartRunnable<List<Integer>> runnable, int... id); //from server

    void editUser(SmartRunnable<Integer> runnable, int id, User newUser);//from server
}
