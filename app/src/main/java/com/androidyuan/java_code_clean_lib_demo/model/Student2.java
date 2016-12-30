package com.androidyuan.java_code_clean_lib_demo.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wei on 16-12-30.
 * 一个完整的Student类  但是两个字段 就写了个 80行代码。。。。
 */
public class Student2 implements Parcelable {

    private int age;
    private String name;

    public Student2(int i, String n) {
        age=i;
        name=n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.age;
        hash = 31 * hash + (null == name ? 0 : name.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Student2)) return false;
        Student2 s = (Student2) o;
        if (s.age != s.age) return false;
        return s.name.equals(s.name);
    }


    //如下代码使用插件生成
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.age);
        dest.writeString(this.name);
    }

    protected Student2(Parcel in) {
        this.age = in.readInt();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<Student2> CREATOR = new Parcelable.Creator<Student2>() {
        @Override
        public Student2 createFromParcel(Parcel source) {
            return new Student2(source);
        }

        @Override
        public Student2[] newArray(int size) {
            return new Student2[size];
        }
    };
}
