package com.kk.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Maven Build Tool !! KK FUNDA !!! Today Date is:  " + getLocalCurrentDate());
		int a=10;
		int b=90;
		System.out.println("addition of two number is "+(a+b));

		System.out.println("welcome to KK FUNDA");
		System.out.println("====================");
		

	}

	private static Date getLocalCurrentDate() {
		String m = "KK FUNDA";
		return new Date();

	}

}
