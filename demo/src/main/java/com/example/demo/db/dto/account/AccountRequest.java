package com.example.demo.db.dto.account;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AccountRequest {
    private String username;
    private String password;
    private Integer status;
}
