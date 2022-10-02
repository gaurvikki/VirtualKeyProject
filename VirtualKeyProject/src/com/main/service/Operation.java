package com.main.service;

import java.util.Iterator;
import java.util.TreeSet;

import Storage.FileDomain;

public class Operation {

	FileDomain fileDomain = new FileDomain();
	Display display = new Display();
	TreeSet<String> fileDirectory = fileDomain.getDirectory();

	public void printDirectory() {
//		Iterator<String> itr = fileDirectory.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr);
//		}
		fileDirectory.forEach( element -> {
		    System.out.println("Printing directory list"+element);
		});
	}

	public void addToDirectory() {
		String fileName = display.readFromDisplay();
		fileDirectory.add(fileName);
		System.out.println("file/folder "+fileName+" added successfully in directory");
	}

	public void deleteFromDirectory() {
		String fileName = display.readFromDisplay();
		if (fileDirectory.remove(fileName)) {
			System.out.println("Successfully deleted");
		}else {
		System.out.println("FNF(File not found)");
		}
	}

	public void search() {
		String fileName = display.readFromDisplay();
		if(fileDirectory.contains(fileName)) {
			System.out.println("file found in directory");
		}else {
		System.out.println("File not found in directory");
		}
	}

}
