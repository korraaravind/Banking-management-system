package com.qsp.Banking_Managment_system.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qsp.Banking_Managment_system.dto.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {
	
	// Custom Query
    @Query("SELECT b FROM Bank b WHERE b.bankName = :bankName")
    Optional<Bank> findingByBankName(@Param("bankName") String bankName);

}
