package it.tjeridi.composedfsample

import android.text.TextUtils
import androidx.compose.foundation.layout.PaddingValues
import java.lang.reflect.Method
import java.lang.reflect.Modifier

fun findMethodByReflection(classMethod: Class<*>?, methodName: String): Method? {
    return try {
        if (!TextUtils.isEmpty(methodName)) {
            classMethod?.let { clazz ->
                clazz.methods.find { it.name.equals(methodName) && Modifier.isStatic(it.modifiers) }
            } ?: run {
                null
            }
        } else {
            null
        }
    }catch (e:Throwable){
        null
    }
}

fun loadClassByReflection(className: String): Class<*>? {
    return try {
        val classLoader = ::loadClassByReflection.javaClass.classLoader
        classLoader?.loadClass(className)
    } catch (e: Throwable) {
        null
    }
}

fun invokeMethod(method: Method, obj: Any, vararg args: Any): Boolean {
    return try {
        method.invoke(obj,*(args))
        true
    } catch (e: Throwable) {
        false
    }
}