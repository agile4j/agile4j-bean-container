package com.agile4j.bean.container

import com.agile4j.bean.container.aspect.AbstractAspect
import com.agile4j.bean.container.definition.BeanDefinition

// todo : bean生命周期的管理
// todo : 循环依赖的检查
interface BeanContainer {
    fun getBean(beanId: String): Any
    fun getBeanDefinition(beanId: String): BeanDefinition
    fun getBeanClass(beanId: String): Class<*>
    fun getBeanClassLoader(): ClassLoader
    fun getBeanDefinitions(): Set<BeanDefinition>
    fun getAspects(): Set<AbstractAspect>
}