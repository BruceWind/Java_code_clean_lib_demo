package com.androidyuan.java_code_clean_lib_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.androidyuan.java_code_clean_lib_demo.model.Student1;
import com.androidyuan.java_code_clean_lib_demo.model.Student2;
import com.androidyuan.java_code_clean_lib_demo.model.Student3;

public class AutoValueTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //test1
        Student1 s1=new Student1();
        s1.age=1;
        s1.name="wei";

        Student1 s1_c=new Student1();
        s1_c.age=1;
        s1_c.name="wei";

        //test2
        Student2 s2=new Student2(1,"wei");
        Student2 s2_c=new Student2(1,"wei");
        //test3
        Student3 s3=Student3.create(1,"wei");
        Student3 s3_c=Student3.create(1,"wei");


        toast(s1.equals(s1_c)+"");//false
        toast(s2.equals(s2_c)+"");//true
        toast(s3.equals(s3_c)+"");//true


    }



    private void toast(String str)
    {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

}
