package com.agile4j.bean.container.component

import com.agile4j.bean.container.dao.AccountDao
import com.agile4j.bean.container.dao.ItemDao

class ConstructorBean(val accountDao: AccountDao,
                      val itemDao: ItemDao,
                      val version: Int) {

    constructor(accountDao: AccountDao, itemDao: ItemDao)
            : this(accountDao, itemDao, -1)
}