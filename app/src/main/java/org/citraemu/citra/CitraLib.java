package org.citraemu.citra;

// Wrapper for native library

public class CitraLib {

    static {
        System.loadLibrary("Citra");
    }

    /**
     * @param width the current view width
     * @param height the current view height
     */
    public static native void init(int width, int height);
    public static native void step();
}
