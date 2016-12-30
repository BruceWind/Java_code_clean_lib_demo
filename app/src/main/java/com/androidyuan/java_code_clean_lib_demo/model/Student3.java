package com.androidyuan.java_code_clean_lib_demo.model;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by wei on 16-12-30.
 */
@AutoValue
public abstract class Student3 implements Parcelable{

    public abstract int age();

    public abstract String name();

    public static Student3 create(int age,String name){
        return new AutoValue_Student3(age,name);//这里 可能会报错 不要在意 会让你编译通过
    }
}
