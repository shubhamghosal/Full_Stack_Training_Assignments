package com.app.dao;

import java.util.List;

import com.app.pojos.Accounts;
import com.app.pojos.BankUser;

public interface IUserDao {

	//user login
	BankUser validateUser(String email,String password);
	
	String addUser(BankUser user);
	
	List<BankUser> getAllUsers();
	
	String addAccount(Accounts account , BankUser user);

	String withdrawAmount(Integer uid, Integer bid, Double amount);

	String depositAmount(Integer id, Integer bid, Double amt);
}
