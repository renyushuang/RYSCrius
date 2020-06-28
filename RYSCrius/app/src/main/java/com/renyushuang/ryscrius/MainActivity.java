package com.renyushuang.ryscrius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import crius.jni.CallJavaMethodFromNativeCode;
import crius.jni.JniHelloWord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewById = findViewById(R.id.hello_world);
        viewById.setText(new JniHelloWord().getNewString());

        CallJavaMethodFromNativeCode callJavaMethodFromNativeCode = new CallJavaMethodFromNativeCode();
        callJavaMethodFromNativeCode.nativeExecution();
        callJavaMethodFromNativeCode.nativeStaticExcution();


    }
}