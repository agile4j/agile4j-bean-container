package com.agile4j.bean.container.resource

import com.agile4j.utils.util.ClassUtil
import com.agile4j.bean.container.exception.BeanDefinitionException
import java.io.InputStream

class ClassPathResource(override val filePath: String,
                        private var classLoader: ClassLoader)
    : Resource {

    constructor(path: String) : this(path, ClassUtil.getDefaultClassLoader())

    override fun getInputStream(): InputStream {
        return this.classLoader.getResourceAsStream(this.filePath)
                ?: throw BeanDefinitionException(filePath + " cannot be opened")
    }
}