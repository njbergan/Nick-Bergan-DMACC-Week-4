package com;

import java.io.FileNotFoundException;

public class Test_Of_Demo {

	public static void main(String[] args) {

		try {
			com.jOptionPane_ToFile.main(null);
		} catch (FileNotFoundException error) {
			error.printStackTrace();
			System.out.println("failed");
		}

	}

}
