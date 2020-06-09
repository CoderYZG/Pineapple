package pres.yzg.service;

import pres.yzg.pojo.Account;

import java.util.List;

/**
 * @author 尹志刚
 * @date 2020/6/8 17:03
 */
public interface AccountService {
    List<Account> findAll();

    void addAccount(Account account);
}
