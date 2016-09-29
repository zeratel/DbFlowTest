package com.lhf.test.dbflowtest.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * com.lhf.test.dbflowtest.db
 * Created by zeratel3000
 * on 2016 09 16/9/29 14 37
 * description
 */

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase {

    public static final String NAME = "AppDatabase"; // we will add the .db extension

    public static final int VERSION = 2;
}
