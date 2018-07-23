package com.cg.mypaymentapp.repo;

import java.util.List;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.exception.InvalidInputException;

public interface WalletRepo {

	public boolean save(Customer customer) throws InvalidInputException;

	public Customer findOne(String mobileNo) throws InvalidInputException;

//	public void remove(String mobileNo);
	
	public void startTransaction();
	
	public void commitTransaction();

	public void update(Customer customer);

	public void addTransaction(Transactions transactions);

	public List<Transactions> getAllTransactions(String mobileNumber);
}
