package com.zhenchai.spring.service.v2;

import com.zhenchai.spring.dao.v2.AccountDao;
import com.zhenchai.spring.dao.v2.ItemDao;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description:
 */
public class PetStoreService {

    private AccountDao accountDao;
    private ItemDao itemDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public ItemDao getItemDao() {
        return itemDao;
    }
    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
