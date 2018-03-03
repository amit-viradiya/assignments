package com.zycus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AccountTest {

	public static int findNoOfAccounts(String sid) {
		int greatest = Integer.MIN_VALUE;
		for (int i = 0; i < sid.length(); i++) {
			int value = greatest;
			try {
				value = Integer.parseInt(String.valueOf(sid.charAt(i)));
			} catch (NumberFormatException e) {
				continue;
			}
			greatest = Math.max(greatest, value);
		}
		return greatest;
	}

	public static void main(String[] args) {
		Account a = new Account();
		System.out.println("Welcome to your Banking App");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Student ID: ");
		String sid = sc.next();
		System.out.println("Student ID you entered is: " + sid);
		int noOfAccounts = findNoOfAccounts(sid);
		System.out.println(noOfAccounts);
		int[] accounts = new int[noOfAccounts];
		for (int i = 0; i < noOfAccounts; i++) {
			System.out.println("Enter the amount for Acc No " + (i + 1) + ": ");
			accounts[i] = sc.nextInt();
			System.out.println("The interest for account number " + (i + 1) + " is " + a.interest(accounts[i]));
		}
		double sumOfInterst = 0;
		ArrayList<Double> intrests = new ArrayList<>();
		for (int num : accounts) {
			double ba = a.interest(num);
			sumOfInterst += ba;
			intrests.add(ba);
		}
		System.out.println("----------Interest Details-----------");
		System.out.println("Total Interest : " + sumOfInterst);
		System.out.println("Lowest Interest: " + Collections.min(intrests));
		System.out.println("Highest Interest: " + Collections.max(intrests));
		System.out.println("Average Interest:" + (sumOfInterst / accounts.length));
		System.out.println("Number of accounts with no interest: " + a.interestType(intrests));
	}
}