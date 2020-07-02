package com.agile4j.bean.container

import com.agile4j.bean.container.component.AutoInjectByConstructorBean
import com.agile4j.bean.container.component.AutoInjectBySetterBean
import org.junit.Assert.assertNotNull
import org.junit.Test

class BeanAutoScanTest {

    @Test
    fun testAutoScan() {
        val yamlConfigPath = "bean/auto-scan-bean.yaml"
        val container = DefaultBeanContainer(yamlConfigPath)
        val autoInjectByConstructorBean = container.getBean("autoInjectByConstructorBean")
                as AutoInjectByConstructorBean
        val autoInjectBySetterBean = container.getBean("autoInjectBySetterBean")
                as AutoInjectBySetterBean
        assertNotNull(autoInjectByConstructorBean.autoInjectDao)
        assertNotNull(autoInjectBySetterBean.autoInjectDao)
    }

}