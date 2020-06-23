package com.renyushuang.ryscrius;

import android.content.Context;
import android.icu.text.PluralRules;

public class GetJavaPropertyFromNativeC {


    static {
        System.loadLibrary("NativeCGetJavaProperty");
    }

    private Context context;
    private int numberInJava = 200;

    public GetJavaPropertyFromNativeC() {
        nativeInit();
    }

    private native void nativeInit();

    public native void nativeBusiness();


}
