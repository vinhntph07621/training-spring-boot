package com.example.demo.controller.account;

import com.example.demo.bussiness.service.account.AccountService;
import com.example.demo.db.ApiConst;
import com.example.demo.db.dto.account.AccountRequest;
import com.example.demo.db.dto.account.AccountResponse;
import com.example.demo.db.entities.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping(ApiConst.ACCOUNT_URL)
    @ResponseBody
    public AccountResponse create(@RequestBody AccountRequest request) {
        return accountService.create(request);
    }

    @GetMapping(ApiConst.ACCOUNT_ALL_URL)
    @ResponseBody
    public List<Account> getList() {
        return accountService.getList();
    }
}
