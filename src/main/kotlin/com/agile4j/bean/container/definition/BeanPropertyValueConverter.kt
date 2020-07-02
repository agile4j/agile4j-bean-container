package com.agile4j.bean.container.definition

import com.agile4j.bean.container.BeanContainer
import com.agile4j.bean.container.definition.BeanPropertyValueType.BASIC_TYPE
import com.agile4j.bean.container.definition.BeanPropertyValueType.RUNTIME_BEAN_REFERENCE_TYPE

class BeanPropertyValueConverter(private val container: BeanContainer) {

    fun convert(value: BeanPropertyValue): Any = when (value.type) {
        RUNTIME_BEAN_REFERENCE_TYPE -> this.container.getBean(value.value)
        BASIC_TYPE -> value.value
    }

}