package com.agile4j.bean.container.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Bean(val id: String = "", val isSingleton: Boolean = true)