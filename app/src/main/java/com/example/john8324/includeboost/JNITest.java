package com.example.john8324.includeboost;

/**
 * Created by john8324 on 15/10/21.
 */
public class JNITest {
    static {
        System.loadLibrary("ib");
    }
    private JNITest(){}
    public static native void test();
}
