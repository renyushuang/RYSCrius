package crius.jni;

import android.util.Log;

public class CallJavaMethodFromNativeCode {
    private static final String TAG = "CallJavaMethodFromNativ";

    static {
        System.loadLibrary("NativeCodeCallJavaMethod");
    }

    public CallJavaMethodFromNativeCode() {
        nativeInit();
    }

    public void setMethodByNativeCode(int value) {
        Log.i(TAG, "setMethodByNativeCode: value = " + value);
    }

    public static void setStaticMethodByNativeCode(int value) {
        Log.i(TAG, "setStaticMethodByNativeCode: value = " + value);
    }

    // C 本地代码初始化方法
    private native void nativeInit();

    // 本地C代码设置非静态方法
    public native void nativeExecution();

    // 本地C代码设置静态方法
    public native void nativeStaticExcution();

}
