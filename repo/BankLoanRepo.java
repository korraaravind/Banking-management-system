package com.qsp.Banking_Managment_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Banking_Managment_system.dto.BankLoans;

public interface BankLoanRepo extends JpaRepository<BankLoans, Integer>{

}
