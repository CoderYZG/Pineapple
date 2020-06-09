package pres.yzg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pres.yzg.dao.AccountDAO;
import pres.yzg.pojo.Account;
import pres.yzg.service.AccountService;

import java.util.List;

/**
 * @author 尹志刚
 * @date 2020/6/8 17:04
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;
    public List<Account> findAll() {
        List<Account> list = accountDAO.findAll();
        return list;
    }

    public void addAccount(Account account) {
        accountDAO.addAccount(account);
    }
}
