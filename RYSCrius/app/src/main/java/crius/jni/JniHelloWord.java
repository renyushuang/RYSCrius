package crius.jni;

public class JniHelloWord {
    static {
        System.loadLibrary("helloJniLib");
    }

    public native String getNewString();
}
