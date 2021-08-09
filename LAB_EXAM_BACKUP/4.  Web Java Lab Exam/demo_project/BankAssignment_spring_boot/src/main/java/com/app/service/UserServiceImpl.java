package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.Accounts;
import com.app.pojos.BankUser;

@Service // to tell SC : class holds business logic
@Transactional // manage transactions
public class UserServiceImpl implements IUserService {

	// UserServiceImpl dependent on UserDao
	@Autowired
	private IUserDao userDao;

	@Override
	public BankUser validateUser(String email, String password) {

		System.out.println("In service : " + email + " : " + password);
		// invoke dao's method
		return userDao.validateUser(email, password);

	}

	@Override
	public String addUser(BankUser user) {
		return userDao.addUser(user);
	}

	@Override
	public List<BankUser> getAllUsers() {

		return userDao.getAllUsers();
	}

	@Override
	public String addAccount(Accounts account, BankUser user) {
		return userDao.addAccount(account, user);
	}

	@Override
	public String withdrawAmount(BankUser user, Integer bid, Double amount) {

		String mesg = userDao.withdrawAmount(user.getId(), bid, amount);

		
		Accounts acct2 = new Accounts(bid);

		Integer index = user.getAccounts().indexOf(acct2);

		if (index == -1) {
			return "Deposit unsuccessfull...NO bank acct found...";
		}

		Accounts acct = user.getAccounts().get(index);

		if(acct.getBalance() < amount) {
			return "Insufficient Balance...";
		}
		
		acct.setBalance(acct.getBalance() - amount);
	
		return mesg;
	}

	@Override
	public String depositAmount(BankUser user, Integer bid, Double amt) {

		String mesg = userDao.depositAmount(user.getId(), bid, amt);
		
		Accounts acct2 = new Accounts(bid);

		Integer index = user.getAccounts().indexOf(acct2);

		if (index == -1) {
			return "Deposit unsuccessfull...NO bank acct found...";
		}

		Accounts acct = user.getAccounts().get(index);

		acct.setBalance(acct.getBalance() + amt);

		return mesg;
		
	}
}
