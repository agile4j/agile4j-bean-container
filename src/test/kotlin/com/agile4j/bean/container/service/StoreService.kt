package com.agile4j.bean.container.service

import com.agile4j.bean.container.annotation.AutoInject
import com.agile4j.bean.container.annotation.Bean
import com.agile4j.bean.container.dao.AutoInjectDao

@Bean
class StoreService {

    @AutoInject
    var autoInjectDao: AutoInjectDao? = null

    fun placeOrder() = println("place order")

}