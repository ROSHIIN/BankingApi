package com.myproject.BankingApi.Repository;

import com.myproject.BankingApi.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Account,Integer> {

}
