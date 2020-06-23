package com.renyushuang.ryscrius;

public class JniHelloWord {
    static {
        System.loadLibrary("helloJniLib");
    }

    public native String getNewString();
}
