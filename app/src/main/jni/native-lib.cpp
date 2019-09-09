#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_lmgy_ndksample_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_lmgy_ndksample_NativeUtil_compressBitmap(JNIEnv *env, jclass clazz, jobject bit, jint w,
                                                  jint h, jint quality, jbyteArray file_name_bytes,
                                                  jboolean optimize) {
    // TODO: implement compressBitmap()
}