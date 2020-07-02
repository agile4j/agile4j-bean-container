package com.agile4j.bean.container.service

import com.agile4j.bean.container.dao.AccountDao
import com.agile4j.bean.container.dao.ItemDao

class CustomService {
    var accountDao: AccountDao? = null
    var itemDao: ItemDao? = null
    var author: String? = null
}
