package com.agile4j.bean.container

import com.agile4j.bean.container.exception.BeanDefinitionException
import com.agile4j.bean.container.service.CustomService
import org.junit.Test

class BeanExceptionTest : BaseTest() {

    private val errXmlConfigPath = "XXX.xml"
    private val invalidBeanConfigPath = "bean/invalid-bean.xml"
    private val errBeanId = "invalidBean"

    @Test
    fun testBeanDefinitionExceptionCausedByClass() {
        thrown.expect(BeanDefinitionException::class.java)
        thrown.expectMessage("not found class com.lpcoder.agile.invalid.invalidBean")
        DefaultBeanContainer(invalidBeanConfigPath).getBean(errBeanId) as CustomService
    }

    @Test
    fun testBeanDefinitionExceptionCausedByConfFile() {
        thrown.expect(BeanDefinitionException::class.java)
        thrown.expectMessage("XXX.xml cannot be opened")
        DefaultBeanContainer(errXmlConfigPath).getBean(beanId) as CustomService
    }

}