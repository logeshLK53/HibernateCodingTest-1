package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankAccount")
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bankId;
	@Column
	String accountId;

	public BankAccount(int bankId, String accountId) {
		super();
		this.bankId = bankId;
		this.accountId = accountId;
	}

	public BankAccount() {
		super();
	}

	public BankAccount(String accountId) {
		super();
		this.accountId = accountId;
	}

	public BankAccount(int bankId) {
		super();
		this.bankId = bankId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "BankAccount [bankId=" + bankId + ", accountId=" + accountId + "]";
	}

}
