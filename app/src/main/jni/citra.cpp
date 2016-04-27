#include <jni.h>

#include "common/logging/log.h"
#include "common/logging/backend.h"
#include "common/logging/filter.h"

void init () {
    Log::Filter log_filter(Log::Level::Debug);
    Log::SetFilter(&log_filter);

    LOG_CRITICAL(Frontend, "UNIMPLEMENTED");

}
void setupGraphics(jint width, jint height) {
}

void renderFrame() {
}

extern "C" {
    JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_init(JNIEnv* env, jobject obj,  jint width, jint height);
    JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_step(JNIEnv* env, jobject obj);
};

JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_init(JNIEnv* env, jobject obj,  jint width, jint height) {
    init();
    setupGraphics(width, height);
}

JNIEXPORT void JNICALL Java_org_citraemu_citra_CitraLib_step(JNIEnv* env, jobject obj) {
    renderFrame();
}
