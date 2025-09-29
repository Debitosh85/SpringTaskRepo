package com.nit.spring;

import java.util.Scanner;

public class Test {
	
	public Test() {
		System.out.println("Hey Configuration going to happen using javaConfiguration");
	}
	
	public void factorial() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no to find Factorial:");
		int num = sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of"+num+"is"+fact);
		sc.close();
	}
	
	@Override
	public String toString() {
		return "Return Something to avoid printing @63454747(hashcode)";
	}

}
