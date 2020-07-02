package com.agile4j.bean.container.aspect

import java.lang.reflect.Method

abstract class AbstractAspect(val order: Int = 1,
                                    val methodMatcher: (Method) -> Boolean) {
    abstract fun proceed(context: AspectContext): Any
}