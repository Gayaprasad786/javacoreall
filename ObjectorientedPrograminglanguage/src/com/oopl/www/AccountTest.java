package com.oopl.www;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account Aman = new Account("Aman Pandey", "12354", "Saving", 5000);
		Account Shubham = new Account("Shubham Tiwari", "12355", "Saving", 2000);
		// Aman.showAccountDetails("12354");
		// System.out.println();
		// Shubham.showAccountDetails("12355");
		Shubham.deposit(1000);
		Account.fundTransfer(Aman, Shubham, 500);
		Aman.showAccountDetails("12354");
		System.out.println();
		Shubham.showAccountDetails("12355");

	}

}
