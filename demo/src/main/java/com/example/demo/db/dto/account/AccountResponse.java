package com.example.demo.db.dto.account;

import com.example.demo.db.entities.account.Account;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class AccountResponse {
    private String username;
    private String password;
    private Integer status;

    public AccountResponse(String username, Integer status) {
        this.username = username;
        this.status = status;
    }

    public AccountResponse(Account account) {
        BeanUtils.copyProperties(account, this);
    }
    public AccountResponse(String username, String password, Integer status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }
}
