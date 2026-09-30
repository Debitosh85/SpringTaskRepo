package com.java.main;

import java.util.Scanner;

import com.java.target.EgineFactory;

public class EngineMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EgineFactory e = new EgineFactory();
		System.out.println(
				"1.Diesle Engine"+"\n"+
				"2.Petrol Engine"+"\n"+
				"3.E20 Engine"
				);
		System.out.println("Enter your choice::");
		int c = sc.nextInt();
		
		switch(c) {
		case 1 ->
		   EgineFactory.getInstance("Diesel");
		   
		case 2 ->
		EgineFactory.getInstance("Petrol");
		
		case 3 ->
		EgineFactory.getInstance("E20");
		}
	}
}
