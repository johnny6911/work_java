package com.koitt.java.ch06;

import inheritance.access.Account;

public class TestAccess extends Account{
	
	public TestAccess(String name, int number) {
		super(name, number);
		//Date a = this.open;
	}

	public static void main(String[] args) {
		Account account = new Account();
		String name = account.name;
		//account.
	}
}
