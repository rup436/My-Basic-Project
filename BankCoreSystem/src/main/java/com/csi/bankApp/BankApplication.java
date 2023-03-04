package com.csi.bankApp;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		long AccNumber = 7040004214L;
		boolean done = true;
		String password = "password";
		long AccountBalance = 50000;
		long amount = 0;

		int otp, genratedOtp;

		System.out.println("\n please enter your AccNo and Password: ");
		Scanner scanner = new Scanner(System.in);
		do {
			long custAccountNumber = 0;
			custAccountNumber = scanner.nextLong();

			scanner.nextLine();

			String custPasswordString;
			custPasswordString = scanner.nextLine();
			if (AccNumber == custAccountNumber && password.equals(custPasswordString)) {
				System.out.println("Welcome to kamshet bank:");
				done = false;
			} else {
				System.out.println("password ani account number nit tak kutrya");

			}
		} while (done);

		do {

			System.out.println("\n Enter your choice : \n1. Deposit \n2.Withraw \n3.Transfer \n4.Logout");

			int custChoice = scanner.nextInt();

			switch (custChoice) {
			case 1:// Deposit
				System.out.println("\n before Deposit your account Balance is: " + AccountBalance);//50000
				System.out.println("\n Please enter amount for deposit money");//paise bhar

				amount = scanner.nextInt();//bharle

				AccountBalance += amount;// AccountBalnace = AccountBalance + amount;

				System.out.println("\n After Deposit account balance : " + amount);
				System.out.println("\n After deposit Account balance :"+AccountBalance);

				break;

			case 2:// Withraw
				System.out.println("\n Before withraw Account your Balance:" + AccountBalance);
				System.out.println("Enter amount for Withraw money: ");

				amount = scanner.nextLong();

				if (AccountBalance > amount) {

					AccountBalance -= amount;// AccountBalnace = AccountBalance - amount;
					System.out.println("\n your Amount withraw Succesfully");
					System.out.println("\n After Withraw Acc Balance:" + AccountBalance);
				} else {
					System.out.println("Insufficiant funds, please try again");
				}

				break;

			case 3:// transfer
				System.out.println("\n Before transfer Acc balance : " + AccountBalance);
				System.out.println("\n please enter amount for transfer: ");

				amount = scanner.nextInt();
				if (AccountBalance > amount) {

					otp = (int) ((Math.random() * 4000) + 2000);
					System.out.println("\n please enter your otp: " + otp);

					genratedOtp = scanner.nextInt();
					if (otp == genratedOtp) {
						AccountBalance -= amount;
						System.out.println("\n Amount transfer successfully");
						System.out.println("\n After transfer Total Account Balnace is:" + AccountBalance);
					} else {
						System.out.println("\n Invalid Otp");
					}

				} else {
					System.out.println("\n Insufficiant funds oopp sorry dear");
				}
				break;

			case 4:// Logout
				System.out.println("Logout Succesfully");
				System.exit(0);
				break;

			default:
			System.out.println("Inavlid choice");
				break;
			}

		} while (true);

	}

}
