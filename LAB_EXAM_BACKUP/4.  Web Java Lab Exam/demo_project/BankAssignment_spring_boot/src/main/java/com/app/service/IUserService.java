package com.app.service;

import java.util.List;

import com.app.pojos.Accounts;
import com.app.pojos.BankUser;

public interface IUserService {

	//validate user
	BankUser validateUser(String email,String password);
	
	String addUser(BankUser user);

	List<BankUser> getAllUsers();
	
	String addAccount(Accounts account,BankUser user);
	
	String withdrawAmount(BankUser user, Integer bid, Double amount);

	String depositAmount(BankUser user, Integer bid, Double amt);
}
