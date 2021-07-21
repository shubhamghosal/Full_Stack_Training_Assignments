package pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/*id(inherited from BaseEntity) , type(enum:SAVING,CURRENT,FD,DMAT,LOAN), balance , transactionDate (Date) --use @Temporal annotation (refer to JPA docs)*/
@Entity
@Table(name = "bank_accts")
public class BankAccount extends BaseEntity {
	@Enumerated(EnumType.STRING)
	private AccType type;
	private double balance;
	@Temporal(TemporalType.DATE) //otherwise by default it chooses timestamp
	private Date transactionDate;
	//many to one , bi directional association
	//many side, child side, owning side
	@ManyToOne
	@JoinColumn(name = "vendors_id")
	private Vendor acctOwner;
	public BankAccount() {
		System.out.println("in bank acct ctor");
	}

	public BankAccount(AccType type, double balance, Date transactionDate) {
		super();
		this.type = type;
		this.balance = balance;
		this.transactionDate = transactionDate;
	}

	public AccType getType() {
		return type;
	}

	public void setType(AccType type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Vendor getAcctOwner() {
		return acctOwner;
	}

	public void setAcctOwner(Vendor acctOwner) {
		this.acctOwner = acctOwner;
	}

	@Override
	public String toString() {
		return "BankAccount: acct no " + getId() + "[type=" + type + ", balance=" + balance + ", transactionDate="
				+ transactionDate + "]";
	}

}
