package com.qsp.Banking_Managment_system.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankLoans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private String loanName;
	private String bankName;
	private String loan_number;
	private double max_loan_amount;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLoan_number() {
		return loan_number;
	}

	public void setLoan_number(String loan_number) {
		this.loan_number = loan_number;
	}

	public double getMax_loan_amount() {
		return max_loan_amount;
	}

	public void setMax_loan_amount(double max_loan_amount) {
		this.max_loan_amount = max_loan_amount;
	}

}
