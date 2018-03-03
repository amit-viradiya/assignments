package com.zycus;

import java.util.ArrayList;

public class Account {
	double interest;

	public Account() {
		this.interest = 0;
	}

	public double interest(int amount) {
		if (amount > 0 && amount < 1001) {
			interest = 0;
		} else if (amount > 1000 && amount < 5001) {
			interest = (amount * 0.025);
		} else if (amount > 5000 && amount < 10001) {
			interest = (amount * 0.05);
		} else if (amount > 10000) {
			interest = (amount * 0.08);
		}
		return interest;

	}

	public int interestType(ArrayList<Double> interests) {
		int zeroInterestAccounts = 0;
		for (Double interest : interests) {
			if (interest == 0) {
				zeroInterestAccounts += 1;
			}
		}
		return zeroInterestAccounts;
		// code to determine accounts with no interest goes here
		// this is test comment
	}
}
