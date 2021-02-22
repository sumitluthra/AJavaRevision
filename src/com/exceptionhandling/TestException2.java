package com.exceptionhandling;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException2 {

	public static void main(String[] args) {
		try {
			foo();
		} catch (IOException | JAXBException e) {
			//e = new Exception("");
			e.printStackTrace();
		}
		/*
		 * catch (JAXBException e) { e.printStackTrace(); }
		 */
		catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void foo() throws JAXBException,IOException {

	}
}