package com.zycus;

import java.util.ArrayList;

public class Account {
	double interest;

	public Account() {
		this.interest = 0;
	}

	// This function calculates interest for the given amount
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

	// This function determines accounts with no interest
	public int interestType(ArrayList<Double> interests) {
		int zeroInterestAccounts = 0;
		for (Double interest : interests) {
			if (interest == 0) {
				zeroInterestAccounts += 1;
			}
		}
		return zeroInterestAccounts;
	}
}
