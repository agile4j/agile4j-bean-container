package com.agile4j.bean.container.component

import com.agile4j.bean.container.dao.AutoInjectDao
import com.agile4j.bean.container.annotation.AutoInject
import com.agile4j.bean.container.annotation.Bean

@Bean
class AutoInjectByConstructorBean @AutoInject constructor(val autoInjectDao: AutoInjectDao)