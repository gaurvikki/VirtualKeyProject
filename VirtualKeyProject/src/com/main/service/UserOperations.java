package com.main.service;

import java.util.Scanner;

public class UserOperations {
	Display display = new Display();
	Operation operation = new Operation();
     
	public void doOperations() {
		display.printFileOperations();
		System.out.println("Enter value:");
		Scanner myObj = new Scanner(System.in);
		int val1 = myObj.nextInt();
		int returnVal = 1;
		while (returnVal != 0) {
			switch (val1) {
			case 1:
				operation.addToDirectory();
				returnVal = 0;
				break;
			case 2:
				operation.deleteFromDirectory();
				returnVal = 0;
				break;
			case 3:
				operation.search();
				returnVal = 0;
				break;
			case 4:
				System.out.println("Returning back to home page");
				returnVal = 0;
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
		}
		
	}
	public void printDirectoryList() {
		operation.printDirectory();
	}
}
