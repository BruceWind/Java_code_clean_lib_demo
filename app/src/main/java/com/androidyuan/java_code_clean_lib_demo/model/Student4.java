package com.androidyuan.java_code_clean_lib_demo.model;

import org.immutables.value.Value;
import org.parceler.Parcel;

/**
 * Created by wei on 17-1-2.
 */

@Value.Immutable
@Parcel
public abstract class Student4 {


    public abstract int age();

    public abstract String name();


}
