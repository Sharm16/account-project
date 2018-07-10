package com.qa.account;

import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();
	
	public void add(int accountNumber, Account a) {
		hmap.put(accountNumber, a);
		
	}

	public void remove(int accountNumber) {
		hmap.remove(accountNumber);

	}

	public Account getHmapAccount(int i) {
		return hmap.get(i);
	}

	public HashMap<Integer, Account> getHmap() {
		return hmap;
	}
	
	
}
