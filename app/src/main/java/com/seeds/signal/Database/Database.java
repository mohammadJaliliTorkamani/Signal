package com.seeds.signal.Database;

import com.seeds.signal.Interface.App_Interface.DatabaseOperation;

public class Database implements DatabaseOperation {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }
}