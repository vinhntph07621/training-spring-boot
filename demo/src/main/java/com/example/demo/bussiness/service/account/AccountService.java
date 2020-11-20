package com.example.demo.bussiness.service.account;

import com.example.demo.db.dto.account.AccountRequest;
import com.example.demo.db.dto.account.AccountResponse;
import com.example.demo.db.entities.account.Account;
import com.example.demo.db.respository.account.AccountRespository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRespository accountRespository;

    public AccountResponse create(AccountRequest request) {
        Account account = new Account();
        BeanUtils.copyProperties(request, account);
        accountRespository.save(account);
        return new AccountResponse(account);
    }

    public List<Account> getList(){

        return accountRespository.findAll();
    };

}
