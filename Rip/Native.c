#include <stdio.h>
#include <jni.h>
#include "Native.h"

JNIEXPORT void JNICALL Java_Native_helloWorld(JNIEnv *env, jobject thisObj)
{
	printf("Hello World!\n");
	return;
}
