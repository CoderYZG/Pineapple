package pres.yzg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pres.yzg.pojo.Account;
import pres.yzg.service.AccountService;

import java.util.List;

/**
 * @author 尹志刚
 * @date 2020/6/8 17:08
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "list";
    }
}
