package com.agile4j.bean.container

import org.junit.Before
import org.junit.Rule
import org.junit.rules.ExpectedException

open class BaseTest {

    @get:Rule
    val thrown: ExpectedException = ExpectedException.none()

    protected val notSingletonBeanId = "notSingletonBean"
    protected val beanId = "customService"
    protected val beanClassName = "com.agile4j.bean.container.service.CustomService"

    protected var containerOfYAML: BeanContainer? = null
    protected var containerOfXML: BeanContainer? = null

    private val yamlConfigPath = "bean/agile-bean.yaml"
    private val xmlConfigPath = "bean/agile-bean.xml"

    @Before
    fun before() {
        containerOfYAML = DefaultBeanContainer(yamlConfigPath)
        containerOfXML = DefaultBeanContainer(xmlConfigPath)
    }

}