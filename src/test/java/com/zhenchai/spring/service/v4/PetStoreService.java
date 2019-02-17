package com.zhenchai.spring.service.v4;

import com.zhenchai.spring.beans.factory.annotation.Autowired;
import com.zhenchai.spring.dao.v4.AccountDao;
import com.zhenchai.spring.dao.v4.ItemDao;
import com.zhenchai.spring.stereotype.Component;

/**
 * Created by zhenchai on 2019/2/17 .
 * Description:
 */
@Component(value="petStore")
public class PetStoreService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private ItemDao itemDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }
}
