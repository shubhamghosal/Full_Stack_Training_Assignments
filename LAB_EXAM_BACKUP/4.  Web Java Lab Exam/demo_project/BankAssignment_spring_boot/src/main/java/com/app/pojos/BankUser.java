package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bank_users")
public class BankUser extends BaseEntity {

	@Column(length = 20)
	private String name;

	@Column(length = 20, unique = true)
	private String email;

	@Column(length = 20, nullable = false)
	private String password;

	@Enumerated(EnumType.STRING)
	private Role role;


	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
	List<Accounts> accounts = new ArrayList<Accounts>();

	public BankUser() {
		System.out.println("In def constr : " + getClass().getName());
	}
	
	
	public BankUser(String name, String email, String password, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}

	
	
	@Override
	public String toString() {
		return "BankUser [id = "+getId()+" name=" + name + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}


	public void addAccount(Accounts acct) {

		accounts.add(acct);

		acct.setUser(this);
	}

	public void removeAccount(Accounts acct) {

		accounts.remove(acct);

		acct.setUser(null);

	}

}
