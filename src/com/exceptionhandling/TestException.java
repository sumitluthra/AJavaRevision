package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		try {
			testExceptions();
		} catch (IOException e) {
//			e = (IOException) new Exception("");
			e.printStackTrace();
		} 
		/*
		 * catch (FileNotFoundException fe) { fe.printStackTrace();
		 }*/
	}

	public static void testExceptions() throws IOException, FileNotFoundException {

	}
}
