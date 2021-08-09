package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class Accounts extends BaseEntity {
	
	@Column(name = "creation_date")
	private LocalDate creationDate;
	
	private Double balance=0.0;

	@Enumerated(EnumType.STRING)
	private AccountType type;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_id")
	private BankUser user;
	
	public Accounts() {
		System.out.println("in def cons of"+getClass().getName());
		balance=0.0;
	}
	
	public Accounts(LocalDate creationDate, Double balance, AccountType type) {
		super();
		this.creationDate = creationDate;
		this.balance = balance;
		this.type = type;
	}

	
	public Accounts(Integer bid) {
		super.setId(bid);
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = LocalDate.parse(creationDate);
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public BankUser getUser() {
		return user;
	}

	public void setUser(BankUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Accounts [creationDate=" + creationDate + ", balance=" + balance + ", type=" + type +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Accounts)
			return this.getId()==((Accounts) obj).getId();
		return false;
	}
	
}
