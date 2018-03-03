package com.zycus;
import java.util.Scanner;

public class AccountTest {

	public static int findNoOfAccounts(String sid){
		int greatest = Integer.MIN_VALUE;
		for (int i = 0; i < sid.length(); i++) {
			int value = greatest;
		    try {
		    	value = Integer.parseInt(String.valueOf(sid.charAt(i)));	
		    }catch(NumberFormatException e){
		    	continue;
		    }
		    greatest = Math.max(greatest, value);
		}
		return greatest;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to your Banking App");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Student ID: ");
		String  sid = sc.next();
		System.out.println("Student ID you entered is: " + sid);
		int noOfAccounts = findNoOfAccounts(sid);
		System.out.println(noOfAccounts);
		int[] accounts = new int[noOfAccounts];
		for(int i = 0; i < noOfAccounts; i++) {
			System.out.println("Enter the amount for Acc No " + (i + 1) + ": ");
			accounts[i] = sc.nextInt();
		}
	}
}
