package com.lhf.test.dbflowtest.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * com.lhf.test.dbflowtest.db
 * Created by zeratel3000
 * on 2016 09 16/9/29 14 30
 * description
 */
@Table(database = AppDatabase.class, name = "Userser")
public class User extends BaseModel {

    public User() {
    }

    public User(String uid, String name, String phone, String headImage, int age) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.headImage = headImage;
        this.age = age;
    }

    //判断严格
    @PrimaryKey(autoincrement = true)
    private int id;
//    (defaultValue = "55")
    @Column
    private String uid;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String headImage;
    @Column
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
