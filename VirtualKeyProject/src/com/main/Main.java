package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.main.service.Display;
import com.main.service.Operation;
import com.main.service.UserOperations;

public class Main {
//
	public static void main(String[] args) {
		Display display = new Display();
		Operation operation = new Operation();
		UserOperations userOperations = new UserOperations();
		try {
			int val1 = 1;
			while (val1 != 0) {
				System.out.print("\u000c");
				System.out.print("\033[H\033[2J");
				display.displayHomePage();
				Scanner myObj = new Scanner(System.in);
				int val2 = myObj.nextInt();

				switch (val2) {
				case 1: System.out.print("\u000c");
					operation.printDirectory();
					break;
				case 2:System.out.print("\u000c"); 
					userOperations.doOperations();
					break;
				case 3:System.out.print("\u000c");
					System.out.println("Closing the Application: Bye..."); val1=0;
					break;
				default:
					System.out.println("You entered a wrong choice, please enter correct value");
					break;
				}
				System.out.print("\u000c");
			}
		} catch (InputMismatchException e) {
			System.out.println("Input value is not correct");
		}

	}

}
