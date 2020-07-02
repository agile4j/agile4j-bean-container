package com.agile4j.bean.container.exception

open class BeanException(msg: String, e: Throwable? = null)
    : RuntimeException(msg, e)

