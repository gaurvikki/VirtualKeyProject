package com.main.service;

import java.util.TreeSet;

import Storage.FileDomain;

public class Operation {

	FileDomain fileDomain = new FileDomain();
	Display display = new Display();
	TreeSet<String> fileDirectory = fileDomain.getDirectory();

	public void printDirectory() {
		System.out.println("Existing File directory List:");
		fileDirectory.forEach( element -> {
		    System.out.println(element);
		});
	}

	public void addToDirectory() {
		String fileName = display.readFromDisplay();
		fileDirectory.add(fileName);
		System.out.println("file/folder "+fileName+" added successfully in directory\n");
	}

	public void deleteFromDirectory() {
		String fileName = display.readFromDisplay();
		if (fileDirectory.remove(fileName)) {
			System.out.println("Successfully deleted\n");
		}else {
		System.out.println("FNF(File not found)\n");
		}
	}

	public void search() {
		String fileName = display.readFromDisplay();
		if(fileDirectory.contains(fileName)) {
			System.out.println("file found in directory\n");
		}else {
		System.out.println("File not found in directory\n");
		}
	}

}
