#include <jni.h>

void setupGraphics(jint width, jint height) {
}

void renderFrame() {
}

extern "C" {
    JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_init(JNIEnv* env, jobject obj,  jint width, jint height);
    JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_step(JNIEnv* env, jobject obj);
};

JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_init(JNIEnv* env, jobject obj,  jint width, jint height) {
    setupGraphics(width, height);
}

JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_step(JNIEnv* env, jobject obj) {
    renderFrame();
}
