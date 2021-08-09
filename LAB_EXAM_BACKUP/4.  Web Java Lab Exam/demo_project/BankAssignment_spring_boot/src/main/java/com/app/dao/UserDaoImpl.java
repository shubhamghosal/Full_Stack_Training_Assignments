package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Accounts;
import com.app.pojos.BankUser;
import com.app.pojos.Role;

@Repository // to tell SC : class contains data access logic
public class UserDaoImpl implements IUserDao {

	// dependency of DAO : sessionFactory
	// @Autowired //get dependencies from Spring container
	// private SessionFactory sf;

	// SessionFactory is Hibernate specific and not supported in Spring boot so we
	// have to replace Session by its super type i.e. EntityManager which is JPA
	// specific

	// dependency of dao : javax.persistence (super i/f of org.hibernate.session)
	@Autowired
	private EntityManager manager; // EntityManager is super type of session

	@Override
	public BankUser validateUser(String email, String password) {

		String jqpl = "select u from BankUser u where u.email=:email and u.password=:password";
		BankUser singleResult = manager.createQuery(jqpl, BankUser.class).setParameter("email", email)
				.setParameter("password", password).getSingleResult();

		singleResult.getAccounts().size();

		return singleResult;
	}

	@Override
	public String addUser(BankUser user) {

		manager.persist(user);
		return "User added successfully...";
	}

	@Override
	public List<BankUser> getAllUsers() {

		String jqpl = "select u from BankUser u where u.role=:role";

		return manager.createQuery(jqpl, BankUser.class).setParameter("role", Role.USER).getResultList();

	}

	@Override
	public String addAccount(Accounts account, BankUser user) {
		// manager.persist(account);

		BankUser user2 = manager.find(BankUser.class, user.getId());
		user2.addAccount(account);
		manager.merge(user2);
		user.addAccount(account);

		return "Account Created!!";
	}

	@Override
	public String withdrawAmount(Integer uid, Integer bid, Double amount) {

		System.out.println("In withdrawAmount...");
		// get user
		BankUser user = manager.find(BankUser.class, uid);
		// get account from users acct id
		// Accounts acct = manager.find(Accounts.class, bid);

		Accounts acct2 = new Accounts(bid);
		
		Integer index = user.getAccounts().indexOf(acct2);
		
		if (index == -1) {
			return "Deposit unsuccessfull...NO bank acct found...";
		}

	
		Accounts acct = user.getAccounts().get(index);
		
		if(acct.getBalance() < amount) {
			return "Insufficient Balance";
		}
		
		acct.setBalance(acct.getBalance() - amount);

		manager.merge(user);

		return "Withdraw success : " + amount;
	}

	@Override
	public String depositAmount(Integer id, Integer bid, Double amt) {

		System.out.println("In depositAmount...");

		// get user
		BankUser user = manager.find(BankUser.class, id);
		// get account from users acct id
		// Accounts acct = manager.find(Accounts.class, bid);

		Accounts acct2 = new Accounts(bid);

		Integer index = user.getAccounts().indexOf(acct2);

		if (index == -1) {
			return "Deposit unsuccessfull...NO bank acct found...";
		}

		Accounts acct = user.getAccounts().get(index);

		acct.setBalance(acct.getBalance() + amt);

		manager.merge(user);

		return "Deposit success : " + amt;
	}
}
