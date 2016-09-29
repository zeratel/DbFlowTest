package com.lhf.test.dbflowtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lhf.test.dbflowtest.db.User;
import com.raizlabs.android.dbflow.sql.language.Delete;
import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> userList = new ArrayList<>();
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = (TextView) findViewById(R.id.tv);

        Delete.tables(User.class);

        initUser(userList);

        saveUser();

        getUser();

    }

    private void getUser() {
        List<User> partDbBeen = new Select().from(User.class).queryList();
        String temp = "";
        for (User u : partDbBeen) {
            temp += u.getUid() + ",";
        }
        mTv.setText(temp);
    }

    private void saveUser() {
        for (User user : userList) {
            user.save();
        }
    }

    private void initUser(List<User> userList) {
        for (int i = 0; i < 20; i++) {
            User user = new User("1" + i, "haha", "1830128320" + i, "www.baidu.com", i);
            userList.add(user);
        }
    }
}
