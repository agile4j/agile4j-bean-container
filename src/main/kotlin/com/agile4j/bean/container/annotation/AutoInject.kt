package com.agile4j.bean.container.annotation

@Target(AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
// todo: 自定义bean_id
annotation class AutoInject