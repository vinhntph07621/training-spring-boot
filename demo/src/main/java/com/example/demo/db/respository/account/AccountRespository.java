package com.example.demo.db.respository.account;

import com.example.demo.db.entities.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRespository extends JpaRepository<Account, Integer> {

}
