package com.agile4j.bean.container.aspect

abstract class MatchByAnnotationAspect(order: Int = 1,
                                             classAnnotationClass: Class<out Annotation>,
                                             methodAnnotationClass: Class<out Annotation>)
    : BaseAspect(order,
        { method ->
            method.declaringClass.isAnnotationPresent(classAnnotationClass)
                    && method.isAnnotationPresent(methodAnnotationClass)
        })