package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // mandatory annotation
@Table(name = "vendor_table")
public class Vendor extends BaseEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 20)
	private String name;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(name = "reg_amount")
	private double regAmount;
	@Column(name = "reg_date")
	private LocalDate regDate;
	// one to many, bi dir association between Vendor 1 <-----> BA
	// Vendor : one , parent , parent
	@OneToMany(mappedBy = "acctOwner", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<BankAccount> accounts = new ArrayList<>();

	public Vendor() {
		super();
	}

	public Vendor(String name, String email, String password, double regAmount, LocalDate regDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.regDate = regDate;
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

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	// convenience/helper methods
	public void addAccount(BankAccount acct) {
		// vendor ---> bank acct
		accounts.add(acct);
		// bank acct ---> Vendor
		acct.setAcctOwner(this);
	}

	public void removeAccount(BankAccount acct) {
		// X ---> bank acct
		accounts.remove(acct);
		// X ---> Vendor
		acct.setAcctOwner(null);
	}

	@Override
	public String toString() {
		return "Vendor [Id=" + super.getId() + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", regAmount=" + regAmount + ", regDate=" + regDate + "]";
	}

}
