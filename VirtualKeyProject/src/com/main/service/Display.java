package com.main.service;

import java.util.Scanner;

import Storage.FileDomain;

public class Display {

	FileDomain fileDomain = new FileDomain();

	public void printFileOperations() {
		System.out.println("1.Add file/folder");
		System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Return back");
	}

	public void displayHomePage() {
		System.out.println("Welcome to Virtual Key Project");
		System.out.println("Developer :- Praveen Kumar");
		System.out.println("Choose below options :");
		System.out.println("1. View Directory");
		System.out.println("2.Option");
		System.out.println("3.Exit (Close Application)");
		System.out.println("Enter your choice: ");
	}

	public String readFromDisplay() {
		Scanner myObj = new Scanner(System.in);
		String fileName = myObj.nextLine();
		return fileName;
	}

}
